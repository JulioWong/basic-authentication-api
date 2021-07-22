package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProfesorDAO;
import com.example.demo.entity.Profesor;

@Service
public class ProfesorServiceImpl implements IProfesorService {

	@Autowired
	IProfesorDAO profesorDAO;
	
	@Override
	public List<Profesor> findAllProfesor() {
		return (List<Profesor>) profesorDAO.findAll();
	}

}
