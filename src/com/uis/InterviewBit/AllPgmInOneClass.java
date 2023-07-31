package com.uis.InterviewBit;

public class AllPgmInOneClass {

	public static void main(String[] args)
	{
		String s = "I Am Not String"; 
		
		//output=  "g ni rtS toNmAI"
		
		reverseString(s.toString());
	}	
		
	
	public static void reverseString(String s)
	{
		char[] inputarr = s.toCharArray();
		
		char[] newarr = new char[inputarr.length];
		
		for(int i=0; i<inputarr.length; i++)
		{
			if(inputarr[i]==' ') {
				newarr[i] = ' ';
			}
		}
		
		//Initializing 'j' with length of resultArray
        
        int j = newarr.length-1;
                 
        //Second for loop :
        //we copy every non-space character of inputStringArray 
        //from first to last at 'j' position of resultArray
         
        for (int i = 0; i < inputarr.length; i++)
        {
            if (inputarr[i] != ' ')
            {
                //If resultArray already has space at index j then decrementing 'j'
                 
                if(newarr[j] == ' ')
                {
                    j--;
                }
                 
                newarr[j] = inputarr[i];
                 
                j--;
            }
        }
        System.out.println(s+" ---> "+String.valueOf(newarr));
		
	}
}
