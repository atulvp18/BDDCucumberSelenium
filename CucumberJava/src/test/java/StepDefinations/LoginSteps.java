package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {

	WebDriver driver =null;
	LoginPage login;

	@Given("User views Udemy website")
	public void user_views_Udemy_website() {


		System.setProperty("webdriver.chrome.driver", "D:\\Atul Testing\\CucumberJava\\CucumberJava\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Given("user is on dashboard page")
	public void user_is_on_dashboard_page() {

		driver.get("https://www.udemy.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {

		login = new LoginPage(driver);
		login.clickLogin();

	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_atulvp18_gmail_com_and_Atul(String username, String password) {

		login.enterUsernameAndPassword(username, password);

	}
	@When("clicks on login button")
	public void clicks_on_login_button() {

		login.LoginClick();

	}


	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {

		if(driver.getTitle().contentEquals("Online Courses - Anytime, Anywhere | Udemy")) {
			System.out.println("Login Successful and Test Case Passed");
		}
		else {
			System.out.println("Login Failed and Test Case Failed");
		}

	}

	@Then("user search for anything")
	public void user_search_for_anything() {
		login.searchAnything();
	}

	@Then("user logout from the site")
	public void user_logout_from_the_site() {
		login.logout();
		//code to check if user is succesfully logged out
		if(driver.getCurrentUrl().contentEquals("https://www.udemy.com/logout/"))
     	{
			System.out.println("User successfully logged out and Test Case Passed");
		}else {
			System.out.println("User not logged out successfully and Test Case Failed");
		}
	}
}