package homepkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddToBag {
	WebDriver driver;
	@BeforeTest
	public void open() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tatacliq.com/");
		}
	@Test
	public void test() {
		String parentwindow=driver.getWindowHandle();
		driver.navigate().refresh();
		Actions act=new Actions(driver);
		WebElement mos = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]"));
		act.moveToElement(mos).perform();
		WebElement mos2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]"));
		act.moveToElement(mos2).perform();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/a[4]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"ProductModule-MP000000021124281\"]/a/div")).click();
		Set<String> allwindow = driver.getWindowHandles();
		for(String handle:allwindow) {
			if(!handle.equalsIgnoreCase(parentwindow)) {
				driver.switchTo().window(handle);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"pdpSize-38\"]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[1]/div[2]/div[14]/div/div/div[3]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[1]/div[2]/div[14]/div/div/div[3]/div/button")).click();
		
		//driver.close();
			}
			driver.switchTo().window(parentwindow);
		}
}
}
