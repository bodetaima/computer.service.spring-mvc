package tranphongbb.computer.service.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tranphongbb.computer.service.mvc.entity.pc.SSD;

import java.util.List;

public interface SSDRepository extends JpaRepository<SSD, Integer> {

    @Query(" FROM SSD t1 where t1.name like %:name%")
    List<SSD> findByName(@Param("name") String name);
}
