package corejava;

import java.util.Scanner;

public class WordGame {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Hi User, Imagine any one text in the below list: ");
		System.out.println("**************************************************");
		System.out.println(" Test1,Test2,Test3,Test4,Test5,Test6,Test7,Test8,Test9,Test10 ");
		System.out.println("======================================================");
		//Section-1
		System.out.println(" Hi User, your Imagine text is in the Section-1 list: ?");
		System.out.println("**************************************************");
		System.out.println(" Test1,Test6,Test8,Test10 ");
		System.out.println("======================================================");
		System.out.println(" If it is available in the Section-1,Please type here: 1,else type 0");
		System.out.println("**************************************************");
		Thread.sleep(5000);
		int Section1 = sc.nextInt();
		//Section-2
		System.out.println(" Hi User, your Imagine text is in the Section-2 list: ?");
		System.out.println("**************************************************");
		System.out.println(" Test9,Test6,Test5,Test2,Test10 ");
		System.out.println("======================================================");
		System.out.println(" If it is available in the Section-2,Please type here: 2,else type 0");
		System.out.println("**************************************************");
		Thread.sleep(5000);
		int Section2 = sc.nextInt();
		//Section-3
		System.out.println(" Hi User, your Imagine text is in the Section-3 list: ?");
		System.out.println("**************************************************");
		System.out.println(" Test9,Test6,Test5,Test3,Test8,Test7,Test10 ");
		System.out.println("======================================================");
		System.out.println(" If it is available in the Section-3,Please type here: 3,else type 0");
		System.out.println("**************************************************");
		Thread.sleep(5000);
		int Section3 = sc.nextInt();
		//Section-4
		System.out.println(" Hi User, your Imagine text is in the Section-4 list: ?");
		System.out.println("**************************************************");
		System.out.println(" Test9,Test4,Test8,Test7,Test10 ");
		System.out.println("======================================================");
		System.out.println(" If it is available in the Section-4,Please type here: 4,else type 0");
		System.out.println("**************************************************");
		Thread.sleep(5000);
		int Section4 = sc.nextInt();
		
		System.out.println("your imagine number is : Test" +(Section1+Section2+Section3+Section4));
	}

}
