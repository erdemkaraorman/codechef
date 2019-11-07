package com.codechef.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Stadium {

	class Event{
		int start;
		int end;
		Event(){
			start=0;
			end=0;
		}
		public Event(int start,int end){
			this.start=start;
			this.end=end;
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
	// TODO Auto-generated method stub
	
		Stadium stadium=new Stadium();
		Scanner sc =new Scanner(System.in);
   		/*int N=sc.nextInt();//Number of events
   		int[] dayArr=new int[N];
   		int[] lengthArr=new int[N];
   		for (int i=0;i<N;i++) {
   			dayArr[i]=sc.nextInt();
   			lengthArr[i]=sc.nextInt();
   		}*/
		int[] dayArr= {2,9,15,9};
		int[] lengthArr= {5,7,6,3};
		Event[] eventArr=new Event[dayArr.length];
		for (int i=0;i<dayArr.length;i++) {
			Event event=stadium.new Event(dayArr[i],dayArr[i]+lengthArr[i]);
			eventArr[i]=event;
		}
   		//System.out.println(A-B);
   		System.out.println(stadium.optimize(eventArr));

	}
	
	public int optimize(Event[] eventArray) {
		int retVal=0;

		for (int i=eventArray.length;i>0;i--) {
			ArrayList<int[]> hash=new ArrayList();
			combination(hash,eventArray,eventArray.length,i);
			Iterator i1 = (Iterator) hash.iterator(); 
	        while (i1.hasNext()) {
	        	int[] seq=(int[]) i1.next();
	        	if (tryToFit(eventArray,seq)) {
	        		return seq.length;
	        	}
	        }	             
		}		
		return retVal;
	}
	
	public boolean tryToFit(Event[] eventArray,int[] seq) {
		boolean retVal=true;
		TreeMap<Integer,Integer> _hash=new TreeMap<Integer,Integer>();
		for (int i=0;i<seq.length;i++) {
			int startPoint=eventArray[seq[i]].start;
			int endPoint=eventArray[seq[i]].end;
			for (int k=startPoint;k<=endPoint;k++) {
				if (_hash.containsKey(k)) {
					return false;
				}else {
					_hash.put(k,0);
				}			
			}
		}
		
		return retVal;
	}

		
	public void combination(ArrayList hash,Event[] arr,int n,int r) {
		int[] data=new int[r];
		int start=0;
		int index=0;
		recursiveCombination(hash,arr,data,start,index,n-1,r);
	}
	
	public void recursiveCombination(ArrayList hash,Event[] arr,int[] data,int start,int index,int end,int r) {
		
		if (index==r) {
			int[] temp=new int[data.length];
			for (int i=0;i<data.length;i++) {
				temp[i]=data[i];
			}
			hash.add(temp);
		}else {
			for (int i=start;i<=end && end - i + 1 >= r - index ;i++) {
				data[index]=i;
				recursiveCombination(hash,arr,data,i+1,index+1,end,r);
			}
		}
		
	}


}
