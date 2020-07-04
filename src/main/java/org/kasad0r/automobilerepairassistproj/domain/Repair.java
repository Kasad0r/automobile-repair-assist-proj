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
public class Repair {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany
    @JoinColumn(foreignKey = @ForeignKey(name = "repair_plan_stage_fk"))
    private List<RepairPlanStage> repairPlanStagesList;
}
