package tranphongbb.computer.service.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tranphongbb.computer.service.mvc.entity.Computer;
import tranphongbb.computer.service.mvc.repositories.ComputerRepository;
import tranphongbb.computer.service.mvc.services.ComputerService;

import java.util.List;

/*
 * Made by Pt. Copyright (c) 3/2020.
 */

@Service
@RequiredArgsConstructor
public class ComputerServiceImpl implements ComputerService {

    private final ComputerRepository repo;

    @Override
    public List<Computer> findAll() {
        return repo.findAll();
    }

    @Override
    public Computer findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Computer> saveAll(List<Computer> list) {
        return repo.saveAll(list);
    }

    @Override
    public Computer save(Computer object) {
        return repo.saveAndFlush(object);
    }

    @Override
    public Computer delete(Computer object) {
        if (object != null) {
            object.setDeleted(true);
            return repo.save(object);
        } else {
            return null;
        }
    }

    @Override
    public Computer deleteById(int id) {
        Computer byId = findById(id);
        if (byId != null) {
            byId.setDeleted(true);
            return repo.save(byId);
        } else {
            return null;
        }
    }
}
