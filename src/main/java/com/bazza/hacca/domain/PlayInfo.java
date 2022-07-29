package com.bazza.hacca.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class PlayInfo {

    private String position;
    private String foot;

}
