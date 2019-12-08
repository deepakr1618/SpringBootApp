package com.javaProject.doctordetails.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaProject.doctordetails.model.doctor;
import com.javaProject.doctordetails.repository.doctorRepository;


@Service
public class DAO {

	@Autowired
	doctorRepository docRepo;
	
	public List<doctor> getAllDoctors(){
		List<doctor> docList = docRepo.findAll();
		if(docList.size()>0) {
			return docList;
		}else {
			return new ArrayList<doctor>();
		}
	}
	
	//TO SAVE(CREATE)
	public doctor createOrUpdate(doctor d) throws Exception{
		Optional<doctor> doc = docRepo.findById(d.getID());
		if(doc.isPresent()) {
			doctor newDoc = doc.get();
			newDoc.setSpecial(d.getSpecial());
			newDoc.setName(d.getName());
			newDoc.setRoom(d.getRoom());
			newDoc.setSalary(d.getSalary());
			newDoc.setDegree(d.getDegree());
			newDoc = docRepo.save(newDoc);
			return newDoc;
		}else {
			d = docRepo.save(d);
			return d;
		}
	}
	
	//TO RETIRIEVE (RETRIEVE)
	public List<doctor> findAll(){
		return docRepo.findAll();
	}
	
	//GET DOC BY ID
	public doctor getByID(Long ID) throws Exception {
		Optional<doctor> doc = docRepo.findById(ID.intValue());
		if(doc.isPresent()) {
			return doc.get();
		}else {
			throw new Exception("Doctor not found!");
		}
	}
	
	
	
	//DELETE BY OBJECT
	public doctor deleteByID(Long id) throws Exception {
		Optional<doctor> doc = docRepo.findById(id.intValue());
		if(doc.isPresent()) {
			docRepo.deleteById(id.intValue());
			return doc.get();
		}else {
			throw new Exception("Doctor does not exist");
		}
	}
	
}
