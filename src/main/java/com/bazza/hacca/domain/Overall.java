package com.bazza.hacca.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Overall {

    private int played;
    private int scored;
    private int assist;
    private int mom;
    private double rating;
    private int manner;
    private int win;
    private int draw;
    private int lose;

}
