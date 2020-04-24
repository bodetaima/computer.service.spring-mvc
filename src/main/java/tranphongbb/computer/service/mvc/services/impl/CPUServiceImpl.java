package tranphongbb.computer.service.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tranphongbb.computer.service.mvc.entity.pc.CPU;
import tranphongbb.computer.service.mvc.repositories.CPURepository;
import tranphongbb.computer.service.mvc.services.CPUService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CPUServiceImpl implements CPUService {

    private final CPURepository repo;

    @Override
    public List<CPU> findAll() {
        return repo.findAll();
    }

    @Override
    public CPU findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<CPU> saveAll(List<CPU> list) {
        return repo.saveAll(list);
    }

    @Override
    public CPU save(CPU object) {
        return repo.saveAndFlush(object);
    }

    @Override
    public CPU delete(CPU object) {
        if (object != null) {
            object.setDeleted(true);
            return repo.save(object);
        } else {
            return null;
        }
    }

    @Override
    public CPU deleteById(int id) {
        CPU byId = findById(id);
        if (byId != null) {
            byId.setDeleted(true);
            return repo.save(byId);
        } else {
            return null;
        }
    }
}
