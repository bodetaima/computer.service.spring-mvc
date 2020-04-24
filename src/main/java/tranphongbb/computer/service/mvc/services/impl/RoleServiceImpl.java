package tranphongbb.computer.service.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tranphongbb.computer.service.mvc.entity.Role;
import tranphongbb.computer.service.mvc.repositories.RoleRepository;
import tranphongbb.computer.service.mvc.services.RoleService;

import java.util.List;

/*
 * Made by Pt. Copyright (c) 3/2020.
 */

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository repo;

    @Override
    public List<Role> findAll() {
        return repo.findAll();
    }

    @Override
    public Role findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Role> saveAll(List<Role> list) {
        return repo.saveAll(list);
    }

    @Override
    public Role save(Role object) {
        return repo.saveAndFlush(object);
    }

    @Override
    public Role delete(Role object) {
        if (object != null) {
            object.setDeleted(true);
            return repo.save(object);
        } else {
            return null;
        }
    }

    @Override
    public Role deleteById(int id) {
        Role byId = findById(id);
        if (byId != null) {
            byId.setDeleted(true);
            return repo.save(byId);
        } else {
            return null;
        }
    }
}
