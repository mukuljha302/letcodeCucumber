
package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSteps {

	

	WebDriver driver;
	@Given("User navigates to the Bookcart Application")
	public void userNavigatesToTheBookcartApplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mukul.jha\\eclipse-workspace\\letcodeCucumber\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		driver=new ChromeDriver(options);
		driver.get("https://bookcart.azurewebsites.net/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		

	}

	@And("User Clicks on the Login Button")
	public void userClicksOnTheLoginButon() {
	driver.findElement(By.cssSelector("body > app-root > app-nav-bar > mat-toolbar > mat-toolbar-row > div:nth-child(3) > button.mat-focus-indicator.mat-button.mat-button-base.ng-star-inserted > span.mat-button-wrapper")).click();
	
	}

	@And("User enters username as mukuljha302")
	public void userEntersUsernameAs() {
	driver.findElement(By.id("mat-input-0")).sendKeys("mukuljha302");
	
	}

	@And("enters password as Pass1234")
	public void entersPasswordAs() {
		driver.findElement(By.id("mat-input-1")).sendKeys("Pass1234");
	}

	@When("User Clicks on the login button")
	public void userClicksOnTheLoginButton() {
	
	driver.findElement(By.cssSelector("body > app-root > div > app-login > div > div.docs-example-viewer-body > div > mat-card > mat-card-content > form > mat-card-actions > button")).click();
	}

	@Then("Login should be success")
	public void loginShouldBeSuccess() {
	String usernameshowing=driver.findElement(By.cssSelector("body > app-root > app-nav-bar > mat-toolbar > mat-toolbar-row > div:nth-child(3) > button.mat-focus-indicator.mat-menu-trigger.mat-button.mat-button-base.ng-star-inserted")).getText();
	System.out.println(usernameshowing);
	driver.quit();
	}
	
	@Given("User enters username as mukuljha30")
	public void userEntersUsernameAsMukuljha() {
		driver.findElement(By.id("mat-input-0")).sendKeys("mukuljha30");	
	}

	@Given("enters password as Pass123")
	public void entersPasswordAsPass() {
		driver.findElement(By.id("mat-input-1")).sendKeys("Pass1234");
	}
	
	
	@But("Login should fail")
	public void loginShouldNotBeSuccess() {
	  String result=driver.findElement(By.cssSelector("#mat-error-3")).getText();
		Assert.assertEquals(result.trim(),"Username or Password is incorrect.");
		System.out.println(result);
	}




}
