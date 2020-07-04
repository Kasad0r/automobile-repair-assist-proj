package org.kasad0r.automobilerepairassistproj.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author kasad0r
 * @created 03/07/2020-19:43
 * @project automobile-repair-assist-proj
 */

@Entity
@Data
public class VehiclePartType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String type;


    @ManyToMany
    @JoinTable(name = "vehicle_parts_parts_types",
            joinColumns = @JoinColumn(name = "part_type_id"),
            foreignKey = @ForeignKey(name = "part_type_fk"),
            inverseJoinColumns = @JoinColumn(name = "vehicle_part_id"),
            inverseForeignKey = @ForeignKey(name = "vehicle_part_fk"))
    private List<VehiclePart> vehiclePartList;
}
