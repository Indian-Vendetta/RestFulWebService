package com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student123")
public class Student {

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "AGE")
	private int age;
	@Column(name = "STUDENT_CLASS")
	private int student_class;
	@Column(name = "FATHER_NAME")
	private String father_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudent_class() {
		return student_class;
	}

	public void setStudent_class(int student_class) {
		this.student_class = student_class;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public Student(int id, String name, int age, int student_class, String father_name) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.student_class = student_class;
		this.father_name = father_name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
