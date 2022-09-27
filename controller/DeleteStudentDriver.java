package com.ty.school.controller;

import com.ty.school.dao.StudentDao;

public class DeleteStudentDriver {

	public static void main(String[] args) {
		StudentDao sd=new StudentDao();
		boolean  res=sd.deleteStudent(4);
		System.out.println(res);
	}

}
