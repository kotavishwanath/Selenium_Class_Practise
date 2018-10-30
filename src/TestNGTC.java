import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTC {
	/*
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
	*/
	
	//Sequence of TestNG annotations
	/*
	   //Prerequisites Annotations 
	 * Preferences
	 	1st @BeforeSuite -- Set up System property for Chrome 
		2nd @BeforeTest -- Launch Browser
		3rd @BeforeClass -- Login to App
		
		//Test case Annotations
		//Cycle 1
		4th @BeforeMethod --Enter the URL
		5th @Test -- Logo test
		6th @AfterMethod -- Logout of application
		
		//Cycle 2
		4th @BeforeMethod --Enter the URL
		5th @Test -- Get google Title
		6th @AfterMethod -- Logout of application
		
		//Cycle 3
		4th @BeforeMethod --Enter the URL
		5th @Test -- Search text
		6th @AfterMethod -- Logout of application
		
		//Post Annotations
		7th @AfterClass -- Close the Browser
		8th @AfterTest -- Delete all cookies
		9th @AfterSuite -- Generate the Test Report
	 */
	
	
	//Pre Condition annotations --starts with @Before
	@BeforeSuite //1st Preference -- It will be executed only once
	public void setup(){
		System.out.println("@BeforeSuite -- Set up System property for Chrome");
	} 
	
	@BeforeTest //2nd Preference -- It will be executed only once
	public void launchBrowser(){
		System.out.println("@BeforeTest -- Launch Browser");
		
	}
	
	@BeforeClass //3rd Preference -- It will be executed only once
	public void loginToApp(){
		System.out.println("@BeforeClass -- Login to App");
	}
	
	@BeforeMethod //4th Preference -- It will be executed based on the number of @Test i.e no. of test cases 
	public void enterURL(){
		System.out.println("@BeforeMethod --Enter the URL");
	}
	
	//Test cases starting with @Test 
	//Number of test cases for the project/module can be know counting how many @Test annotations are there in this TestNG file
	@Test //5th Preference //Test case 1
	public void googleTitleTest(){
		System.out.println("@Test -- Get google Title");
	}

	@Test //Test case 2 
	public void searchTest(){
		System.out.println("@Test -- Search text");
	}
	
	@Test //Test case 3
	public void googleLogoTest(){
		System.out.println("@Test -- Logo test");
	}
	
	/*
	 * 
	 
	 For these Three test cases it will create Three pairs  i.e,
	 pairs execution may not be in sequence but the pairs will be created 
	 @BeforeMethod
	 @Test //Test case 1 i.e googleTitleTest
	 @AfterMethod
	 
	 @BeforeMethod
	 @Test //Test case 2 i.e searchTest
	 @AfterMethod
	 
	 @BeforeMethod
	 @Test //Test case 3 i.e googleLogoTest
	 @AfterMethod
	 
	 * 
	 */
	
	//Post Conditions starting with @After
	@AfterMethod //6th Preference -- It will be executed based on the number of @Test i.e no. of test cases 
	public void logout(){
		System.out.println("@AfterMethod -- Logout of application");
	}
	
	@AfterClass //7th Preference -- It will be executed only once
	public void closeBrowser(){
		System.out.println("@AfterClass -- Close the Browser");
	}
	
	@AfterTest //8th Preference -- It will be executed only once
	public void deleteAllCookies(){
		System.out.println("@AfterTest -- Delete all cookies");
	}
	
	@AfterSuite //9th Preference -- It will be executed only once
	public void generateReports(){
		System.out.println("@AfterSuite -- Generate the Test Report");
	}
	
}
