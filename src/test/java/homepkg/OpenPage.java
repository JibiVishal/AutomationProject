package homepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenPage {
	WebDriver driver;
@Test
public void opensite(){
	this.driver=driver;
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tatacliq.com/");
	
}
}
