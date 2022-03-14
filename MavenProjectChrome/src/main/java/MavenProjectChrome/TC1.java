package MavenProjectChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
	public static void ExecuteTC1() throws InterruptedException{
		LaunchChromeDriver.startdriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://shef.com");
		//1.Find Login Button and click
		WebElement loginbtn = driver.findElement(By.className("login-btn"));
		loginbtn.click();
		
		//2.Find email text box and provide credentials
		
		WebElement lemail = driver.findElement(By.xpath("(//input)[1]"));
		lemail.click();
		lemail.sendKeys("mailtobiswajit@gmail.com");
		WebElement lpasswd = driver.findElement(By.xpath("(//input)[2]"));
		lpasswd.sendKeys("b2538S2358!");
		WebElement loginbtn1 = driver.findElement(By.xpath("(//button)[5]"));
		loginbtn1.click();
		
		//3. Maxzimize current window;
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement acctbtn = driver.findElement(By.xpath("(//a)[3]"));
		try {
			acctbtn.click();
		} catch (StaleElementReferenceException e) {
			driver.findElement(By.xpath("(//a)[3]")).click();
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
				
		Thread.sleep(3000);
		
		WebElement Shfdshbrd = driver.findElement(By.xpath("(//button)[4]"));
		Shfdshbrd.click();
		
		Thread.sleep(3000);
		WebElement Shforders = driver.findElement(By.xpath("(//a)[1]"));
		Shforders.click();
		
		//driver.close();
		driver.quit();
		
	}

}

