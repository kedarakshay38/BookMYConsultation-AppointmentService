package com.capston.appointmentservice.Service;

import com.capston.appointmentservice.DTO.AvailabilityDTO;

public interface AppointmentService {
    public void insertAvailability(String docId, AvailabilityDTO availabilityDTO);
}
