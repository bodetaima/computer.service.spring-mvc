package tranphongbb.computer.service.mvc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tranphongbb.computer.service.mvc.entity.Operation;
import tranphongbb.computer.service.mvc.services.OperationService;

import java.util.List;

@RestController
@RequestMapping("/endpoint/operation")
@RequiredArgsConstructor
public class OperationController {

    private final OperationService service;

    @GetMapping
    List<Operation> findAll() {
        return service.findAll();
    }

    @PostMapping
    Operation create(@RequestBody Operation object) {
        return service.save(object);
    }

    @GetMapping("/{id}")
    Operation findOne(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @PutMapping
    Operation update(Operation object) {
        return service.save(object);
    }

    @DeleteMapping("/{id}")
    Operation delete(@PathVariable("id") int id) {
        return service.deleteById(id);
    }
}
