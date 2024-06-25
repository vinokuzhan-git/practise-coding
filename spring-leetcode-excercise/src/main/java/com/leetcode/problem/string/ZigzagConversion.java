package com.leetcode.problem.string;

public class ZigzagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String result = convert("PAYPALISHIRING",3);
		// String result = convert("A",1);
		System.out.println("result : "+result);

	}
	
	 public static String convert(String s, int numRows) {

		   int row=0;
		   int totalindx= 2*numRows-2;
		   String result="";
		   while(row < numRows)
		   {
		   int index=0;
		  // int strindex=0;
		   int index1= (numRows-(row+1))*2;
		   int index2=totalindx-index1;
		  // System.out.println("row : "+row+" index1 : "+index1+" index2 : "+index2);
		   result=result+s.charAt(row);
		   index=row;
		    while(s.length()-1 > index)
		    {    
		    	if(index1 > 0)
			    {
		    		index=index + index1;
		    		if((s.length() > index))
		    			result=result+s.charAt(index);
			    }

		        if(index2 > 0)
		        {
		        	index = index+index2;
		        	 if((s.length() > index))	
		        		 result=result+s.charAt(index);
		        }	
		    }
		    row++;
		   }  
		   return result;
		        
		    }

}
