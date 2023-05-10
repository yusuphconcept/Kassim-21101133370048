package com.yusuphQs.lifespan.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgumentConstructor
@NoArgumentConstructor
@Entity
@Table(name = "manager_table")
public class Manager {
    @Id
    @name(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "managerID"
    String managerID;
    @Column(name = "firstname")
    String firstname;
    @Column(name = "lastname")
    String lastname;
    @Column(name = "age")
    Integer age;
}
