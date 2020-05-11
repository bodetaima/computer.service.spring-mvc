package tranphongbb.computer.service.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tranphongbb.computer.service.mvc.entity.pc.MainBoard;

import java.util.List;

public interface MainBoardRepository extends JpaRepository<MainBoard, Integer> {

    @Query(" FROM MainBoard t1 where t1.name like %:name%")
    List<MainBoard> findByName(@Param("name") String name);
}
