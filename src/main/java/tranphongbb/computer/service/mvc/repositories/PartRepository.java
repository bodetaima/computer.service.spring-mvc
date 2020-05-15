package tranphongbb.computer.service.mvc.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tranphongbb.computer.service.mvc.entity.Part;

public interface PartRepository extends JpaRepository<Part, Integer>, SearchRepository {

    @Query(value = " FROM Part p " +
            "left join fetch p.partType",
            countQuery = " select count(p) from Part p")
    Page<Part> findAllWithPaging(Pageable pagable);

    @Override
    Page<Part> searchPart(Pageable pageable, String type, String query);
}
