package com.capston.appointmentservice.DAO;

import com.capston.appointmentservice.DTO.AvailabilityMap;
import com.capston.appointmentservice.Entities.Availability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AvailabilityDAO extends JpaRepository<Availability,Integer> {
    @Query(value="SELECT * FROM Availability a WHERE doctor_id  = ?1 AND is_booked = true",nativeQuery = true)
    List<Availability> findAllByDoctorIdAndBookedSlots(String doctorId);
    @Modifying
    @Query(value="DELETE from Availability a WHERE doctor_id  = ?1 AND is_booked = false",nativeQuery = true)
    void removeByDoctorId(String doctorId);

    @Query(value="SELECT * FROM Availability a WHERE doctor_id = ?1 AND is_booked = false",nativeQuery = true)
    List<Availability> findAllByDoctorIdAndAvailableSlots(String doctorId);
}
