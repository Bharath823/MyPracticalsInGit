package com.uis.InterviewBit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class SortTextFile {

	public static void main(String[] args) {
		String[] input1 = {"56","Suresh","Mahesh","Abhi","81","Vikas","Bhavani","Nalini","62"};
		
		TreeSet set = new TreeSet<>();
		
		for(int i=0; i<input1.length; i++) {
			set.add(input1[i]);
		}
		
		for(Object o : set) {
			System.out.println(o);
		}
		
		System.out.println("-----------------------------------");
		
		input1 = new String[] {"Suresh 80","Vikas 95","Nalini 50","Mahesh 68","Abhi 45","Bhavani 70"};
		
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter(new File("C:\\PRACTICALS\\CollectionLab1\\Student")));
			for(int i=0; i<input1.length; i++) {
				writer.write(input1[i]);
				writer.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		ArrayList<Studentt> student_list = new ArrayList<>();
		
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader(new File("C:\\PRACTICALS\\CollectionLab1\\Student")));
			String line;
			while((line=reader.readLine()) != null)
			{
				String[] st = line.split(" ");
				String name = st[0];
				int marks = Integer.parseInt(st[1]);
				
				student_list.add(new Studentt(name,marks));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(reader != null)
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		System.out.println("Sorting based on Student Name");
		Collections.sort(student_list,new StudentNameComparator());
		
		Iterator<Studentt> itr = student_list.iterator();
		while(itr.hasNext())
		{
			Studentt stn =  itr.next();
			System.out.println(stn);
		}
		
		System.out.println("------------------------");
		System.out.println("\n"+"Sorting based on Student Marks"+"\n");
		Collections.sort(student_list,new StudentMarksComparator());
		itr = student_list.iterator();
		while(itr.hasNext())
		{
			Studentt stn =  itr.next();
			System.out.println(stn);
		}
	}

}
class Studentt
{
	String name;
	int marks;
	public Studentt(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
}

class StudentNameComparator implements Comparator<Studentt>
{

	@Override
	public int compare(Studentt o1, Studentt o2) 
	{
		return o1.name.compareTo(o2.name);
	}
}

class StudentMarksComparator implements Comparator<Studentt>
{

	@Override
	public int compare(Studentt o1, Studentt o2) {
		return o1.marks-o2.marks;
	}
	
}