package org.kasad0r.automobilerepairassistproj.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author kasad0r
 * @created 03/07/2020-19:42
 * @project automobile-repair-assist-proj
 */
@Entity
@Data
public class VehiclePart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    @ManyToMany
    @JoinTable(name = "vehicle_parts_parts_types",
            joinColumns = @JoinColumn(name = "vehicle_part_id"),
            foreignKey = @ForeignKey(name = "vehicle_part_fk"),
            inverseJoinColumns = @JoinColumn(name = "part_type_id"),
            inverseForeignKey = @ForeignKey(name = "part_type_fk"))
    private List<VehiclePartType> vehiclePartTypesList;

    @ManyToMany
    @JoinTable(name = "vehicle_part_compatible_models",
            joinColumns = @JoinColumn(name = "vehicle_part_id"),
            foreignKey = @ForeignKey(name = "vehicle_part_fk"),
            inverseJoinColumns = @JoinColumn(name = "model_id"),
            inverseForeignKey = @ForeignKey(name = "model_fk"))
    private List<Model> compatibleList;
}
