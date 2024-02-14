package homepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage_Filter {
		WebDriver driver;
	@BeforeTest
	public void open() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tatacliq.com/");
		}
	@Test
	public void test() {
		driver.navigate().refresh();
		Actions act=new Actions(driver);
		WebElement mos = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]"));
		act.moveToElement(mos).perform();
		WebElement mos2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]"));
		act.moveToElement(mos2).perform();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/a[4]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div/div/select")).click();
		WebElement sel = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div/div/select"));
	 	Select mc=new Select(sel);
		mc.selectByValue("price-asc");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div/div/select")).click();
		driver.findElement(By.xpath("//*[@id=\"grid-wrapper_desktop\"]/div/div/div/div/div[1]/div[1]/div/div/span/div[2]/div/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[5]/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"filter-container\"]/div/div/div[2]/div/div[4]/div/div[1]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"filter-container\"]/div/div/div[2]/div/div[4]/div/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/div[2]/div/div")).click();
		//driver.findElement(By.xpath("//*[@id=\"ProductModule-MP000000017229141\"]/a/div")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("//*[@id=\"size-guide-link\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/div[2]/table/tbody/tr[5]/td[1]/div/label")).click();
	}
}
