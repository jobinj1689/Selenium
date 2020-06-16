package PageObject;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreenKartObjects {

	public GreenKartObjects(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//h4[@class='product-name']")
	public static List<WebElement> products;;
	
	@FindBy(xpath="//div[@class='product-action']/button")
	List<WebElement> productAddtoCart;
	
	@FindBy(xpath="//img[@alt='Cart']")
	WebElement cart;
	
	@FindBy(xpath="//button[contains(text(),'PROCEED TO CHECKOUT')]")
	WebElement proceedToCheckout;
	
	@FindBy(xpath="//input[@placeholder='Enter promo code']")
	WebElement promoCode;
	
	@FindBy(xpath="//button[contains(text(),'Apply')]")
	WebElement applyPromo;
	
	@FindBy(xpath="//span[@class='promoInfo']")
	WebElement promoInfo;
	
	@FindBy(xpath="//button[contains(text(),'Place Order')]")
	WebElement placeOrder;
	
	@FindBy(xpath="//label[contains(text(),'Choose Country')]/parent::div/div/select")
	WebElement selectCountry;
	
	@FindBy(xpath="//input[@class='chkAgree']")
	WebElement checkAgree;
	
	@FindBy(xpath="//button[contains(text(),'Proceed')]")
	WebElement proceed;
	
	
	public List<WebElement> products() {
		
		return products;
	}
	
	public List<WebElement> productAddtoCart() {
		
		return productAddtoCart;
	}
	
	public WebElement cart() {
		
		return cart;
	}
	
	public WebElement proceedToCheckout() {
		
		return proceedToCheckout;
	}
	
	public WebElement promoCode() {
		
		return promoCode;
	}
	
	public WebElement applyPromo() {
		
		return applyPromo;
	}
	
	
	public WebElement promoInfo() {
		
		return promoInfo;
	}
	
	public WebElement placeOrder() {
		
		return placeOrder;
	}
	
	public WebElement selectCountry() {
		
		return selectCountry;
	}
	
	public WebElement checkAgree() {
		
		return checkAgree;
	}
	
	public WebElement proceed() {
		
		return proceed;
	}
	
}
