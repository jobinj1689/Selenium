package Practice1.SeleniumMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class WebdriverSetup {

	static WebDriver driver;
	public static  WebDriver Webdriverconfig(String Url) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); //IMPLICIT WAIT

		return driver;
		
	}
	
	public void RahulShettyAlert() {
		
		String  text = "Jobin";
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(text);	
	}


	@BeforeTest
	public void BeforeTestExecution() {
	
		System.out.println("*******Execution of Programs started*********");
	
	}
	
	@AfterTest
	public void AfterTestExecution() {
	
		System.out.println("*******Execution of Programs has completed*********");
	
	}
	
	
}
