import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

public class AutoselectWithClicksAndNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/VishwanathKota/Documents/WorkSpace/chromedriver");
		WebDriver driver = new ChromeDriver();
		/*
		driver.get("http://store.demoqa.com/");
		
		
		driver.findElement(By.className("search")).sendKeys("golden gate bridge");
		driver.findElement(By.className("search")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("user_email")).sendKeys("test@xyz.com");
		driver.findElement(By.id("user_login")).sendKeys("TestXYZ");
		
		driver.findElement(By.id("wp-submit")).click();
		
		driver.quit();
		//How to identify this herf anchor tag when there is no particular identifier.
		
//		<a href="http://store.demoqa.com/wp-login.php?action=register">Register</a>
		 */
		
		
		
		/*
		driver.get("https://www.tkmaxx.com/uk/en/women/clothing/dresses/c/01020200?q=&sort=publishedDate-desc&facets=stockLevelStatus:inStock&page=0");
//		List<WebElement> gridItems= driver.findElements(By.className("c-product-grid__item"));
		//li[@class='c-product-grid__item']//img[@class='c-product-card__thumbnail']
		
		List<WebElement> gridItems= driver.findElements(By.xpath("//li[@class='c-product-grid__item']//img[@class='c-product-card__thumbnail']"));
		ArrayList<String> grid = new ArrayList<>(); 
	
		grid.add("");
		
		//li[@class='c-product-grid__item']//img[@class='c-product-card__thumbnail']/following-sibling::strong[@class='u-font-bold u-font-theta u-spaced-2']
		gridItems.get(1).click();//.getText()
		System.out.println(gridItems.size()); 
		 */
		
//		Loading tkmax site  
		/*
		driver.get("https://www.tkmaxx.com/uk/en/");
		driver.findElement(By.xpath("//*[@id='miniCartSlot']/ul/li[3]/a/span")).click();
		Thread.sleep(3000);
		Set<String> setary = driver.getWindowHandles();
		System.out.println("Count "+setary.size());
		for (String s: setary){
			driver.switchTo().window(s);
		}
//		driver.findElement(By.xpath("//*[@class='register-tab active' and @role='presentation']/a/h3")).click();
		driver.findElement(By.xpath("//a/h3[contains(text(),'Register')]")).click();
//		driver.findElement(By.xpath("html/body/main/div[4]/div[2]/div[3]/ul/li[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='label']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[contains(text(),'Mr.')]")).click();
		
//		if(driver.findElement(By.xpath("//*[@class='label']")).getText().equals("Mr.")){
//			//If not validated we will abort
//		}
		
		
		driver.findElement(By.xpath("//*[@id='tjxRegisterForm']/div[1]/div/div/div/div/div[2]/span")).click();
		driver.findElement(By.xpath("//*[@id='tjxRegisterForm']/div[1]/div/div/div/div/div[3]/div/ul/li[2]")).click();
		driver.findElement(By.id("registerFirstName")).sendKeys("first name");
		driver.findElement(By.id("registerLastName")).sendKeys("last name");
		driver.findElement(By.id("registerMobileNumber")).sendKeys("9876543219");
		driver.findElement(By.id("registerEmail")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("registerPassword")).sendKeys("Test@123");
		driver.findElement(By.id("checkPwd")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@id='tjxRegisterForm']/div[8]/div[1]/div/label")).click();
		driver.findElement(By.xpath("//*[@id='tjxRegisterForm']/div[8]/div[2]/div/label")).click();
		driver.findElement(By.xpath("//*[@id='miniCartSlot']/ul/li[3]/a/span")).click();
		
		*/
		
		/*
		driver.get("https://www.facebook.com/");
		Select ddlDay = new Select(driver.findElement(By.id("day")));
		ddlDay.selectByVisibleText("4");
		
		Select ddlMonth = new Select(driver.findElement(By.id("month")));
		ddlMonth.selectByVisibleText("Mar");
		
		Select ddlYear = new Select(driver.findElement(By.id("year")));
		ddlYear.selectByVisibleText("2015");
		
		*/
		
		
		//Mouse over actions
		/*
		driver.get("http://toolsqa.com/");
		Thread.sleep(3000);
		WebElement tutorialEle = driver.findElement(By.xpath("//ul[@id='primary-menu']//span[text()='Tutorial']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(tutorialEle).build().perform();
		Thread.sleep(1000);
		WebElement webAutomationEle = driver.findElement(By.xpath("//ul[@id='primary-menu']//span[text()='Web Automation Tools']"));
		
		act.moveToElement(webAutomationEle).build().perform();
		Thread.sleep(1000);
		WebElement testNGEle = driver.findElement(By.xpath("//ul[@id='primary-menu']//span[text()='Web Automation Tools']/ancestor::a/following-sibling::ul//span[text()='TestNG Tutorial']"));
//		testNGEle.click();
		
		act.contextClick(testNGEle).build().perform();
//		act.moveToElement(testNGEle).click().build().perform(); //Mouse over and scrolling to the visable area
//		act.contextClick(tutorialEle).build().perform();
		 * 
		 */
		
	    //Waits - types dynamic Implict and explict waits
		//switch
		//  - frames
		//	- Windows
		//	- alerts
		//external liberbies
		//limitations
		//framework
		//TestNG - Take test cases for an regestration page then buid a framework for that end to end module. 
		
		
		//This is test 1 branch
		
		//14th Oct, 2018
		
		//Switch to Alerts, frames and windows
		//OS level alerts doesnt consider
		//Web based alerts
		
		/*driver.switchTo().alert().accept();//Ok
		driver.switchTo().alert().dismiss();//For dismiss
		driver.switchTo().alert().sendKeys("Any Text");
		driver.switchTo().alert().getText();//For checking/validating the alerts text
		*/
		
		//Frames
		//driver.switchTo().frame(arg0)
		
		/*
		driver.get("http://toolsqa.com/iframe-practice-page/");
		System.out.println(driver.findElements(By.xpath("//iframe")).size());
//		driver.switchTo().frame(0);//Finding frames using Index.
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vish");
		
		driver.switchTo().frame(driver.findElement(By.id("IF1")));
		Actions act1 = new Actions(driver);
		WebElement frameEleFirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		act1.moveToElement(frameEleFirstName);
		frameEleFirstName.sendKeys("Vish");
		
		WebElement frameEleLastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		act1.moveToElement(frameEleLastName);
		frameEleLastName.sendKeys("test");
		*/
		
		//Implicit Wait
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
//		System.out.println(driver.getWindowHandle());//Returns alpha numberic code which is unique		 
	
		/*
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();		
		
		Set<String> str = driver.getWindowHandles();
		System.out.println("Windows count: "+str.size());
		for(String s: str){
			driver.switchTo().window(s);
			System.out.println(s + " " + driver.getTitle());
		}
		*/
		//Thread.sleep(3000);//Which is not safe to solve this we need to use Waits which should be dynamic 
		//Implicit wait declare once use as many times which will be waiting for page to be loaded
		//Explicit which will be waiting for particular element
		
	
		
		//Explicit wait and fluent wait
		WebDriverWait wat = new WebDriverWait(driver, 60);//Default seconds it checks for every 500 milli seconds
		wat.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='New Message Window']")));
		//elementToBeClickeable
		//elementToBeVisiable
		//Fluent wait does he same thing it supports pooling		
		
		
		Actions act2 = new Actions(driver);
		act2.moveToElement(driver.findElement(By.xpath("//*[@id='alert']")));
		
		driver.findElement(By.xpath("//*[@id='alert']")).click();
		driver.switchTo().alert().accept();
		
