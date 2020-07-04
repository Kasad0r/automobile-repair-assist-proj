package org.kasad0r.automobilerepairassistproj.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author kasad0r
 * @created 03/07/2020-19:39
 * @project automobile-repair-assist-proj
 */
@Entity
@Data
public class RepairType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String type;

    private BigDecimal defaultPrice;

    private BigDecimal totalPrice;


}
