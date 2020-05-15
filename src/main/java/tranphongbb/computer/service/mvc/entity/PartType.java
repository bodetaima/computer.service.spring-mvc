package tranphongbb.computer.service.mvc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;
import tranphongbb.computer.service.mvc.entity.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "part_types")
@Where(clause = "deleted = false")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PartType extends BaseEntity {

    @Column(name = "type")
    private String type;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
