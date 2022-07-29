package com.bazza.hacca.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
public class Match {

    @Id @GeneratedValue
    @Column(name = "match_id")
    private Long id;

    private Date time;
    private String location;

    @Enumerated(EnumType.STRING)
    private String type;

    @Enumerated(EnumType.STRING)
    private String matchStatus;

    private String winner;

}
