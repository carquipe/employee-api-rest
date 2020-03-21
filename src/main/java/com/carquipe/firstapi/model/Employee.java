package com.carquipe.firstapi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/* Lombock annotation to create getters, setters, equals,
* hash & toString methods*/
@Data
/* JPA annotation to make object ready for storage in
* data storage */
@Entity
public class Employee {
    private 
        /* JPA PK Identity Annotation */ 
        @Id 
        /* JPA Automatic populated by JPA Provider Annotation */
        @GeneratedValue
        Long id;
    private String name;
    private String role;

    public Employee () {}

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}