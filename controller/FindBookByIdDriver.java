package com.ty.school.controller;

import com.ty.school.dao.ReferenceBookDao;
import com.ty.school.dto.ReferenceBook;

public class FindBookByIdDriver {

	public static void main(String[] args) {
		ReferenceBookDao rd= new ReferenceBookDao();
		ReferenceBook res=rd.findBookById(1);
		System.out.println(res);
	}

}
