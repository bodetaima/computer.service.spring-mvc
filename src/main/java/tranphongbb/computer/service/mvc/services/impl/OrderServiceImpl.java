package tranphongbb.computer.service.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tranphongbb.computer.service.mvc.entity.Order;
import tranphongbb.computer.service.mvc.repositories.OrderRepository;
import tranphongbb.computer.service.mvc.services.OrderService;

import java.util.List;

/*
 * Made by Pt. Copyright (c) 3/2020.
 */

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repo;

    @Override
    public List<Order> findAll() {
        return repo.findAll();
    }

    @Override
    public Order findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Order> saveAll(List<Order> list) {
        return repo.saveAll(list);
    }

    @Override
    public Order save(Order object) {
        return repo.saveAndFlush(object);
    }

    @Override
    public Order delete(Order object) {
        if (object != null) {
            object.setDeleted(true);
            return repo.save(object);
        } else {
            return null;
        }
    }

    @Override
    public Order deleteById(int id) {
        Order byId = findById(id);
        if (byId != null) {
            byId.setDeleted(true);
            return repo.save(byId);
        } else {
            return null;
        }
    }
}
