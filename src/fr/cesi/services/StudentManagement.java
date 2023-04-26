package fr.cesi.services;

import java.util.List;

import fr.cesi.dataAccess.*;

public class StudentManagement {
	
	public List<Student> studentList;

	public StudentManagement(List<Student> studentList) {
		super();
		this.studentList = studentList;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public void addStudent(Student newStudent) {
		
		//On vérifie que l'étudiant n'existe pas déjà dans la BDD
		if (newStudent.email != student.getEmail(newStudent.email)) {
			insert(newStudent);
		}
		else {
			 System.out.println(
		                "Cet étudiant existe déjà.");
		}
	}
	
	
	

}
