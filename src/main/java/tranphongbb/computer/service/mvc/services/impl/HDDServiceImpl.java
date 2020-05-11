package tranphongbb.computer.service.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tranphongbb.computer.service.mvc.entity.pc.HDD;
import tranphongbb.computer.service.mvc.repositories.HDDRepository;
import tranphongbb.computer.service.mvc.services.HDDService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HDDServiceImpl implements HDDService {

    private final HDDRepository repo;

    @Override
    public List<HDD> findAll() {
        return repo.findAll();
    }

    @Override
    public HDD findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<HDD> saveAll(List<HDD> list) {
        return repo.saveAll(list);
    }

    @Override
    public HDD save(HDD object) {
        return repo.saveAndFlush(object);
    }

    @Override
    public HDD delete(HDD object) {
        if (object != null) {
            object.setDeleted(true);
            return repo.save(object);
        } else {
            return null;
        }
    }

    @Override
    public HDD deleteById(int id) {
        HDD byId = findById(id);
        if (byId != null) {
            byId.setDeleted(true);
            return repo.save(byId);
        } else {
            return null;
        }
    }

    @Override
    public List<HDD> findByName(String name) {
        return repo.findByName(name);
    }
}
