package com.capston.appointmentservice.Controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
public class MedicineList{

    private  String name;
    private  String dosage;
    private  String frequency;
    private  String remqrks;

}
