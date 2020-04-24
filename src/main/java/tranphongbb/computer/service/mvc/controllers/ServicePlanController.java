package tranphongbb.computer.service.mvc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tranphongbb.computer.service.mvc.entity.ServicePlan;
import tranphongbb.computer.service.mvc.services.ServicePlanService;

import java.util.List;

@RestController
@RequestMapping("/endpoint/sp")
@RequiredArgsConstructor
public class ServicePlanController {

    private final ServicePlanService service;

    @GetMapping
    List<ServicePlan> findAll() {
        return service.findAll();
    }

    @PostMapping
    ServicePlan create(@RequestBody ServicePlan object) {
        return service.save(object);
    }

    @GetMapping("/{id}")
    ServicePlan findOne(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @PutMapping
    ServicePlan update(ServicePlan object) {
        return service.save(object);
    }

    @DeleteMapping("/{id}")
    ServicePlan delete(@PathVariable("id") int id) {
        return service.deleteById(id);
    }
}
