package com.capston.appointmentservice.Entities;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data

@Entity
public class Availability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "availabilityDate")
    private LocalDate availabilityDate;

    @Column (name = "doctorId")
    private String doctorId;

    @Column(name="isBooked",nullable = false)
    private boolean isBooked = false;

    @Column(name="timeSlot")
    private String timeSlot;

}
