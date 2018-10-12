import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		driver.findElement(By.xpath("//*[@class='label']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'Mr.')]")).click();
		
		if(driver.findElement(By.xpath("//*[@class='label']")).getText().equals("Mr.")){
			//If not validated we will abort
		}
		
		
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
		
		
		
		/*
		driver.get("https://www.facebook.com/");
		Select ddlDay = new Select(driver.findElement(By.id("day")));
		ddlDay.selectByVisibleText("4");
		
		Select ddlMonth = new Select(driver.findElement(By.id("month")));
		ddlMonth.selectByVisibleText("Mar");
		
		Select ddlYear = new Select(driver.findElement(By.id("year")));
		ddlYear.selectByVisibleText("2015");
		
		*/
	
 
	}

}
