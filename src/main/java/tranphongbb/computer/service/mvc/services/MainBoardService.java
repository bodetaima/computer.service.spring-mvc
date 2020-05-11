package tranphongbb.computer.service.mvc.services;

import tranphongbb.computer.service.mvc.entity.pc.MainBoard;

import java.util.List;

public interface MainBoardService extends BaseService<MainBoard> {

    List<MainBoard> findByName(String name);
}
