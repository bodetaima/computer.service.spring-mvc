package tranphongbb.computer.service.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tranphongbb.computer.service.mvc.entity.OrderServicePlanOperation;
import tranphongbb.computer.service.mvc.repositories.OrderServicePlanOperationRepository;
import tranphongbb.computer.service.mvc.services.OrderServicePlanOperationService;

import java.util.List;

/*
 * Made by Pt. Copyright (c) 3/2020.
 */

@Service
@RequiredArgsConstructor
public class OrderServicePlanOperationServiceImpl implements OrderServicePlanOperationService {

    private final OrderServicePlanOperationRepository repo;

    @Override
    public List<OrderServicePlanOperation> findAll() {
        return repo.findAll();
    }

    @Override
    public OrderServicePlanOperation findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<OrderServicePlanOperation> saveAll(List<OrderServicePlanOperation> list) {
        return repo.saveAll(list);
    }

    @Override
    public OrderServicePlanOperation save(OrderServicePlanOperation object) {
        return repo.saveAndFlush(object);
    }

    @Override
    public OrderServicePlanOperation delete(OrderServicePlanOperation object) {
        if (object != null) {
            object.setDeleted(true);
            return repo.save(object);
        } else {
            return null;
        }
    }

    @Override
    public OrderServicePlanOperation deleteById(int id) {
        OrderServicePlanOperation byId = findById(id);
        if (byId != null) {
            byId.setDeleted(true);
            return repo.save(byId);
        } else {
            return null;
        }
    }
}
