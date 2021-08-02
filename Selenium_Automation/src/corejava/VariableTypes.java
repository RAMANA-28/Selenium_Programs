package corejava;

public class VariableTypes {
	//Global
	static int a=05;
	static int b=04;
	
	public static void add() {
		//Local
	       int a=10;
	       int b=11;
	       System.out.println(a+b);
	}
	
	public static void sub() {
		//Local
	       int a=11;
	       int b=13;
	       System.out.println(a-b);
	}
	public static void main(String[] args) {
		add();
		sub();
	}

}
