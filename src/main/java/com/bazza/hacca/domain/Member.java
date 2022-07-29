package com.bazza.hacca.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;
    private String phone;
    private int age;

    @Embedded
    private PlayInfo playInfo;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private String team;
    private int backNumber;

    @Enumerated(EnumType.STRING)
    private String memberStatus;

    @Embedded
    private Overall overall;

}