//		act2.clickAndHold()
		 act2.clickAndHold().build().perform();
		 //wait
//
		
		
		WebElement timeingAlertEle =  driver.findElement(By.xpath("//*[@id='timingAlert']"));
//		wat.until(ExpectedConditions.alertIsPresent());
//		driver.switchTo().alert().accept();
		
		//Alertnative of click using java script 
		//scrollWindow
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", timeingAlertEle);
		wat.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		//span[contains(text(),'Seconds remaining')]
//		WebElement buzbuzEle = driver.findElement(By.xpath("//span[contains(text(),'Buzz  Buzz')]"));
		WebElement timingEle = driver.findElement(By.xpath("//span[contains(text(),'Seconds remaining')]"));
		
//		wat.until(ExpectedConditions.textToBePresentInElementValue(buzbuzEle, "Buzz  Buzz"));
//		wat.until(ExpectedConditions.invisibilityOf(timingEle));
		
		/*
		wat.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Buzz  Buzz')]")));
		
		if(driver.findElement(By.xpath("//span[contains(text(),'Buzz  Buzz')]")).isDisplayed()){
			System.out.println("Buzz Buzz presented");
		}else{
			System.out.println("Waiting");
		}
		*/
		
		/*
		if(driver.findElement(By.id("123")).isDisplayed()){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
		*/
		
		System.out.println(driver.findElement(By.xpath("//*[@id='colorVar']")).getAttribute("style")); 
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//*[@id='colorVar']")).getAttribute("style"));
//		System.out.println(driver.findElement(By.xpath("//*[@id='colorVar'][@style='color: white']")).getAttribute("style"));
		
		
		//Override of methods for wait and fluent wait >>!!!!!
		//isDisplay method hidden condition 
		
//		driver.close();//only closes current popup
//		driver.quit();//quits whole browser 
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
