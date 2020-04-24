package tranphongbb.computer.service.mvc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tranphongbb.computer.service.mvc.entity.Customer;
import tranphongbb.computer.service.mvc.services.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/endpoint/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service;

    @GetMapping
    List<Customer> findAll() {
        return service.findAll();
    }

    @PostMapping
    Customer create(@RequestBody Customer object) {
        return service.save(object);
    }

    @GetMapping("/{id}")
    Customer findOne(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @PutMapping
    Customer update(Customer object) {
        return service.save(object);
    }

    @DeleteMapping("/{id}")
    Customer delete(@PathVariable("id") int id) {
        return service.deleteById(id);
    }
}
