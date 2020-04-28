package tranphongbb.computer.service.mvc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;
import tranphongbb.computer.service.mvc.entity.base.BaseEntity;
import tranphongbb.computer.service.mvc.models.ERole;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/*
 * Made by Pt. Copyright (c) 3/2020.
 */

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "roles")
@Where(clause = "deleted = false")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Enumerated(EnumType.STRING)
    @Column(name = "name")
    private ERole name;

    @Column(name = "role_description")
    private String roleDescription;

    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "role_permissions", joinColumns = { @JoinColumn(name = "role_id") }, inverseJoinColumns = { @JoinColumn(name = "permission_id") })
    private Set<Permission> permissions = new HashSet<>();
}
