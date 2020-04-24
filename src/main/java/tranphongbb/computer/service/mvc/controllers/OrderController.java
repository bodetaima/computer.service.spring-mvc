package tranphongbb.computer.service.mvc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tranphongbb.computer.service.mvc.entity.Order;
import tranphongbb.computer.service.mvc.services.OrderService;

import java.util.List;

@RestController
@RequestMapping("/endpoint/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @GetMapping
    List<Order> findAll() {
        return service.findAll();
    }

    @PostMapping
    Order create(@RequestBody Order object) {
        return service.save(object);
    }

    @GetMapping("/{id}")
    Order findOne(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @PutMapping
    Order update(Order object) {
        return service.save(object);
    }

    @DeleteMapping("/{id}")
    Order delete(@PathVariable("id") int id) {
        return service.deleteById(id);
    }
}
