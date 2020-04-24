package tranphongbb.computer.service.mvc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tranphongbb.computer.service.mvc.entity.Computer;
import tranphongbb.computer.service.mvc.services.ComputerService;

import java.util.List;

@RestController
@RequestMapping("/endpoint/computer")
@RequiredArgsConstructor
public class ComputerController {

    private final ComputerService service;

    @GetMapping
    List<Computer> findAll() {
        return service.findAll();
    }

    @PostMapping
    Computer create(@RequestBody Computer object) {
        return service.save(object);
    }

    @GetMapping("/{id}")
    Computer findOne(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @PutMapping
    Computer update(Computer object) {
        return service.save(object);
    }

    @DeleteMapping("/{id}")
    Computer delete(@PathVariable("id") int id) {
        return service.deleteById(id);
    }
}
