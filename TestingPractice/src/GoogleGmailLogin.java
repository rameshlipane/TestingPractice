import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleGmailLogin {

	public static void main(String[] args) {
		String username = "rameshlipane";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[contains(@aria-label,'Gmail')]")).click();
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.id("identifierId")).sendKeys(username);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
	}

}
