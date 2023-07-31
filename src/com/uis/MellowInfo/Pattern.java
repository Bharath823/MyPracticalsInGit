/*
 	* * * * * 
 	  * * *
          * *
            *
 */

package com.uis.MellowInfo;

public class Pattern
{

	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			if(i==3) 
			{
				continue;
			}
			for(int j=1; j<=5; j++)
			{
				if(i>j || (i==2&&j==5)) {
					System.out.print("  ");
				}
				else if((i==j || i<j))
				{
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
		
		System.out.println("----------------------------"+"\n");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if((i==1) || (i==5) || (j==1) || (j==5))
				{
					System.out.print(" true ");
				}
				else {
					System.out.print("false ");
				}
			}
			System.out.println();
		}
		
		System.out.println("----------------------------"+"\n");
		
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%3 ==1) 
				{
					System.out.print("* ");
				}
				else if(i%3 ==2)
				{
					System.out.print(j+" ");
				}
				else if(i%3==0)
				{
					System.out.print((char)(64+j)+" ");
				}
			}
			System.out.println();
		}	
		
System.out.println("----------------------------"+"\n");
		
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%3 ==1) 
				{
					System.out.print("* ");
				}
				else if(i%3 ==2)
				{
					System.out.print(i+" ");
				}
				else if(i%3==0)
				{
					System.out.print((char)(64+i)+" ");
				}
			}
			System.out.println();
		}	
		
System.out.println("----------------------------"+"\n");
		
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i>=j && i+j<=10)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}	
		
		
System.out.println("----------------------------"+"\n");
		
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i+j>=6 && i-j<5)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}	
		
System.out.println("----------------------------"+"\n");
		
/*
 	* * * * * * * * * 
	  * * * * * * *   
	    * * * * *     
	      * * *       
	        *  
 */
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if(i<=j && i+j<=10)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
System.out.println("----------------------------"+"\n");
		

/*
 		*         
      * * *       
    * * * * *     
  * * * * * * *   
* * * * * * * * * 

*/
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if((i+j>=6) && (j-i<=4))
				//if((j>=6-i) && (j<=i+4))
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}	
		
System.out.println("----------------------------"+"\n");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i+j>=6)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}	
		
System.out.println("----------------------------"+"\n");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j>=i)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
System.out.println("----------------------------"+"\n");
		
		for(int i=5; i>=1; i--)
		{
			for(int j=i; j<=5; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}	
		
System.out.println("----------------------------"+"\n");
		
		for(int i=5; i>=1; i--)
		{
			for(int j=i; j<=5; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}	

		
System.out.println("----------------------------"+"\n");
		
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}	
		
System.out.println("----------------------------"+"\n");
		
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
System.out.println("----------------------------"+"\n");
		
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(70-j)+" ");
			}
			System.out.println();
		}	
		
System.out.println("----------------------------"+"\n");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print((char)(70-i)+" ");
			}
			
			System.out.println();
		}	
	}
}
