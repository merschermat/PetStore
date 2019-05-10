package com.grm.petstore.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer implements Serializable {

    @Id @GeneratedValue
    private Long id;
    private String password;
    private String email;
    private Integer age;
    private String lastName;
    private String firstName;
    private String login;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    private String telephone;
    @OneToOne
    private Address homeAddress;

}
