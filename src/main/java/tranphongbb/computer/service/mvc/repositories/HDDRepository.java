package tranphongbb.computer.service.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tranphongbb.computer.service.mvc.entity.pc.HDD;

import java.util.List;

public interface HDDRepository extends JpaRepository<HDD, Integer> {

    @Query(" FROM HDD t1 where t1.name like %:name%")
    List<HDD> findByName(@Param("name") String name);

}
