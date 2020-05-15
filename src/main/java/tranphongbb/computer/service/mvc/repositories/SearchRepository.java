package tranphongbb.computer.service.mvc.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import tranphongbb.computer.service.mvc.entity.Part;

public interface SearchRepository {

    Page<Part> searchPart(Pageable pageable, String type, String query);
}
