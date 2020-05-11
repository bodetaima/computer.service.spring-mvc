package tranphongbb.computer.service.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tranphongbb.computer.service.mvc.entity.pc.PSU;

import java.util.List;

public interface PSURepository extends JpaRepository<PSU, Integer> {

    @Query(" FROM PSU t1 where t1.name like %:name%")
    List<PSU> findByName(@Param("name") String name);

}
