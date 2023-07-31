package com.uis.InterviewBit;

import java.io.File;

import javax.swing.filechooser.FileSystemView;

public class Drives_Find_Space 
{

	public static void main(String[] args) 
	{
		
//	File.listRoots() method gives the list of all drives of your system
		File[] drives = File.listRoots();
        
		File drive1 = drives[0];
		File drive2 = drives[1];
		
		if(drives.length > 0 && drives != null)
		{
		    for (File drive : drives) 
		    {
		        System.out.println("Drive Name : "+drive);
		    }
		}
		System.out.println("================================="+"\n");
	
		
//	To find the type of a drive (Local disk or CD Drive or Floppy Disk), 
//	we use getFileSystemView() method of javax.swing.filechooser.FileSystemView.
		
		FileSystemView fsv = FileSystemView.getFileSystemView();
		
		System.out.println("Type of Drive : "+fsv.getSystemTypeDescription(drive1));
		System.out.println("Type of Drive : "+fsv.getSystemTypeDescription(drive2));
		
		
//	to find type, total space, free space and usable space of all drives in java.
		
		 if(drives.length > 0 && drives != null)
	        {
	            for (File drive : drives) 
	            {   
	                System.out.println("====================");
	                 
	                System.out.println("Drive Name : "+drive);
	                 
	                System.out.println("Type Of Drive : "+fsv.getSystemTypeDescription(drive));
	                 
	                System.out.println("Total Space : "+drive.getTotalSpace()/(1024*1024*1024)+" GB");
	                 
	                System.out.println("Free Space : "+drive.getFreeSpace()/(1024*1024*1024)+" GB");
	                 
	                System.out.println("Usable Space : "+drive.getUsableSpace()/(1024*1024*1024)+" GB");
	            }
	        }
	}

}
