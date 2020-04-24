package tranphongbb.computer.service.mvc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tranphongbb.computer.service.mvc.entity.Permission;
import tranphongbb.computer.service.mvc.services.PermissionService;

import java.util.List;

@RestController
@RequestMapping("/endpoint/permission")
@RequiredArgsConstructor
public class PermissionController {

    private final PermissionService service;

    @GetMapping
    List<Permission> findAll() {
        return service.findAll();
    }

    @PostMapping
    Permission create(@RequestBody Permission object) {
        return service.save(object);
    }

    @GetMapping("/{id}")
    Permission findOne(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @PutMapping
    Permission update(Permission object) {
        return service.save(object);
    }

    @DeleteMapping("/{id}")
    Permission delete(@PathVariable("id") int id) {
        return service.deleteById(id);
    }
}
