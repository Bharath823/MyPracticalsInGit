package com.uis.ExaThought;

import java.io.File;

public class Util 
{
	public static boolean checkCredit(int cnum)
	{
		File fl = new File("C:\\Interview_Programmes\\"+cnum);
		
		if(fl.exists() && fl.isFile())
		{
			return true;
		}
		return false;
	}
}
