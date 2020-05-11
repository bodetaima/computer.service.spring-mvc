package tranphongbb.computer.service.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tranphongbb.computer.service.mvc.entity.pc.RAM;
import tranphongbb.computer.service.mvc.repositories.RAMRepository;
import tranphongbb.computer.service.mvc.services.RAMService;

import java.util.List;


@Service
@RequiredArgsConstructor
public class RAMServiceImpl implements RAMService {

    private final RAMRepository repo;

    @Override
    public List<RAM> findAll() {
        return repo.findAll();
    }

    @Override
    public RAM findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<RAM> saveAll(List<RAM> list) {
        return repo.saveAll(list);
    }

    @Override
    public RAM save(RAM object) {
        return repo.saveAndFlush(object);
    }

    @Override
    public RAM delete(RAM object) {
        if (object != null) {
            object.setDeleted(true);
            return repo.save(object);
        } else {
            return null;
        }
    }

    @Override
    public RAM deleteById(int id) {
        RAM byId = findById(id);
        if (byId != null) {
            byId.setDeleted(true);
            return repo.save(byId);
        } else {
            return null;
        }
    }

    @Override
    public List<RAM> findByName(String name) {
        return repo.findByName(name);
    }
}
