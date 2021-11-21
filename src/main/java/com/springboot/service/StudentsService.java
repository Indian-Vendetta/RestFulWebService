package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springboot.SeededConfiguration;
import com.springboot.entity.Student;

@Service
public class StudentsService {

	/*
	 * SeededConfiguration config;
	 * 
	 * public StudentsService() { super(); // TODO Auto-generated constructor stub }
	 */

	/*
	 * public StudentsService(SeededConfiguration config) { super(); this.config =
	 * config; }
	 */

	public List<Student> getAllStudentsOfClass(int classofStudents) {
		return getStudentsofParticularClass(classofStudents);
	}

	public List<Student> getStudentsofParticularClass(int classofStudents) {

		List<Student> listofStudents = new ArrayList<>();

		listofStudents.add(new Student(1, "varsha", 9, 14, "XYX"));
		listofStudents.add(new Student(2, "Bharath", 10, 15, "Kumar"));
		listofStudents.add(new Student(3, "Guru", 10, 15, "HHH"));

		List<Student> list1 = listofStudents;

		List<Student> filteredList = list1.stream().filter(record -> record.getStudentClass() == classofStudents)
				.collect(Collectors.toList());

		return filteredList;
	}

}
