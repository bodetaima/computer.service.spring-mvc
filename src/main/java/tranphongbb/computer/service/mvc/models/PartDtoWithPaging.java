package tranphongbb.computer.service.mvc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tranphongbb.computer.service.mvc.dto.PartDto;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PartDtoWithPaging {

    List<PartDto> parts;
    int size;
    int page;
    int totalPages;
    long totalElements;
}
