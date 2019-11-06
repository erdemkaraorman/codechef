package com.codechef.program;

import java.util.Scanner;

public class CielAndABProblem {

	public static void main (String[] args) throws java.lang.Exception
	{
	// TODO Auto-generated method stub
	
		Codechef ciel=new Codechef();
		Scanner sc =new Scanner(System.in);
   		int A=sc.nextInt();
   		int B=sc.nextInt();
   		//System.out.println(A-B);
   		System.out.println(ciel.AminusB(A,B));

	}
	
	public int AminusB(int A,int B) {
		int retVal=0;
		int temp=A-B;
		int lastDigit=temp%10;
		if (lastDigit==9) {
			temp=temp-1;
		}else {
			temp=temp+1;
		}
		retVal=temp;
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
