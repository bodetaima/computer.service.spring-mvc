package tranphongbb.computer.service.mvc.services;

import tranphongbb.computer.service.mvc.entity.pc.PSU;

import java.util.List;

public interface PSUService extends BaseService<PSU> {

    List<PSU> findByName(String name);
}
