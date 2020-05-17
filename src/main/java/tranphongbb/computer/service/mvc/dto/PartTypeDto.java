package tranphongbb.computer.service.mvc.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tranphongbb.computer.service.mvc.entity.PartType;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PartTypeDto {

    private int parentTypeId;
    private String type;
    private String name;
    private String description;

    public PartTypeDto(PartType partType) {
        this.parentTypeId = partType.getParentTypeId();
        this.type = partType.getType();
        this.name = partType.getName();
        this.description = partType.getDescription();
    }
}
