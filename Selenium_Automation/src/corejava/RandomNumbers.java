package corejava;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		//Print any Random numbers between 0 to 100
		
		Random r=new Random();
		System.out.println(r.nextInt(100));

	}

}
