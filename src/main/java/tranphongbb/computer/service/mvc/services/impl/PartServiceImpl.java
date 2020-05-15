package tranphongbb.computer.service.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tranphongbb.computer.service.mvc.entity.Part;
import tranphongbb.computer.service.mvc.repositories.PartRepository;
import tranphongbb.computer.service.mvc.services.PartService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PartServiceImpl implements PartService {

    private final PartRepository repo;

    @Override
    public List<Part> findAll() {
        return repo.findAll();
    }

    @Override
    public Part findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Part> saveAll(List<Part> parts) {
        return repo.saveAll(parts);
    }

    @Override
    public Part save(Part part) {
        return repo.save(part);
    }

    @Override
    public Part delete(Part part) {
        if (part != null) {
            part.setDeleted(true);
            return repo.save(part);
        } else {
            return null;
        }
    }

    @Override
    public Part deleteById(int id) {
        Part byId = findById(id);
        if (byId != null) {
            byId.setDeleted(true);
            return repo.save(byId);
        } else {
            return null;
        }
    }

    @Override
    public Page<Part> findAllWithPaging(Pageable pageable) {
        return repo.findAllWithPaging(pageable);
    }

    @Override
    public Page<Part> searchPart(Pageable pageable, String type, String query) {
        return repo.searchPart(pageable, type, query);
    }
}
