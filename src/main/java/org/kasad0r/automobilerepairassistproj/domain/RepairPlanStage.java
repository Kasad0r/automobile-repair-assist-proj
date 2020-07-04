package org.kasad0r.automobilerepairassistproj.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author kasad0r
 * @created 03/07/2020-19:38
 * @project automobile-repair-assist-proj
 */
@Entity
@Data
public class RepairPlanStage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "repair_fk"))
    private RepairType repairType;

    @ManyToMany
    @JoinTable(name = "repair_plan_stage_vehicle_parts",
            joinColumns = @JoinColumn(name = "repair_plan_stage_id"),
            foreignKey = @ForeignKey(name = "repair_plan_stage_fk"),
            inverseJoinColumns = @JoinColumn(name = "vehicle_part_id"),
            inverseForeignKey = @ForeignKey(name = "vehicle_part_fk"))
    private List<VehiclePart> vehiclePartsList;

    @ManyToMany
    @JoinTable(name = "employee_repair_type_skills",
            inverseJoinColumns = @JoinColumn(name = "employee_id"),
            inverseForeignKey = @ForeignKey(name = "employee_fk"),
            joinColumns = @JoinColumn(name = "repair_type_id"),
            foreignKey = @ForeignKey(name = "repair_type_fk"))
    private List<Employee> knowingEmployees;
}
