package tranphongbb.computer.service.mvc.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class PartTypeDto {

    private String type;
    private boolean check;
    private String parentType;
    private String name;
    private String description;
}
