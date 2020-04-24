package tranphongbb.computer.service.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tranphongbb.computer.service.mvc.entity.Customer;
import tranphongbb.computer.service.mvc.repositories.CustomerRepository;
import tranphongbb.computer.service.mvc.services.CustomerService;

import java.util.List;

/*
 * Made by Pt. Copyright (c) 3/2020.
 */

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repo;

    @Override
    public List<Customer> findAll() {
        return repo.findAll();
    }

    @Override
    public Customer findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Customer> saveAll(List<Customer> list) {
        return repo.saveAll(list);
    }

    @Override
    public Customer save(Customer object) {
        return repo.saveAndFlush(object);
    }

    @Override
    public Customer delete(Customer object) {
        if (object != null) {
            object.setDeleted(true);
            return repo.save(object);
        } else {
            return null;
        }
    }

    @Override
    public Customer deleteById(int id) {
        Customer byId = findById(id);
        if (byId != null) {
            byId.setDeleted(true);
            return repo.save(byId);
        } else {
            return null;
        }
    }

}
