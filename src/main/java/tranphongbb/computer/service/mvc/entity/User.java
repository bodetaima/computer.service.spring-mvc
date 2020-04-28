package tranphongbb.computer.service.mvc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;
import tranphongbb.computer.service.mvc.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/*
 * Made by Pt. Copyright (c) 3/2020.
 */

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "users")
@Where(clause = "deleted = false")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "username")
    private String username;

    @Column(name = "user_code")
    private String user_code;

    @Column(name = "password")
    private String password;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "role_id")
    private String roleId;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
