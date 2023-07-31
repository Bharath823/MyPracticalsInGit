package com.uis.codeEvaluvation;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.Integer.*;
import static java.lang.Byte.*;
import static java.lang.Integer.MAX_VALUE;
import java.lang.Math.*;
import java.sql.SQLException;

public class StaticImport {

	//static int MAX_VALUE = 999;
	
	public static void main(String[] args) {
//		out.print("Hai");
//		out.println();
//		out.println("Hello");
//		
//		out.println(MAX_VALUE); //The field MAX_VALUE is ambiguous b/c both Integer & Byte have MAX_VALUE
//		
//	//	out.println(MAX_VALUE); // current class static members have highest priority
//		
//		out.println(Byte.MAX_VALUE); 
//		out.println(Integer.MAX_VALUE); 
//		
//		out.println((int)Math.sqrt(4));
		
		//BufferedReader br = null;
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\IO\\in.txt"));){
			String x = null;
			
			while((x = br.readLine()) != null) {
				System.out.println(x);
			}

		} catch ( IOException e) {
			e.printStackTrace();
		} 
		
	}

}
