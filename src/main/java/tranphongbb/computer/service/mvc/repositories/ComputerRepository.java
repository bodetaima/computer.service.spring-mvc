package tranphongbb.computer.service.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tranphongbb.computer.service.mvc.entity.Computer;

public interface ComputerRepository extends JpaRepository<Computer, Integer> {
}
