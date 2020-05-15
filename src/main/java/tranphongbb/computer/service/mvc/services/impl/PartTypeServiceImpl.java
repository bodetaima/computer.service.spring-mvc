package tranphongbb.computer.service.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tranphongbb.computer.service.mvc.entity.PartType;
import tranphongbb.computer.service.mvc.repositories.PartTypeRepository;
import tranphongbb.computer.service.mvc.services.PartTypeService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PartTypeServiceImpl implements PartTypeService {

    private final PartTypeRepository repo;

    @Override
    public List<PartType> findAll() {
        return repo.findAll();
    }

    @Override
    public PartType findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<PartType> saveAll(List<PartType> partTypes) {
        return repo.saveAll(partTypes);
    }

    @Override
    public PartType save(PartType partType) {
        return repo.save(partType);
    }

    @Override
    public PartType delete(PartType partType) {
        if (partType != null) {
            partType.setDeleted(true);
            return repo.save(partType);
        } else {
            return null;
        }
    }

    @Override
    public PartType deleteById(int id) {
        PartType byId = findById(id);
        if (byId != null) {
            byId.setDeleted(true);
            return repo.save(byId);
        } else {
            return null;
        }
    }

    @Override
    public PartType findByType(String type) {
        return repo.findByType(type);
    }
}
