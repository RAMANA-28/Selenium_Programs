package corejava;

import java.util.Iterator;

public class ForLoopSample {

	public static void main(String[] args) {
		//Print 1to 100
		//for(Initialize the variable;condition;increment /Decrement variable{}
		
		for(int i=1;i<=100;i++) {
			//System.out.println(i);
			
			//Print only even numbers in the range of 1 to 100
			
			if(i%2==0) {
				System.out.println(i+" is the Even number");
	}
//				else {
//				System.out.println(i+" is the Odd number");
			}
		}

	}


