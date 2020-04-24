package tranphongbb.computer.service.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tranphongbb.computer.service.mvc.entity.User;

/*
 * Made by Pt. Copyright (c) 3/2020.
 */

public interface UserRepository extends JpaRepository<User, Integer> {
}
