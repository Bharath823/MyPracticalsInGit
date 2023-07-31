package com.uis.java8_features;

import java.util.function.Function;
import java.util.function.Predicate;

class Student
{
	String name;
	int marks;
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
}

public class Test_Student_Function {

	public static void main(String[] args) {
		Function<Student,String> f = s->{
			int marks = s.marks;
			String grade = "";
			
			if(marks>=80) grade="A[Dictinction]";
			else if(marks>=60) grade="B[First Class]";
			else if(marks>=50) grade="C[Second Class]";
			else if(marks>=35) grade="D[Third Class]";
			else grade="E[Failed]";
			
			return grade;
		};
		
		Predicate<Student> p = s->s.marks>=60;
		
		Student[] st = {
				new Student("Bharath",100),
				new Student("Akash",65),
				new Student("Vikas",55),
				new Student("Kishore",45),
				new Student("Lucky",25),
		};
		
		for(Student s : st) {
			if(p.test(s))
			{
				System.out.print("Student name:"+s.name);
				System.out.print(", Student marks:"+s.marks);
				System.out.println(", Student Grade:"+f.apply(s));
				System.out.println();
			}
		}
	}

}
