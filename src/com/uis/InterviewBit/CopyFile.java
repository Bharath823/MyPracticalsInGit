package com.uis.InterviewBit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		File sourcefile = new File("C:\\IO\\outt.txt");
		File destnfile = new File("C:\\IO\\BC.txt");
		
		FileInputStream inStream = null;
		FileOutputStream outstream= null;
		
		try {
			inStream = new FileInputStream(sourcefile);
			outstream =  new FileOutputStream(destnfile);
			byte[] bytearray = new byte[1024];
			int length;
			
			while((length=inStream.read(bytearray))!=-1) {
				outstream.write(bytearray);
			}
			System.out.println("Successfully Copied..");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				inStream.close();
				outstream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
