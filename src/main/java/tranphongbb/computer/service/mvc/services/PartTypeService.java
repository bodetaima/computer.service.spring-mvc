package tranphongbb.computer.service.mvc.services;

import tranphongbb.computer.service.mvc.entity.PartType;

public interface PartTypeService extends BaseService<PartType> {

    PartType findByType(String type);
}
