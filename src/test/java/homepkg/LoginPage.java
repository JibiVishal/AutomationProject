package homepkg;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;
@BeforeTest
public void open() {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.tatacliq.com/");
	}
@Test
public void test1() {
	driver.navigate().refresh();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div/div/div[2]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys("9676573250",Keys.ENTER);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//*[@id=\"otp_0\"]")).sendKeys("4");
	driver.findElement(By.xpath("//*[@id=\"otp_1\"]")).sendKeys("3");
	driver.findElement(By.xpath("//*[@id=\"otp_2\"]")).sendKeys("8");
	driver.findElement(By.xpath("//*[@id=\"otp_3\"]")).sendKeys("5");
	driver.findElement(By.xpath("//*[@id=\"otp_4\"]")).sendKeys("4");
	driver.findElement(By.xpath("//*[@id=\"otp_5\"]")).sendKeys("9",Keys.ENTER);
	System.out.println("If a valid OTP is not provided, the message incorrect OTP is displayed");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[5]/div/div/div/div[2]/div/div[3]/div[1]/button")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[5]/div/div/div/div[2]/div[1]/div[2]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("abcd@gmail.com",Keys.ENTER);
}
@AfterTest
public void closebrowser() {
	driver.close();
}
}
