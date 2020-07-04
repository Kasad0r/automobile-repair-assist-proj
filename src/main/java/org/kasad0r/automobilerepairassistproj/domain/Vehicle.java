package org.kasad0r.automobilerepairassistproj.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author kasad0r
 * @created 03/07/2020-19:27
 * @project automobile-repair-assist-proj
 */

@Entity
@Data
public class Vehicle {

    @OneToMany
    List<ClientVehicle> clientVehicles;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "manufacturer_fk"))
    private Manufacturer manufacturer;

    @OneToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "model_fk"))
    private Model model;
}
