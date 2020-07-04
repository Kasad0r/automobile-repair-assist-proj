package org.kasad0r.automobilerepairassistproj.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * @author kasad0r
 * @created 03/07/2020-19:46
 * @project automobile-repair-assist-proj
 */
@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String surname;

    private LocalDate takenOnWorkDate;

    @ManyToMany
    @JoinTable(name = "employee_repair_type_skills",
            joinColumns = @JoinColumn(name = "employee_id"),
            foreignKey = @ForeignKey(name = "employee_fk"),
            inverseJoinColumns = @JoinColumn(name = "repair_type_id"),
            inverseForeignKey = @ForeignKey(name = "repair_type_fk"))
    private List<RepairPlanStage> repairsPlanStagesList;

    @ManyToMany
    @JoinTable(name = "employee_repair_type_skills",
            joinColumns = @JoinColumn(name = "employee_id"),
            foreignKey = @ForeignKey(name = "employee_fk"),
            inverseJoinColumns = @JoinColumn(name = "repair_type_id"),
            inverseForeignKey = @ForeignKey(name = "repair_type_fk"))
    private List<RepairType> employeeSkillsList;
}
