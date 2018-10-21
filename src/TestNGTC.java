import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTC {
	@Test
	void test1(){
		System.out.println("Welcome to Test NG 1");
	}
	
	@Test
	void test2(){
		System.out.println("Welcome to Test NG 2");
	}
	
	@Test
	void test3(){
		System.out.println("Welcome to Test NG 3");
	}
	
	@BeforeMethod
	void testbefore(){
		System.out.println("Before Test functionality");
	}
	
	@Test
	void test4(){
		System.out.println("Welcome to Test NG 4");
	}
	
	@Test
	void test5(){
		System.out.println("Welcome to Test NG 5");
	}	
}
