package tranphongbb.computer.service.mvc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import tranphongbb.computer.service.mvc.dto.PartTypeParentDto;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class PartTypeModel {

    List<PartTypeParentDto> types;
}
