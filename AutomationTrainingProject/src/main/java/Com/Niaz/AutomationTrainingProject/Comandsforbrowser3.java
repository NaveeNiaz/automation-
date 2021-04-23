package Com.Niaz.AutomationTrainingProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Comandsforbrowser3 {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NaveedNiaz\\eclipse-workspace\\AutomationTrainingProject\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(6000);
	WebElement CreatNewAcc=driver.findElement(By.xpath("//*[text()='Create New Account']"));
	
	}

}
