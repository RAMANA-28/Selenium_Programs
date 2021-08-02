package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annotations_2  {
	@Test // Actual test steps
	public void k() {
		System.out.println("@Test k");
	}

	@AfterClass // Post-Condition
	public void afterClass() {
		System.out.println("@AfterClass");
	}

	@BeforeClass // Pre-Condition
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@Test // Actual test steps
	public void f() {
		System.out.println("@Test f");
	}

	@Test // Actual test steps
	public void z() {
		System.out.println("@Test z");
	}
}
