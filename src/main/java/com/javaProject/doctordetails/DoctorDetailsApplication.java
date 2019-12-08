package com.javaProject.doctordetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.javaProject.doctordetails.controller.doctorController;
import com.javaProject.doctordetails.model.doctor;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackageClasses=doctorController.class)
public class DoctorDetailsApplication {
	public static void main(String[] args) {
		SpringApplication.run(DoctorDetailsApplication.class, args);
	}

}
