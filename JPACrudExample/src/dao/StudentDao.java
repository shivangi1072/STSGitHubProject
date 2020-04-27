package dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import Bean.Student;
import config.MyFactory;

public class StudentDao {
   EntityManager em=MyFactory.getEntityManager();
   public String createStudent(Student s) {
	 EntityTransaction tx=em.getTransaction();  
	 tx.begin();
	 em.persist(s);
	 tx.commit();
	 return "Student Saved!!!!";
   }
   
   public Student getStudent(int sid) {
		 Student stu =em.find(Student.class, sid);
		 return stu;
	   }
   
   public String deleteStudent(int sid) {
	   EntityTransaction tx=em.getTransaction();  
		 tx.begin();
		 Student stu =em.find(Student.class, sid);
		 em.remove(stu);
		 tx.commit();
		 return "Student Deleted!!!!";
	   }
   
   public String updateStudentAge(int sid, int age) {
	   EntityTransaction tx=em.getTransaction();  
		 tx.begin();
		 Student stu =em.find(Student.class, sid);
		 if(stu!=null)
		 {
			 stu.setAge(age);
			 em.persist(stu);
			 return "Student updated!!!";
		 }
		 else {
			 return "Student not available";
		 }
   }
		 
		 public List<Student> getAllStudent()
		 {
			 
			 List<Student> li= em.createQuery("from Student s").getResultList();
			 return li;
		 }
		 
		 public List<Student> getStudentByMarks()
		 {
			 
			 List<Student> li= em.createQuery("from Student s where s.marks>60").getResultList();
			 return li;
		 }
   }

	

