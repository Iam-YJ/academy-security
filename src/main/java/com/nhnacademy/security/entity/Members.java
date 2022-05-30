package com.nhnacademy.security.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="Members")
public class Members {
    // CREATE TABLE IF NOT EXISTS `Members` (
    //    `member_id`   VARCHAR(50)  NOT NULL,
    //    `name`        VARCHAR(50)  NOT NULL,
    //    `pwd`         VARCHAR(100) NOT NULL,
    @Id
    @Column(name = "member_id")
    private String memberId;

    @Column(name = "name")
    private String name;

    @Column(name = "pwd")
    private String pwd;
}
