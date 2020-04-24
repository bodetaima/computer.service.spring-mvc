package tranphongbb.computer.service.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tranphongbb.computer.service.mvc.entity.ServicePlanOperation;
import tranphongbb.computer.service.mvc.repositories.ServicePlanOperationRepository;
import tranphongbb.computer.service.mvc.services.ServicePlanOperationService;

import java.util.List;

/*
 * Made by Pt. Copyright (c) 3/2020.
 */

@Service
@RequiredArgsConstructor
public class ServicePlanOperationServiceImpl implements ServicePlanOperationService {

    private final ServicePlanOperationRepository repo;

    @Override
    public List<ServicePlanOperation> findAll() {
        return repo.findAll();
    }

    @Override
    public ServicePlanOperation findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<ServicePlanOperation> saveAll(List<ServicePlanOperation> list) {
        return repo.saveAll(list);
    }

    @Override
    public ServicePlanOperation save(ServicePlanOperation object) {
        return repo.saveAndFlush(object);
    }

    @Override
    public ServicePlanOperation delete(ServicePlanOperation object) {
        if (object != null) {
            object.setDeleted(true);
            return repo.save(object);
        } else {
            return null;
        }
    }

    @Override
    public ServicePlanOperation deleteById(int id) {
        ServicePlanOperation byId = findById(id);
        if (byId != null) {
            byId.setDeleted(true);
            return repo.save(byId);
        } else {
            return null;
        }
    }
}
