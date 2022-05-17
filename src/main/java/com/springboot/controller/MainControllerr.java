package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Student;
import com.springboot.service.StudentsService;

@RestController
public class MainControllerr {

	@Autowired
	StudentsService studentService;

	@GetMapping(value = "/getStudentofclass/{classrequired}")
	public List<Student> getStudentsOfClass(@PathVariable int classrequired) {
		
		//testing

		List<Student> responseList = studentService.getAllStudentsOfClass(classrequired);

		return responseList;

	}

	@GetMapping(value = "/getStudentofclass1/{id}")
	public Optional<Student> getStudentsOfClassById(@PathVariable(value="id") int id) {

		Optional<Student> responseList = studentService.getAllStudentsByID(id);

		return responseList;

	}

}
