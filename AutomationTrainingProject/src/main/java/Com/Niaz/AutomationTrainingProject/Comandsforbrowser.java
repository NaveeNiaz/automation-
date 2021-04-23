package Com.Niaz.AutomationTrainingProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Comandsforbrowser {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NaveedNiaz\\eclipse-workspace\\AutomationTrainingProject\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
		
	driver.navigate().to("https://www.amazon.com");
		//driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	driver.navigate().back();
	Thread.sleep(6000);
	driver.navigate().forward();
	
	String windowshandle= driver.getWindowHandle();
	
	Thread.sleep(6000);
	driver.navigate().refresh();
	Thread.sleep(6000);
	driver.quit();
	}

}
