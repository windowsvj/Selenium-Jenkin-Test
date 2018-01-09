package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition 
{
	WebDriver driver;
	@Given("^Open \"([^\"]*)\" Browser and start google\\.com$")
	public void open_Browser_and_start_google_com(String Browser) throws Throwable 
	{
		System.out.println("Inside BeforeClass");
		if (Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_32.exe");
			driver = new ChromeDriver();	
		}
		
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_valid_and_valid(String UserName, String Password) throws Throwable 
	{
		System.out.println("Inside Test");
		driver.get("http://www.google.com");
	}

	@Then("^User should be able to login successful$")
	public void user_should_be_able_to_login_successful() throws Throwable 
	{
		System.out.println("Inside TestAfter Class");
		driver.quit();
	}
}
