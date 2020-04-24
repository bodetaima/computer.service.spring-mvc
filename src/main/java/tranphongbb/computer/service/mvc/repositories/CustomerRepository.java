package tranphongbb.computer.service.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tranphongbb.computer.service.mvc.entity.Customer;

/*
 * Made by Pt. Copyright (c) 3/2020.
 */

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
