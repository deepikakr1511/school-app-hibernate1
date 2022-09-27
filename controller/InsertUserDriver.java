package com.ty.school.controller;


import com.ty.school.dao.UserDao;
import com.ty.school.dto.User;

public class InsertUserDriver {

	public static void main(String[] args) {
		User u=new User();
		UserDao ud=new UserDao();
		u.setName("john");
		u.setEmail("john@gmail.com");
		u.setPwd("4567");
		u.setPhone(45678);
		u.setGender("male");
		ud.saveUser(u);
	}

}
