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
@Table(name="Authoroties")
public class Authority {
    // CREATE TABLE IF NOT EXISTS `Authoroties` (
    //    `member_id`   VARCHAR(50)  NOT NULL,
    //    `authority`   VARCHAR(50)  NOT NULL,
    //
    //    PRIMARY KEY(`member_id`)

    @Id
    @Column(name = "member_id")
    private String memberId;

    @Column(name = "authority")
    private String authority;

}
