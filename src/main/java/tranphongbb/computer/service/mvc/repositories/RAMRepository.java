package tranphongbb.computer.service.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tranphongbb.computer.service.mvc.entity.pc.RAM;

import java.util.List;

public interface RAMRepository extends JpaRepository<RAM, Integer> {

    @Query(" FROM RAM t1 where t1.name like %:name%")
    List<RAM> findByName(@Param("name") String name);
}
