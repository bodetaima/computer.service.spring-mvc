package tranphongbb.computer.service.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tranphongbb.computer.service.mvc.entity.ServicePlan;
import tranphongbb.computer.service.mvc.repositories.ServicePlanRepository;
import tranphongbb.computer.service.mvc.services.ServicePlanService;

import java.util.List;

/*
 * Made by Pt. Copyright (c) 3/2020.
 */

@Service
@RequiredArgsConstructor
public class ServicePlanServiceImpl implements ServicePlanService {

    private final ServicePlanRepository repo;

    @Override
    public List<ServicePlan> findAll() {
        return repo.findAll();
    }

    @Override
    public ServicePlan findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<ServicePlan> saveAll(List<ServicePlan> list) {
        return repo.saveAll(list);
    }

    @Override
    public ServicePlan save(ServicePlan object) {
        return repo.saveAndFlush(object);
    }

    @Override
    public ServicePlan delete(ServicePlan object) {
        if (object != null) {
            object.setDeleted(true);
            return repo.save(object);
        } else {
            return null;
        }
    }

    @Override
    public ServicePlan deleteById(int id) {
        ServicePlan byId = findById(id);
        if (byId != null) {
            byId.setDeleted(true);
            return repo.save(byId);
        } else {
            return null;
        }
    }
}
