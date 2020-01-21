package com.example.projet.doman;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="EmployeeInfo")

public class Employee {

    @Id
    private String id;
    private String name;
    private String gender;
    private String phone;

}
