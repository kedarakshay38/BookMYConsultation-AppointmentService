package com.capston.appointmentservice.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import java.awt.*;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int appointment_id;
    @Column
    private String  appointment_date;
    @Column
    private String  created_date;
    @Column
    private String  doctor_id;
    @Column
    private String  prior_medical_history;
    @Column
    private String  status;
    @Column
    private String  symptoms;
    @Column
    private String  time_slot;
    @Column
    private String  user_id;
    @Column
    private String  user_email_id;
    @Column
    private String  user_name;
    @Column
    private String  doctor_name;




}
