package tranphongbb.computer.service.mvc.services;

import tranphongbb.computer.service.mvc.entity.pc.VGA;

import java.util.List;

public interface VGAService extends BaseService<VGA> {

    List<VGA> findByName(String name);
}
