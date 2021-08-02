package corejava;

public class ConditionalStatement {

	public static void main(String[] args) {
		int a=50;
		int b=50;
		//if condition is True then only system will move to the if block
		//if condition is False it will skip the if block and go to else block
		if (a>b) {
			System.out.println(" a is Large Value");
		}else if(b>a) {
			System.out.println(" b is Large Value");
	}else {
		    System.out.println(" both the values are Equal");
	}
		
		//Nested-if :Condition within the Condition
		int age = 61;
		String gender = "Female";
		
		if (age>60) {
			if (gender=="Female")
				System.out.println("35% offer");
		}else if(gender=="Male") {
			System.out.println("30% offer");
	   }
   }
}