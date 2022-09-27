package com.ty.school.controller;

import com.ty.school.dao.UserDao;

public class FindUserByIdDriver {

	public static void main(String[] args) {
		UserDao ud=new UserDao();
		ud.findUserById(1);

	}

}
