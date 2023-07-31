package com.uis.InterviewBit;

import java.io.IOException;

public class LaunchExternalApplication {

	public static void main(String[] args)
	{
		Runtime runtime = Runtime.getRuntime();     //getting Runtime object
		 
        try
        {
            runtime.exec("notepad.exe");        //opens new notepad instance
            
            String[] str= new String[]{"C:\\Program Files\\Notepad++\\notepad++.exe"};        
 
            Process process = runtime.exec(str);
            
            try {
				Thread.sleep(5000);
			} 
            catch (InterruptedException e) {
				e.printStackTrace();
			}
            
            process.destroy();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
	}

}
