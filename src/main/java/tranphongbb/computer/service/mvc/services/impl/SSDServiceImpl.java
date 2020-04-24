package tranphongbb.computer.service.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tranphongbb.computer.service.mvc.entity.pc.SSD;
import tranphongbb.computer.service.mvc.repositories.SSDRepository;
import tranphongbb.computer.service.mvc.services.SSDService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SSDServiceImpl implements SSDService {

    private final SSDRepository repo;

    @Override
    public List<SSD> findAll() {
        return repo.findAll();
    }

    @Override
    public SSD findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<SSD> saveAll(List<SSD> list) {
        return repo.saveAll(list);
    }

    @Override
    public SSD save(SSD object) {
        return repo.saveAndFlush(object);
    }

    @Override
    public SSD delete(SSD object) {
        if (object != null) {
            object.setDeleted(true);
            return repo.save(object);
        } else {
            return null;
        }
    }

    @Override
    public SSD deleteById(int id) {
        SSD byId = findById(id);
        if (byId != null) {
            byId.setDeleted(true);
            return repo.save(byId);
        } else {
            return null;
        }
    }
}
