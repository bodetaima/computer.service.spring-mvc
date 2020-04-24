package tranphongbb.computer.service.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tranphongbb.computer.service.mvc.entity.Order;

/*
 * Made by Pt. Copyright (c) 3/2020.
 */

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
