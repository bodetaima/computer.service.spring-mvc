package tranphongbb.computer.service.mvc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;
import tranphongbb.computer.service.mvc.entity.base.BaseEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "parts")
@Where(clause = "deleted = false")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Part extends BaseEntity {

    @Column(name = "part_type_id")
    private int partTypeId;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "description")
    private String description;

    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "part_type_id", referencedColumnName = "id", updatable = false, insertable = false)
    private PartType partType;
}
