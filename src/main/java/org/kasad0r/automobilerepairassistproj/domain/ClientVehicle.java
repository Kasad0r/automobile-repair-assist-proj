package org.kasad0r.automobilerepairassistproj.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author kasad0r
 * @created 03/07/2020-19:33
 * @project automobile-repair-assist-proj
 */
@Entity
@Data
public class ClientVehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "vehicle_fk"))
    private Vehicle vehicle;

    @OneToMany
    @JoinColumn(foreignKey = @ForeignKey(name = "repair_fk"))
    private List<Repair> repairsList;
}
