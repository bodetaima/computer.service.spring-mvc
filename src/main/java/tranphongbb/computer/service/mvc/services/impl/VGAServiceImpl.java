package tranphongbb.computer.service.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tranphongbb.computer.service.mvc.entity.pc.VGA;
import tranphongbb.computer.service.mvc.repositories.VGARepository;
import tranphongbb.computer.service.mvc.services.VGAService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VGAServiceImpl implements VGAService {

    private final VGARepository repo;

    @Override
    public List<VGA> findAll() {
        return repo.findAll();
    }

    @Override
    public VGA findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<VGA> saveAll(List<VGA> list) {
        return repo.saveAll(list);
    }

    @Override
    public VGA save(VGA object) {
        return repo.saveAndFlush(object);
    }

    @Override
    public VGA delete(VGA object) {
        if (object != null) {
            object.setDeleted(true);
            return repo.save(object);
        } else {
            return null;
        }
    }

    @Override
    public VGA deleteById(int id) {
        VGA byId = findById(id);
        if (byId != null) {
            byId.setDeleted(true);
            return repo.save(byId);
        } else {
            return null;
        }
    }

    @Override
    public List<VGA> findByName(String name) {
        return repo.findByName(name);
    }
}
