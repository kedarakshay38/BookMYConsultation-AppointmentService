package com.capston.appointmentservice.Entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    @Column
    private int id;
    @Column
    private String Name;

}
