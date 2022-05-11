package com.capston.appointmentservice.DTO;

import java.util.List;
import java.util.Map;

public class AvailabilityMap {
    public Map<String, List<String>> availabilityMap;

    public Map<String, List<String>> getAvailabilityMap() {
        return availabilityMap;
    }

    public void setAvailabilityMap(Map<String, List<String>> availabilityMap) {
        this.availabilityMap = availabilityMap;
    }
}
