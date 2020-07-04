package org.kasad0r.automobilerepairassistproj.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author kasad0r
 * @created 03/07/2020-17:52
 * @project automobile-repair-assist-proj
 */

@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "address_fk"))
    private Address address;

    @OneToMany
    @JoinColumn(foreignKey = @ForeignKey(name = "phone_number_fk"))
    private List<PhoneNumber> phoneNumber;
}
