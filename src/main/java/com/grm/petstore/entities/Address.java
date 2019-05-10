package com.grm.petstore.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address implements Serializable {

    private String country;
    private String street1;
    private String city;
    private String state;
    private String street2;
    private String zipCode;

}
