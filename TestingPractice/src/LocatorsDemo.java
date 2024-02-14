import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		 Use of id locator
		 driver.findElement(By.id("inputUsername")).sendKeys("rameshlipane");
		 
//		 Implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
//		 Use of Name locator
		 driver.findElement(By.name("inputPassword")).sendKeys("Asdfg");
		 
//		 Use of Class locator
		 driver.findElement(By.className("signInBtn")).click();
		 
//		 Use of CSS Selector
		 System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		 
//		 Use of Link Test locator
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 
		 Thread.sleep(1000);
//		 Use of XPath
		 driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ramesh");
		 
//		 Use of custome CSS Selector
		 driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("a@b.com");
		 
//		 use of XPath with indexing
		 driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		 
//		 use of CSS Selector with index
		 driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("abc.xyz.com"); 
		 
//		 Use of parent child XPath
		 driver.findElement(By.xpath("//form/input[3]")).sendKeys("12345");
		 
		 driver.findElement(By.className("reset-pwd-btn")).click();
		 System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		 
		 driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		 driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Ramesh");
		 driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		 driver.findElement(By.id("chkboxOne")).click();
		 driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		 
//		 driver.close();

	}

}
