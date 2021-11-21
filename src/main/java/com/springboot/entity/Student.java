package com.springboot.entity;

public class Student {

	private int id;
	private String name;
	private int studentClass;
	private int age;
	private String fatherName;

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

	public int getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int studentClass, int age, String fatherName) {
		super();
		this.id = id;
		this.name = name;
		this.studentClass = studentClass;
		this.age = age;
		this.fatherName = fatherName;
	}

}
