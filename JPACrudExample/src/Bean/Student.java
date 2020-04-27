package Bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Column;
@Entity
@Table(name="Student1")
@NamedQueries(@NamedQuery(name="getAllStudent", query="from Student s"))
public class Student {
@Id
@Column(name="StudentID")
@GeneratedValue(strategy=GenerationType.AUTO)
private int sid;
@Column(name="StudentName")
private String name;
private int marks;
private int age;
public Student()
{
	
}
public Student(String name, int marks, int age) {
	super();
	this.sid = sid;
	this.name = name;
	this.marks = marks;
	this.age = age;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
