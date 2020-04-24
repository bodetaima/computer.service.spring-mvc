package tranphongbb.computer.service.mvc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tranphongbb.computer.service.mvc.entity.User;
import tranphongbb.computer.service.mvc.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/endpoint/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping
    List<User> findAll() {
        return service.findAll();
    }

    @PostMapping
    User create(@RequestBody User object) {
        return service.save(object);
    }

    @GetMapping("/{id}")
    User findOne(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @PutMapping
    User update(User object) {
        return service.save(object);
    }

    @DeleteMapping("/{id}")
    User delete(@PathVariable("id") int id) {
        return service.deleteById(id);
    }
}
