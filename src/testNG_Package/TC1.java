package testNG_Package;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC1 {
	
	//It will execute in Alphabatical order
	/*
	 * Output will be 
	 * "Case 1
	 * "Case 3
	 * "Case 2
	 * if used priority is used then it will skip the Alphabatical order
	 */
	
	@Test(priority=3)
	public void A(){
		assertEquals("abc", "abc");
		assertEquals(true, false);
		System.out.println("Case 1");
	}
	
	@Test(priority=1)
	public void C(){
		System.out.println("Case 2");
	}
	
	@Test(priority=2, dependsOnMethods="A") 
	public void B(){
		System.out.println("Case 3");
	}
	
	@Test(groups={"1st"})
	public void gropusTest1(){
		System.out.println("gropu 1");
	}
	@Test(groups={"1st"})
	public void gropusTest2(){
		System.out.println("gropu 2");
	}
	@Test(groups={"1st"})
	public void gropusTes3(){
		System.out.println("gropu 3");
	}
	@Test(groups={"1st"})
	public void gropusTest4(){
		System.out.println("gropu 4");
	}
	@Test(groups={"2nd","3rd"})
	public void gropusTest5(){
		System.out.println("gropu 5");
	}
	@Test(groups={"2nd"})
	public void gropusTest6(){
		System.out.println("gropu 6");
	}
	@Test(groups={"2nd"})
	public void gropusTest7(){
		System.out.println("gropu 7");
	}
	@Test(groups={"3rd"})
	public void gropusTest8(){
		System.out.println("gropu 8");
	}
	@Test(groups={"3rd"})
	public void gropusTest9(){
		System.out.println("gropu 9");
	}
	@Test(groups={"3rd"})
	public void gropusTest10(){
		System.out.println("gropu 10");
	}
	
}
