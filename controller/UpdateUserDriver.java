package com.ty.school.controller;

import com.ty.school.dao.UserDao;
import com.ty.school.dto.User;

public class UpdateUserDriver {

	public static void main(String[] args) {
		User u=new User();
		u.setId(4);
		u.setName("john k");
		u.setEmail("john@gmail.com");
		u.setPwd("def");
		u.setPhone(34556);
		u.setGender("male");
		UserDao ud=new UserDao();
		ud.updateUser(u);
	}

}
