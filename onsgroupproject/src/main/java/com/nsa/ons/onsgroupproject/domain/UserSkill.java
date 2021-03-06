package com.nsa.ons.onsgroupproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_skill")
public class UserSkill {

    @Column(name = "user_id")
    private Long user_id;

    @Id
    @Column(name = "skill_id")
    private Long skill_id;

    @Column(name = "level")
    private Long level;

    @Column(name = "privacy")
    private Boolean privacy;

}
