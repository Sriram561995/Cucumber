package Skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.loginpage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
	WebDriver driver;
	
	public StepDefs(SharedDriver driver) {
		super();
			this.driver=driver;
	}
	
	@Before
	public void beforeScenario(Scenario scenario) {
		PageFactory.initElements(driver,loginpage.class);
	}
	@After
	public void afterScenario(Scenario scenario) {
		driver.close();
	}

	@Given("the Login URL of the application")
public void the_Login_URL_of_the_application() {
		driver.get("http://demoshop.ricentis.com/login");
		Assert.assertTrue(driver.getTitle().contains("Login"));;
	}
	@When("user enters {word}")
	public void user_enters_askmail_email_com(String Username) {
		driver.findElement(By.id("email")).sendKeys(Username);
	}
	
	@When("user masks {word}")
	public void user_masks_abs(String password) {
		driver.findElement(By.id("Password")).sendKeys(password);
			}
@Then("user is {word}")
public void user_is_valid(String result) {
	if(result.equals("valid"))
		{
		driver.findElement(By.cssSelector("input[valuse=Log in'")).click();
		Assert.assertNotNull(driver.findElement(By.linkText("Log out")));

		}
	}
}


