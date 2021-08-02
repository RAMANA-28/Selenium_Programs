package testNG;

import org.testng.annotations.Test;

public class PrioritySample {
	
	@Test(priority = 1)
	  public void f() {
		  System.out.println("@test f");
	  }
	  @Test(priority = 4)
	  public void a() {
		  System.out.println("@test a");
	  }
	  @Test(priority = 3)
	  public void z() {
		  System.out.println("@test z");
	  }
	  @Test(priority = 2)
	  public void x() {
		  System.out.println("@test x");
	  }
	  
	}
