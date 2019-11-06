package com.codechef.program;

import java.util.Scanner;

public class CielAndABProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		CielAndABProblem ciel=new CielAndABProblem();
		long startTime = System.nanoTime();				
		Scanner sc =new Scanner(System.in);
        while(true)                 
        {
			System.out.print("Number A:");
			int A=sc.nextInt();;
            if(A == 42)            
                break;
			System.out.print("Number B:");
			int B=sc.nextInt();
			if(B == 42)            
                break;
			System.out.println("A-B is " + ciel.AminusB(A,B));
             
        }
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
        System.out.println("Bye,time in ms:" +totalTime/1000000);

	}
	
	public int AminusB(int A,int B) {
		int retVal=0;
		int rightAns=A-B;
		String rightAnsString = String.valueOf(rightAns);			
		char[] digits = rightAnsString.toCharArray();
		if (digits.length==1){
			return 0;
		}
		
		for (int i=1;i<digits.length;i++) {
			if(digits[i]!='0' && digits[i]!=digits[i-1]) {
				char temp=digits[i-1];
				digits[i-1]=digits[i];
				digits[i]=temp;
				break;
			}
		}
		String digitsStr=String.copyValueOf(digits);
		retVal=Integer.valueOf(digitsStr);	

		return retVal;
	}

}
