package com.grm.petstore.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

public class OrderLine implements Serializable {

    @Id @GeneratedValue
    private Long id;
    private Integer quantity;
    private Float subTotal;

    @OneToOne
    private Item item;
}
