package com.javaProject.doctordetails.repository;


import org.springframework.data.jpa.repository.*;
import com.javaProject.doctordetails.model.*;


public interface doctorRepository extends JpaRepository<doctor , Integer>{
	
}
