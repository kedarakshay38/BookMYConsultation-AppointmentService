package com.capston.appointmentservice.Controller;

import com.capston.appointmentservice.DTO.AvailabilityDTO;
import com.capston.appointmentservice.DTO.AvailabilityMap;
import com.capston.appointmentservice.Entities.Availability;
import com.capston.appointmentservice.Service.AppointmentServiceImpli;
import com.capston.appointmentservice.Service.AvailabilityServiceImpli;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AppointmentController {
@Autowired
  private   AppointmentServiceImpli appointmentService;
@Autowired
  private  AvailabilityServiceImpli availabilityService;

@Autowired
ModelMapper modelMapper;


    @PostMapping(value = "/doctor/{doctorId}/availability", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateAvailability(@PathVariable String doctorId, @RequestBody AvailabilityMap availabilityMap) {
        List<Availability> availabilities = availabilityService.save(availabilityMap, doctorId);
        return new ResponseEntity(HttpStatus.CREATED);
    }


    @GetMapping(value = "/doctor/{doctorId}/availability", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getDoctorsAvailability(@PathVariable String doctorId) {
        Map<String, List<String>> availableTimeSlots = availabilityService.getAvailability(doctorId);
        Map<String, Object> availMap = new HashMap<>();
        availMap.put(doctorId, availableTimeSlots);
        return new ResponseEntity(availMap, HttpStatus.OK);
    }


}
