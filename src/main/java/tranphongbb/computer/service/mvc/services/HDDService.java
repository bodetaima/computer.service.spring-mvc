package tranphongbb.computer.service.mvc.services;

import tranphongbb.computer.service.mvc.entity.pc.HDD;

import java.util.List;

public interface HDDService extends BaseService<HDD> {

    List<HDD> findByName(String name);
}
