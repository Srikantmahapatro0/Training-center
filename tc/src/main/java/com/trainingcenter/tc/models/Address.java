package com.trainingcenter.tc.models;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Address {
    private String detailedAddress;
    private String city;
    private String state;
    private String pincode;

}
