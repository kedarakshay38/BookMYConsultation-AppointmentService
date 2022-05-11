package com.capston.appointmentservice.Service;

import com.capston.appointmentservice.DAO.AvailabilityDAO;
import com.capston.appointmentservice.DTO.AvailabilityMap;
import com.capston.appointmentservice.Entities.Availability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AvailabilityServiceImpli implements  AvailabilityService{
    @Autowired
    AvailabilityDAO availabilityDAO;


    @Override
    @Transactional
    public List<Availability> save(AvailabilityMap availabilityMap, String doctorId) {
        List<Availability> availabilities = new ArrayList<Availability>();
        List<Availability> allAvailability = (List<Availability>) availabilityDAO.findAllByDoctorIdAndAvailableSlots(doctorId);

        //Now removing  Time slots if already present
        if(allAvailability != null && allAvailability.size() > 0)
        {
            for (Availability availability : allAvailability) {
                availabilityDAO.removeByDoctorId(doctorId);
             break;
            }
        }
        for (Map.Entry<String, List<String>> val : availabilityMap.getAvailabilityMap().entrySet()) {
            List<String> slots = val.getValue();
            for (String slot : slots) {
                Availability availability = new Availability();
                availability.setAvailabilityDate(LocalDate.parse(val.getKey()));
                availability.setTimeSlot(slot);
                availability.setDoctorId(doctorId);
                availabilities.add(availability);
            }
        }
        availabilities = availabilityDAO.saveAll(availabilities);
        return availabilities;

    }

    @Override
    public Map<String, List<String>> getAvailability(String doctorId) {
        List<Availability> availabilityList = availabilityDAO.findAllByDoctorIdAndAvailableSlots(doctorId);
        Map<String, List<String>> availabilityMap = new HashMap<>();
        if (availabilityList != null && availabilityList.size() > 0) {
            for (Availability al : availabilityList) {
                String key = al.getAvailabilityDate().toString();
                if (availabilityMap.containsKey(key)) {
                    availabilityMap.get(key).add(al.getTimeSlot());
                } else {
                    List<String> slotList = new ArrayList<>();
                    slotList.add(al.getTimeSlot());
                    availabilityMap.put(key, slotList);
                }
            }
            return availabilityMap;
        }
        return null;


    }


}
