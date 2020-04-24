package tranphongbb.computer.service.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tranphongbb.computer.service.mvc.entity.pc.CPU;

public interface CPURepository extends JpaRepository<CPU, Integer> {
}
