package corejava;

public class StringSample {

	public static void main(String[] args) {
		String abc;
		abc= " Hi all, Welcome to Corejava Seasion ";//Assign values to the String
		//String abc= " Hi all, Welcome to corejava seasion ";
		
		String a= "90";
		String b= "Hi All";
		String c= " Hi All How are you My Employee Id@2021";
			
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				
				System.out.println(abc);
		        //trim:To Remove the Space
				System.out.println(abc.trim());
				System.out.println(abc.toUpperCase().trim());
				System.out.println(abc.toLowerCase().trim());
				
				String d="Apple";
				String e="apple";
				//equal:System will cross check each and every char is matching or not
				if (d.equals(e)) {
					System.out.println("Both the Strings are Equal");
				}else { 
					System.out.println("Both the Strings are NOT Equal");
				}
				//equalIgoreCase: It will avoid the cases
				if (d.equalsIgnoreCase(e)) {
					System.out.println("Both the Strings are Equal***********");
				}else { 
					System.out.println("Both the Strings are NOT Equal*********");
				}
				
	}

}
