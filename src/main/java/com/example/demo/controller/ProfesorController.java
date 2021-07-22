package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Profesor;
import com.example.demo.service.ProfesorServiceImpl;

@RestController
public class ProfesorController {

	@Autowired
	ProfesorServiceImpl profesorService;
	
	@RequestMapping(value = "/todos_profesores_public", method = RequestMethod.GET)
	public ResponseEntity<List<Profesor>> listAllProfesor() {
		List<Profesor> profesores = profesorService.findAllProfesor();
		
		if(profesores.isEmpty()) {
			return new ResponseEntity<List<Profesor>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Profesor>>(profesores, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/todos_profesores_admin", method = RequestMethod.GET)
	public ResponseEntity<List<Profesor>> listAllProfesorAdmin() {
		List<Profesor> profesores = profesorService.findAllProfesor();
		
		if(profesores.isEmpty()) {
			return new ResponseEntity<List<Profesor>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Profesor>>(profesores, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/todos_profesores_user", method = RequestMethod.GET)
	public ResponseEntity<List<Profesor>> listAllProfesorUser() {
		List<Profesor> profesores = profesorService.findAllProfesor();
		
		if(profesores.isEmpty()) {
			return new ResponseEntity<List<Profesor>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Profesor>>(profesores, HttpStatus.OK);
	}
}
