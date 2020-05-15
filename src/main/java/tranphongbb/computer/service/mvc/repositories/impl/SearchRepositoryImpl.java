package tranphongbb.computer.service.mvc.repositories.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import tranphongbb.computer.service.mvc.entity.Part;
import tranphongbb.computer.service.mvc.repositories.SearchRepository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class SearchRepositoryImpl implements SearchRepository {

    private final EntityManager em;

    @Override
    public Page<Part> searchPart(Pageable pageable, String type, String query) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Part> cq = cb.createQuery(Part.class);
        Root<Part> partRoot = cq.from(Part.class);
        partRoot.fetch("partType", JoinType.LEFT);

        List<Predicate> full = new ArrayList<>();

        if (!"".equals(type)) {
            full.add(cb.equal(partRoot.get("partType").get("type"), type));
        }

        if (!"".equals(query)) {
            full.add(cb.like(cb.upper(partRoot.get("name")), "%" + query.toUpperCase() + "%"));
        }

        cq.select(partRoot).distinct(true).where(full.toArray(new Predicate[0]));

        TypedQuery<Part> typedQuery = em.createQuery(cq);
        List<Part> parts = new ArrayList<>(typedQuery.getResultList());

        return new PageImpl<>(parts, pageable, parts.size());
    }
}
