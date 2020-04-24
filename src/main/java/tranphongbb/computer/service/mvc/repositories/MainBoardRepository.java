package tranphongbb.computer.service.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tranphongbb.computer.service.mvc.entity.pc.MainBoard;

public interface MainBoardRepository extends JpaRepository<MainBoard, Integer> {
}
