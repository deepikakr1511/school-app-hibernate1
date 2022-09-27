package com.ty.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.User;

public class UserDao {
	public User saveUser(User user)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		if(user!=null)
		{
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
		}
		else
			return null;
	}
	public User findUserById(int id)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		User u=entityManager.find(User.class,id );
		if(u!=null)
		{
			System.out.println("id :"+u.getId());
			System.out.println("name :"+u.getName());
			System.out.println("email id :"+u.getEmail());
			System.out.println("password :"+u.getPwd());
			System.out.println("phone no :"+u.getPhone());
			System.out.println("gender :"+u.getGender());
			return u;
		}
		else
		{
			System.out.println("invalid id ");
			return null;
		}
	}
	public boolean deleteUser(int id)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		User res=entityManager.find(User.class, id);
		if(res!=null)
		{
			entityTransaction.begin();
			entityManager.remove(res);
			entityTransaction.commit();
			return true;
		}
		else
		{
			System.out.println("invalid id");
			return false;
		}
		
		
	}
	public User updateUser(User user)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();
		return user;
		
	}

}
