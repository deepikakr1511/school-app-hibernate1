package com.ty.school.controller;

import com.ty.school.dao.ReferenceBookDao;
import com.ty.school.dto.ReferenceBook;

public class UpdateBookDriver {

	public static void main(String[] args) {
		ReferenceBook r=new ReferenceBook();
		r.setId(3);
		r.setName("super man");
		r.setAuthor("manoj");
		r.setSub("power");
		ReferenceBookDao rd= new ReferenceBookDao();
		ReferenceBook res=rd.updateUser(r);
		System.out.println(res);
	}

}
