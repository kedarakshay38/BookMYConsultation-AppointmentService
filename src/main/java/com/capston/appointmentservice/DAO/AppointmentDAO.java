package com.capston.appointmentservice.DAO;

import com.capston.appointmentservice.Entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentDAO extends JpaRepository<Appointment,Integer> {
}
