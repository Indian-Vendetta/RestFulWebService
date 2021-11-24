package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.SeededConfiguration;
import com.springboot.entity.Student;
import com.springboot.repository.StudentRepository;

@Service
public class StudentsService {

	@Autowired
	StudentRepository studentRepo;

	public List<Student> getAllStudentsOfClass(int classofStudents) {
		return getStudentsofParticularClass(classofStudents);
	}

	public List<Student> getStudentsofParticularClass(int classofStudents) {

		List<Student> list1 = studentRepo.findAll();

		List<Student> filteredList = list1.stream().filter(record -> record.getStudent_class() == classofStudents)
				.collect(Collectors.toList());

		return filteredList;
	}

	public Optional<Student> getAllStudentsByID(int id) {

		return studentRepo.findById(id);
	}

}
