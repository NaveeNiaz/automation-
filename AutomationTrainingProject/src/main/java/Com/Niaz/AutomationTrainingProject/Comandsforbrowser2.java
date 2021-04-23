package Com.Niaz.AutomationTrainingProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Comandsforbrowser2 {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NaveedNiaz\\eclipse-workspace\\AutomationTrainingProject\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
		
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
WebElement EmailId=driver.findElement(By.id("email"));
EmailId.sendKeys("naveed_rlmn@yahoo.com");
WebElement Password=driver.findElement(By.id("pass"));
Password.sendKeys("MyAccount2021%");
WebElement button=driver.findElement(By.name("login"));
button.click();
WebElement Forgot=driver.findElement(By.linkText("Forgot Password?"));
/*WebElement Forgot=driver.findElement(By.linkText("Forgot Password?"));
Forgot.click();*/

WebElement cancel=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div/div/div/div/a"));
	}

}
