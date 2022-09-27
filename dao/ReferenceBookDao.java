package com.ty.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.ReferenceBook;


public class ReferenceBookDao {
	public ReferenceBook saveBook(ReferenceBook  ref)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		if(ref!=null)
		{
		entityTransaction.begin();
		entityManager.persist(ref);
		entityTransaction.commit();
		return ref;
		}
		else
			return null;
	}
	public ReferenceBook findBookById(int rol)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		ReferenceBook r=entityManager.find(ReferenceBook.class,rol );
		if(r!=null)
		{
			System.out.println("id :"+r.getId());
			System.out.println("name :"+r.getName());
			System.out.println("author :"+r.getAuthor());
			System.out.println("subject :"+r.getSub());
			
			return r;
		}
		else
		{
			System.out.println("invalid id");
			return null;
		}
	}
	public boolean deleteBook(int id)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		ReferenceBook res=entityManager.find(ReferenceBook.class, id);
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
	public ReferenceBook updateUser(ReferenceBook ref)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(ref);
		entityTransaction.commit();
		return ref;
		
	}

}
