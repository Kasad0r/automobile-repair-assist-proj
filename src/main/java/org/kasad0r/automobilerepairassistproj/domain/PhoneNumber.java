package org.kasad0r.automobilerepairassistproj.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author kasad0r
 * @created 03/07/2020-19:25
 * @project automobile-repair-assist-proj
 */

@Entity
@Data
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String number;
}
