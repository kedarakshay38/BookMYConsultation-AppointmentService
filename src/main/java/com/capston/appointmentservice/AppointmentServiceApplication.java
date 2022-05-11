package com.capston.appointmentservice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AppointmentServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(AppointmentServiceApplication.class, args);
		System.out.println("welcome to appointment service");
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
