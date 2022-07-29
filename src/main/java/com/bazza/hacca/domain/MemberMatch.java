package com.bazza.hacca.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class MemberMatch {

    @Id
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Long memberId;

    @Id
    @ManyToOne
    @JoinColumn(name = "match_id")
    private Long matchId;

    private int backNumber;
    private double rating;

    private String momStatus;


}
