package com.springboot.controller;

import java.util.List;

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
	public List<Student> getStudentsOfClass(@PathVariable(value = "classrequired") int clientclassReq) {

		List<Student> responseList = studentService.getAllStudentsOfClass(clientclassReq);

		return responseList;

	}

}
