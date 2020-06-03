package Practice1.SeleniumMavenProject;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RahulShettyGreenKart {

	@Test
	public void GreenKart() {
		
		int j=0;
		String[] productneeded = {"Cucumber", "Brocolli", "Carrot", "Tomato"};
		
		String url = "https://rahulshettyacademy.com/seleniumPractise/#/";
		WebDriver driver = WebdriverSetup.Webdriverconfig(url);
		
		//driver.findElement(By.xpath("//input[@type='search']")).sendKeys("testttt");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		System.out.println("No of productrs on page: " + products.size());
		
		for (int i=0; i< products.size(); i++)
		{
			String[] productname = products.get(i).getText().split("-");
			String formattedName = productname[0].trim();
			System.out.println(formattedName);
			
			List productNeededList = Arrays.asList(productneeded);
			if(productNeededList.contains(formattedName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
			}
			
			if(j== productneeded.length) 
			{
				break;
				
			}
			
		}	
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();;
		
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		
		WebElement selectCountry =  driver.findElement(By.xpath("//label[contains(text(),'Choose Country')]/parent::div/div/select"));
		Select s = new Select(selectCountry);
		s.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
	
		
	}
	
	
	
}
