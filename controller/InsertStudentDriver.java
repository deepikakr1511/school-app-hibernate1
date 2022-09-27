package com.ty.school.controller;

import com.ty.school.dao.StudentDao;
import com.ty.school.dto.Student;

public class InsertStudentDriver {

	public static void main(String[] args) {
		Student s=new Student();
		s.setRol(4);
		s.setName("john");
		s.setPercentage(85);
		StudentDao sd=new StudentDao();
		Student res=sd.saveStudent(s);
		System.out.println(res);
	}

}
