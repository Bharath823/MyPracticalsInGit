package com.uis.InterviewBit;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class HashSetPgm {

	public static void main(String[] args) {
		HashSet<Student> student = new HashSet<>();
		student.add(new Student("Bharath", 101, "GC"));
		student.add(new Student("Nandan", 103, "BC"));
		student.add(new Student("Nuthan", 104, "IC"));
		student.add(new Student("Span", 102, "PC"));
		student.add(new Student("Span", 102, "MC"));
		
		Iterator<Student> itr = student.iterator();
		while(itr.hasNext())
		{
			Student s = (Student) itr.next();
			System.out.println(s);
		}
	}

}

class Student
{
	private String name;
	private int roll_no;
	private String department;
	
	public Student(String name, int roll_no, String department) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public String getDepartment() {
		return department;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public int hashCode() {
		return Objects.hash(roll_no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return roll_no == other.roll_no;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + ", department=" + department + "]";
	}
	
	
	
}
