package tranphongbb.computer.service.mvc.services;

import tranphongbb.computer.service.mvc.entity.pc.RAM;

import java.util.List;

public interface RAMService extends BaseService<RAM> {

    List<RAM> findByName(String name);
}
