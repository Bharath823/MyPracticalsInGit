package com.uis.MockTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input Path");
		String inPath = sc.nextLine();

		System.out.println("Enter the Output Path");
		String outPath = sc.nextLine();

		BufferedReader br = null;
		BufferedWriter bw = null;

		File inf = new File("C://IO//" + inPath + ".txt");
		File out = new File("C://IO//" + outPath + ".txt");
		
		if(inf.exists()) 
		{
			try
			{
				br = new BufferedReader(new FileReader(inf));
				bw = new BufferedWriter(new FileWriter(out));
				String line;
				Set aset = new TreeSet(new SortByLength());
	
				while ((line = br.readLine()) != null) {
					String[] srr = line.split(" ");
					for (int i = 0; i < srr.length; i++) {
						aset.add(srr[i]);
					}
	
				}
				System.out.println(aset);
	
				List<String> list = new ArrayList(aset);
				for (String x : list) {
					bw.write(x + " ");
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (bw != null) {
					try {
						bw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
	
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}else {
			System.out.println("Invalid Input");
		}
	}

}

class SortByLength implements Comparator {

	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		} else {
			return 0;
		}
	}
}
