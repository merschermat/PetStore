package com.grm.petstore.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreditCard implements Serializable  {

    private String creditCardExpDate;
    @Enumerated( EnumType.STRING )
    private CreditCardType creditCardType;
    private String creditCardNumber;

}
