package com.capston.appointmentservice.DAO;

import com.capston.appointmentservice.Entities.Precription;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PrescriptionDAO  extends MongoRepository<Precription,String> {
}
