package com.capston.appointmentservice.Service;

import com.capston.appointmentservice.DTO.AvailabilityMap;
import com.capston.appointmentservice.Entities.Availability;

import java.util.List;
import java.util.Map;

public interface AvailabilityService {

    List<Availability> save(AvailabilityMap availabilityMap, String doctorId);
    Map<String, List<String>> getAvailability(String doctorId);
}
