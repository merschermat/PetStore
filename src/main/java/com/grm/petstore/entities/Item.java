package com.grm.petstore.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item implements Serializable {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private Float unitCost;
    private String imagePath;

    @OneToOne
    private Product product;
}
