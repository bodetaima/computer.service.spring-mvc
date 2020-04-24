package tranphongbb.computer.service.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tranphongbb.computer.service.mvc.entity.User;
import tranphongbb.computer.service.mvc.repositories.UserRepository;
import tranphongbb.computer.service.mvc.services.UserService;

import java.util.List;

/*
 * Made by Pt. Copyright (c) 3/2020.
 */

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repo;

    @Override
    public List<User> findAll() {
        return repo.findAll();
    }

    @Override
    public User findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<User> saveAll(List<User> list) {
        return repo.saveAll(list);
    }

    @Override
    public User save(User object) {
        return repo.saveAndFlush(object);
    }

    @Override
    public User delete(User object) {
        if (object != null) {
            object.setDeleted(true);
            return repo.save(object);
        } else {
            return null;
        }
    }

    @Override
    public User deleteById(int id) {
        User byId = findById(id);
        if (byId != null) {
            byId.setDeleted(true);
            return repo.save(byId);
        } else {
            return null;
        }
    }
}
