package com.grm.petstore.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartItem implements Serializable {

    private Integer quantity;
    private Float subTotal;

    @OneToOne
    private Item item;
}
