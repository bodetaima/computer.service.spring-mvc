package tranphongbb.computer.service.mvc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tranphongbb.computer.service.mvc.entity.ServicePlanOperation;
import tranphongbb.computer.service.mvc.services.ServicePlanOperationService;

import java.util.List;

@RestController
@RequestMapping("/endpoint/spo")
@RequiredArgsConstructor
public class ServicePlanOperationController {

    private final ServicePlanOperationService service;

    @GetMapping
    List<ServicePlanOperation> findAll() {
        return service.findAll();
    }

    @PostMapping
    ServicePlanOperation create(@RequestBody ServicePlanOperation object) {
        return service.save(object);
    }

    @GetMapping("/{id}")
    ServicePlanOperation findOne(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @PutMapping
    ServicePlanOperation update(ServicePlanOperation object) {
        return service.save(object);
    }

    @DeleteMapping("/{id}")
    ServicePlanOperation delete(@PathVariable("id") int id) {
        return service.deleteById(id);
    }
}
