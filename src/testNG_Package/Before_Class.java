package testNG_Package;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Before_Class {
	
	@BeforeTest
	public void beforeClasse(){
		System.out.println("I am in Before Test");
	}
	
	@Test
	public void test(){
		System.out.println("I am in Test of Before class");
	}
}
