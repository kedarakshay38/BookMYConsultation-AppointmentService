package com.capston.appointmentservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AvailabilityDTO {

    private String doctorId;

    private HashMap<String, List<String>> doctorAvailabilityTime;
}
