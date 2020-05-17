package tranphongbb.computer.service.mvc.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class PartTypeParentDto {

    List<PartTypeDto> partTypeDtoList;
    private String type;
    private String name;
    private String description;
}
