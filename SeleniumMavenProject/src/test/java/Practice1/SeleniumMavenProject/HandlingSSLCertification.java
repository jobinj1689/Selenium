package Practice1.SeleniumMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingSSLCertification {

	public void SSLCertification() {
		
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true );
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true );
		
		ChromeOptions c = new ChromeOptions();
		c.merge(dc);
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
