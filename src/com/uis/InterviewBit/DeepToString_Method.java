package com.uis.InterviewBit;

import java.util.Arrays;

public class DeepToString_Method {

	public static void main(String[] args) 
	{
		String[] oneDimension = new String[]{"One","Two","Three","Four","Five"};
		
		String[][] twoDimension = new String[][]{{"One","Two","Three","Four","Five"},
												{"Five","Six","Seven","Eight"}
												};
		
		String[][][] threeDimension = new String[][][]
													{
														{
											                {"ONE", "TWO", "THREE"},
											                {"FOUR", "FIVE", "SIX", "SEVEN"}
											            },
														
														{
											                {"EIGHT", "NINE", "TEN", "ELEVEN"},
											                {"TWELVE", "THIRTEEN", "FOURTEEN"}
											            },
											            {
											                {"FIFTEEN", "SIXTEEN"} ,
											                {"SEVENTEEN", "EIGHTEEN", "NINETEEN"},
											                {"TWENTY", "TWENTY ONE"}
											            }
													};
													
		System.out.println("One Dimensional Array are :");
		System.out.println(Arrays.deepToString(oneDimension)+"\n");
		
		System.out.println("Two Dimensional Array are :");
		System.out.println(Arrays.deepToString(twoDimension)+"\n");
		
		System.out.println("Three Dimensional Array are :");
		System.out.println(Arrays.deepToString(threeDimension)+"\n");
	}
}
