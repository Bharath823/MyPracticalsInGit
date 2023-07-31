package com.uis.InterviewBit;

public class DuplicateCharacters {

	public static void main(String[] args) 
	{
		String str = new String("Sakkett");
		duplicateChar(str);
        
        int[] inputArray = {1, 2, 3, 2, 1,5,4,2};
        DuplicateCharacters.occurenceOfEle(inputArray);
	}
	
	public static void duplicateChar(String str) 
	{
		int count = 0;
        
        char[] chars = str.toCharArray();
        System.out.println("Duplicate characters are:");
        
        for (int i=0; i<chars.length;i++) 
        {
        	for(int j=i+1; j<chars.length;j++)
            {
        		if (chars[i] == chars[j]) 
        		{
        			System.out.println(chars[j]);
        			count++;
        			break;
        		}
            }
         }
        
        System.out.println("count = "+count);
	}
	
	public static void occurenceOfEle(int[] inputArray)
	{
		boolean[] visited = new boolean[inputArray.length];

		for (int i = 0; i < inputArray.length; i++) 
		{
		  if (!visited[i]) 
		  {
		    int count = 1;
		    for (int j = i + 1; j < inputArray.length; j++)
		    {
		      if (inputArray[i] == inputArray[j]) {
		        count++;
		        visited[j] = true;
		      }
		    }
		    System.out.println(inputArray[i] + " " + count);
		  }
		}
	}
}
