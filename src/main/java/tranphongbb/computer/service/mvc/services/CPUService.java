package tranphongbb.computer.service.mvc.services;

import tranphongbb.computer.service.mvc.entity.pc.CPU;

import java.util.List;

public interface CPUService extends BaseService<CPU> {

    List<CPU> findByName(String name);
}
