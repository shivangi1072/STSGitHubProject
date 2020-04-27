package main;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import Bean.Student;
import config.MyFactory;
import dao.StudentDao;

public class StudentMain {
	public static void main(String args[])
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int l=sc.nextInt();*/
		EntityManager em=MyFactory.getEntityManager();
		EntityTransaction tx=em.getTransaction();  
		 tx.begin();
		/*StudentDao sd=new StudentDao();
		String result=sd.createStudent(new Student("Shruti",85,23));
		String result1=sd.createStudent(new Student("Mihir",84,23));
		String result2=sd.createStudent(new Student("Ravi",85,22));
		String result3=sd.createStudent(new Student("Shivi",85,23));
		String result4=sd.createStudent(new Student("Sanchit",79,23));
		System.out.println(result);*/
		
		 /*Query q=em.createQuery(" delete from Student s where s.sid=:id");
		q.setParameter("id",l);
		int rows=q.executeUpdate();
	    System.out.println("rows deleted"+"\t"+rows);
	    tx.commit();*/
		
		
		
		/*Student s=sd.getStudent(1001);
		System.out.println(s.getName()+"\t"+s.getAge()+"\t"+s.getMarks());*/
		
		/*String res=sd.deleteStudent(1003);
		System.out.println(res);*/
		
		/*String res=sd.updateStudentAge(1001, 19);
		System.out.println(res);*/
		
		/*List<Student> li=sd.getAllStudent();
		for(Student s:li)
		{
			System.out.println(s.getName()+"\t"+s.getSid()+"\t"+s.getMarks()+"\t"+s.getAge());
		}*/
		
		/*List<Student> li=sd.getStudentByMarks();
		for(Student s:li)
		{
			System.out.println(s.getName()+"\t"+s.getSid()+"\t"+s.getMarks()+"\t"+s.getAge());
		}*/
		
		 Query q=em.createNamedQuery("getAllStudent");
		 List<Student> li=q.getResultList();
			for(Student s:li)
			{
				System.out.println(s.getName()+"\t"+s.getSid()+"\t"+s.getMarks()+"\t"+s.getAge());
			}
		
		
	}

}
