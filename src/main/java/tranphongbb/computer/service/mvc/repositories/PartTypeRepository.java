package tranphongbb.computer.service.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tranphongbb.computer.service.mvc.entity.PartType;

public interface PartTypeRepository extends JpaRepository<PartType, Integer> {

    PartType findByType(String type);

}
