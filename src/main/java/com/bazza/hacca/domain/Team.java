package com.bazza.hacca.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Team {

    @Id @GeneratedValue
    @Column(name = "team_id")
    private Long id;

    private String name;
    private String introduce;
    private String captain;

    @Enumerated(EnumType.STRING)
    private List<Region> region;

    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<>();

    @Embedded
    private Overall overall;

}
