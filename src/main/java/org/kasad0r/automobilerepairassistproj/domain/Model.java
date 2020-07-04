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
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String equipment;

    @ManyToMany
    @JoinTable(name = "vehicle_part_compatible_models",
            inverseJoinColumns = @JoinColumn(name = "vehicle_part_id"),
            inverseForeignKey = @ForeignKey(name = "vehicle_part_fk"),
            joinColumns = @JoinColumn(name = "model_id"),
            foreignKey = @ForeignKey(name = "model_fk"))
    private List<VehiclePart> compatibleVehicleParts;
}
