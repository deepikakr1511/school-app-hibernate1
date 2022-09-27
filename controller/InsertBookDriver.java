package com.ty.school.controller;

import com.ty.school.dao.ReferenceBookDao;
import com.ty.school.dto.ReferenceBook;

public class InsertBookDriver {

	public static void main(String[] args) {
		ReferenceBook r=new ReferenceBook();
		r.setId(3);
		r.setName("sdfg");
		r.setAuthor("dcfgh");
		r.setSub("sdfg");
		ReferenceBookDao rd=new ReferenceBookDao();
		ReferenceBook res=rd.saveBook(r);
		System.out.println(res);
	}

}
