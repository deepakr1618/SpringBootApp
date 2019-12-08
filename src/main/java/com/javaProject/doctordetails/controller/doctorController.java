package com.javaProject.doctordetails.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.javaProject.doctordetails.model.doctor;

@RestController
@RequestMapping("/api")
public class doctorController {
	@Autowired
	DAO docDAO;
	
	
	@GetMapping()
	public String test() {
		return "REST Default GET";
	}
	
	//SAVE
	@PostMapping("/doctors")
	public doctor createDoctor(@Valid @RequestBody doctor d) throws Exception {
		return docDAO.createOrUpdate(d);
	}
	
	
	//UPDATE
	@PutMapping("/doctors")
	public doctor updateDoctor(@Valid @RequestBody doctor d) throws Exception {
		return docDAO.createOrUpdate(d);
	}	
	
	
	@GetMapping("/doctors/{id}")
	public ResponseEntity<doctor> getDocByID(@PathVariable("id") Long id) throws Exception{
		try {
			doctor doc = docDAO.getByID(id);
			System.out.println(doc);
			return ResponseEntity.ok().body(doc);
		}catch(Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
	
	
	@DeleteMapping("/doctors/{id}")
	public ResponseEntity<doctor> deleteDocByID(@PathVariable("id") Long id) throws Exception{
		try {
			doctor doc = docDAO.deleteByID(id);
			System.out.println(doc);
			return ResponseEntity.ok().body(doc);
		}catch(Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/doctors")
	public List<doctor> getAllEmployee(){
		return docDAO.findAll();
	}
}
