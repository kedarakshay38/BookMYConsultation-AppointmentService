package com.capston.appointmentservice.Service;

//import com.capston.appointmentservice.DAO.AppointmentDAO;

import com.capston.appointmentservice.DAO.AppointmentDAO;
import com.capston.appointmentservice.DAO.AvailabilityDAO;
import com.capston.appointmentservice.DTO.AvailabilityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentServiceImpli implements  AppointmentService{
//
    @Autowired
    AppointmentDAO appointmentDAO;

  @Autowired
    AvailabilityDAO availabilityDAO;



       @Override
    public void insertAvailability(String docId, AvailabilityDTO availabilityDTO) {

    }


}
