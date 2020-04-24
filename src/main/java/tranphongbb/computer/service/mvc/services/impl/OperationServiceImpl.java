package tranphongbb.computer.service.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tranphongbb.computer.service.mvc.entity.Operation;
import tranphongbb.computer.service.mvc.repositories.OperationRespository;
import tranphongbb.computer.service.mvc.services.OperationService;

import java.util.List;

/*
 * Made by Pt. Copyright (c) 3/2020.
 */

@Service
@RequiredArgsConstructor
public class OperationServiceImpl implements OperationService {

    private final OperationRespository repo;


    @Override
    public List<Operation> findAll() {
        return repo.findAll();
    }

    @Override
    public Operation findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Operation> saveAll(List<Operation> list) {
        return repo.saveAll(list);
    }

    @Override
    public Operation save(Operation object) {
        return repo.saveAndFlush(object);
    }

    @Override
    public Operation delete(Operation object) {
        if (object != null) {
            object.setDeleted(true);
            return repo.save(object);
        } else {
            return null;
        }
    }

    @Override
    public Operation deleteById(int id) {
        Operation byId = findById(id);
        if (byId != null) {
            byId.setDeleted(true);
            return repo.save(byId);
        } else {
            return null;
        }
    }
}
