package corejava;

public class MethodSample {
	
	public static void add() {
		int a=340;
		int b=50;
		System.out.println(a+b);
	}
	public static void add(int a, int b) {
		System.out.println(a+b);
	}

public static void test() {
		System.out.println("Test Method ");
	}

	public static void main(String[] args) {
       test();
       add();
       add(25,35);
       add(10,40);
       add(40,50);
       
	}

}
