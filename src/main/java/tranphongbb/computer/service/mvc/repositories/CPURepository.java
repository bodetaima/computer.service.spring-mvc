package tranphongbb.computer.service.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tranphongbb.computer.service.mvc.entity.pc.CPU;

import java.util.List;

public interface CPURepository extends JpaRepository<CPU, Integer> {


    @Query(" FROM CPU t1 WHERE t1.name like %:name%")
    List<CPU> findByName(@Param("name") String name);

}
