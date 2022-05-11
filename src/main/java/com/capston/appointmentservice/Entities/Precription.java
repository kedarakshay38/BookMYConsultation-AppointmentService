package com.capston.appointmentservice.Entities;

import com.capston.appointmentservice.Controller.MedicineList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Precription{

    @Id
    private String _id;

    private String userId;

    private String doctorId;

    private String doctorName;

    private String appointmentId;

    private String diagnosis;
    private List<MedicineList> medicineList;







}
