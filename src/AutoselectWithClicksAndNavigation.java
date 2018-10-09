import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoselectWithClicksAndNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/VishwanathKota/Documents/WorkSpace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://store.demoqa.com/");
		
		driver.findElement(By.className("search")).sendKeys("golden gate bridge");
		driver.findElement(By.className("search")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("user_email")).sendKeys("test@xyz.com");
		driver.findElement(By.id("user_login")).sendKeys("TestXYZ");
		
		driver.findElement(By.id("wp-submit")).click();
		
//		<a href="http://store.demoqa.com/wp-login.php?action=register">Register</a>
	}

}
