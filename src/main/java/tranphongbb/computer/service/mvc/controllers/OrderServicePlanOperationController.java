package tranphongbb.computer.service.mvc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tranphongbb.computer.service.mvc.entity.OrderServicePlanOperation;
import tranphongbb.computer.service.mvc.services.OrderServicePlanOperationService;

import java.util.List;

@RestController
@RequestMapping("/endpoint/ospo")
@RequiredArgsConstructor
public class OrderServicePlanOperationController {

    private final OrderServicePlanOperationService service;

    @GetMapping
    List<OrderServicePlanOperation> findAll() {
        return service.findAll();
    }

    @PostMapping
    OrderServicePlanOperation create(@RequestBody OrderServicePlanOperation object) {
        return service.save(object);
    }

    @GetMapping("/{id}")
    OrderServicePlanOperation findOne(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @PutMapping
    OrderServicePlanOperation update(OrderServicePlanOperation object) {
        return service.save(object);
    }

    @DeleteMapping("/{id}")
    OrderServicePlanOperation delete(@PathVariable("id") int id) {
        return service.deleteById(id);
    }
}
