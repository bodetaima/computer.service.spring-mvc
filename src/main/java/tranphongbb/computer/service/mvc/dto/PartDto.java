package tranphongbb.computer.service.mvc.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PartDto {

    int id;
    int partTypeId;
    String type;
    String name;
    Double price;
    String description;
    PartTypeDto partTypeDto;
}
