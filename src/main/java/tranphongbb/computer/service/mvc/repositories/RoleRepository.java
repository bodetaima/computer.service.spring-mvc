package tranphongbb.computer.service.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tranphongbb.computer.service.mvc.entity.Role;
import tranphongbb.computer.service.mvc.models.ERole;

import java.util.Optional;

/*
 * Made by Pt. Copyright (c) 3/2020.
 */

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByName(ERole name);
}
