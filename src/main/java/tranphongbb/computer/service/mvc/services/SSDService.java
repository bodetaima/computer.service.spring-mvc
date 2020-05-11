package tranphongbb.computer.service.mvc.services;

import tranphongbb.computer.service.mvc.entity.pc.SSD;

import java.util.List;

public interface SSDService extends BaseService<SSD> {

    List<SSD> findByName(String name);
}
