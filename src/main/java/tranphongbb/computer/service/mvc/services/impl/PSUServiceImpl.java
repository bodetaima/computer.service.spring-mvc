package tranphongbb.computer.service.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tranphongbb.computer.service.mvc.entity.pc.PSU;
import tranphongbb.computer.service.mvc.repositories.PSURepository;
import tranphongbb.computer.service.mvc.services.PSUService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PSUServiceImpl implements PSUService {

    private final PSURepository repo;

    @Override
    public List<PSU> findAll() {
        return repo.findAll();
    }

    @Override
    public PSU findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<PSU> saveAll(List<PSU> list) {
        return repo.saveAll(list);
    }

    @Override
    public PSU save(PSU object) {
        return repo.saveAndFlush(object);
    }

    @Override
    public PSU delete(PSU object) {
        if (object != null) {
            object.setDeleted(true);
            return repo.save(object);
        } else {
            return null;
        }
    }

    @Override
    public PSU deleteById(int id) {
        PSU byId = findById(id);
        if (byId != null) {
            byId.setDeleted(true);
            return repo.save(byId);
        } else {
            return null;
        }
    }
}
