package corejava;

import java.util.Scanner;

public class ScannerSample {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		String c;
		String d;
		
		c=sc.next();
		d=sc.next();
		System.out.println(c+d);

	}

}
