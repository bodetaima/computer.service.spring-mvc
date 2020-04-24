package tranphongbb.computer.service.mvc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tranphongbb.computer.service.mvc.entity.Role;
import tranphongbb.computer.service.mvc.services.RoleService;

import java.util.List;

@RestController
@RequestMapping("/endpoint/role")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService service;

    @GetMapping
    List<Role> findAll() {
        return service.findAll();
    }

    @PostMapping
    Role create(@RequestBody Role object) {
        return service.save(object);
    }

    @GetMapping("/{id}")
    Role findOne(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @PutMapping
    Role update(Role object) {
        return service.save(object);
    }

    @DeleteMapping("/{id}")
    Role delete(@PathVariable("id") int id) {
        return service.deleteById(id);
    }

}
