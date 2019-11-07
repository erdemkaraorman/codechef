package com.codechef.program;

import java.util.Scanner;

public class Stadium {

	class Event{
		int start;
		int end;
		Event(){
			start=0;
			end=0;
		}
		Event(int start,int end){
			this.start=start;
			this.end=end;
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
	// TODO Auto-generated method stub
	
		Stadium stadium=new Stadium();
		Scanner sc =new Scanner(System.in);
   		int N=sc.nextInt();//Number of events
   		int[] dayArr=new int[N];
   		int[] lengthArr=new int[N];
   		for (int i=0;i<N;i++) {
   			dayArr[i]=sc.nextInt();
   			lengthArr[i]=sc.nextInt();
   		}
   		//System.out.println(A-B);
   		System.out.println(stadium.optimize(dayArr, lengthArr));

	}
	
	public int optimize(int[] dayArr,int[] lengthArr) {
		int retVal=0;
		int maxEvents;
		for (int i=0;i<dayArr.length;i++) {
			
		}
		return retVal;
	}

	
	public int AminusB_charConversion(int A,int B) {
		int retVal=0;
		int rightAns=A-B;
		String rightAnsString = String.valueOf(rightAns);			
		char[] digits = rightAnsString.toCharArray();
		
		for (int i=0;i<digits.length;i++) {
			if(digits[i]=='9') {
				digits[i]='1';				
			}else {
				digits[i]=String.valueOf(Character.getNumericValue(digits[i])).toCharArray()[0];		
			}
			break;
		}
		String digitsStr=String.copyValueOf(digits);
		retVal=Integer.valueOf(digitsStr);	

		return retVal;
	}

}
