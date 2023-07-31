package com.uis.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;

public class TestSerializDeSerializ {

	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			System.out.println("Enter input");
//			String l = br.readLine();
//			System.out.println("Enter the int");
//			int i = br.read();
//			
//			System.out.println(l);
//			System.out.println(i);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		Employee emp1 = new Employee("Bharath","103","35000");
		//Employee emp2 = new Employee("Nikil","105","45000");
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos = new FileOutputStream("C:\\IO\\emp1");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(emp1);
		//	oos.writeObject(emp2);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		FileInputStream fis =null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("C:\\IO\\emp1");
			ois = new ObjectInputStream(fis);
			Employee emp01 = (Employee)ois.readObject();
			//Employee emp02 = (Employee)ois.readObject();
			System.out.println(emp01);
		//	System.out.println(emp02);
			
			System.out.println("emp1 == emp01 -> "+(emp1==emp01));
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
class Employee implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String empName;
	private String empId;
	private transient String empSalay;
	
//	public Employee() {
//		System.out.println("In Employee-> no arg constructor");
//	}
	
	public Employee(String empName, String empId, String empSalay) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalay = empSalay;
		System.out.println("In Employee-> parameterized constructor");
	}

	public String getEmpName() {
		return empName;
	}
	public String getEmpId() {
		return empId;
	}
	public String getEmpSalay() {
		return empSalay;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public void setEmpSalay(String empSalay) {
		this.empSalay = empSalay;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, empSalay);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empId, other.empId) && Objects.equals(empName, other.empName)
				&& Objects.equals(empSalay, other.empSalay);
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSalay=" + empSalay + "]";
	}

}
