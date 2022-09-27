package com.ty.school.controller;

import com.ty.school.dao.StudentDao;
import com.ty.school.dto.Student;

public class FindStudentByRollDriver {

	public static void main(String[] args) {
		StudentDao sd=new StudentDao();
		Student res=sd.findStudentById(1);
		System.out.println(res);
		
	}

}
