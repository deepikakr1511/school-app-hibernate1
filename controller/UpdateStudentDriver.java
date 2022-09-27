package com.ty.school.controller;

import com.ty.school.dao.StudentDao;
import com.ty.school.dto.Student;

public class UpdateStudentDriver {

	public static void main(String[] args) {
		Student s=new Student();
		s.setRol(4);
		s.setName("john");
		s.setPercentage(80);
		StudentDao sd=new StudentDao();
		Student res=sd.updateUser(s);
		System.out.println(res);
	}

}
