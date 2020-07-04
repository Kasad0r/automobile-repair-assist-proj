package org.kasad0r.automobilerepairassistproj.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * @author kasad0r
 * @created 03/07/2020-19:29
 * @project automobile-repair-assist-proj
 */
@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;
    private String email;
    private LocalDate firstCollaboration;

    @OneToMany
    @JoinColumn(foreignKey = @ForeignKey(name = "client_vehicle_fk"))
    private List<ClientVehicle> clientVehicle;

    @OneToMany
    @JoinColumn(foreignKey = @ForeignKey(name = "client_phone_number_fk"))
    private List<PhoneNumber> phoneNumbers;
}
