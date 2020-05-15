package tranphongbb.computer.service.mvc.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import tranphongbb.computer.service.mvc.entity.Part;

public interface PartService extends BaseService<Part> {

    Page<Part> findAllWithPaging(Pageable pageable);

    Page<Part> searchPart(Pageable pageable, String type, String query);
}
