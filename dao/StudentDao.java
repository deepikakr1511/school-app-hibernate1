package com.ty.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.Student;

public class StudentDao {
	public Student saveStudent(Student  stu)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		if(stu!=null)
		{
		entityTransaction.begin();
		entityManager.persist(stu);
		entityTransaction.commit();
		return stu;
		}
		else
			return null;
	}
	public Student findStudentById(int rol)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Student s=entityManager.find(Student.class,rol );
		if(s!=null)
		{
			System.out.println("roll no:"+s.getRol());
			System.out.println("name :"+s.getName());
			System.out.println("percentage :"+s.getPercentage());
			
			return s;
		}
		else
		{
			System.out.println("invalid roll no ");
			return null;
		}
	}
	public boolean deleteStudent(int rol)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Student res=entityManager.find(Student.class, rol);
		if(res!=null)
		{
			entityTransaction.begin();
			entityManager.remove(res);
			entityTransaction.commit();
			return true;
		}
		else
		{
			System.out.println("invalid roll no");
			return false;
		}
		
		
	}
	public Student updateUser(Student stu)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(stu);
		entityTransaction.commit();
		return stu;
		
	}

}
