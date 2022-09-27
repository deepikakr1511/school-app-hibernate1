package com.ty.school.controller;

import com.ty.school.dao.ReferenceBookDao;

public class DeleteBookDriver {

	public static void main(String[] args) {
		ReferenceBookDao rd=new ReferenceBookDao();
		boolean res=rd.deleteBook(2);
		System.out.println(res);
	}

}
