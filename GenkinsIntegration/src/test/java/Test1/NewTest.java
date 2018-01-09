package Test1;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
 
public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void OpenURL() throws InterruptedException {
	  System.out.println("Inside Test");
	  Thread.sleep(20000);

	driver.get("http:www.google.com");
 Thread.sleep(10000);
  }
  
  @BeforeClass
  public void beforeClass() {
/*	  DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
	  capabilities.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
	  capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	  capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
	  capabilities.setCapability("allow-blocked-content", true);
	  capabilities.setCapability("allowBlockedContent", true);
	*/  
	  System.setProperty("webdriver.ie.driver","C:\\121016\\Softwares\\Selenium Softwares\\IEDriverServer_Win32_3.1.0\\IEDriverServer.exe");
	  System.setProperty("webdriver.ie.driver","C:\\IEDriverServer\\IEDriverServer_32.exe");
	  System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_32.exe");
	  
	  System.out.println("Inside BeforeClass");
	  driver = new ChromeDriver();
  }
 
  @AfterClass
  public void afterClass() {
	  System.out.println("Inside TestAfter Class");
	  driver.quit();
  }
 
}