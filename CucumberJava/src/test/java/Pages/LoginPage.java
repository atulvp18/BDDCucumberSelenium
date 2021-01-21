package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	protected WebDriver driver;

	private By btn_login = By.xpath("//*[@id=\"udemy\"]/div[1]/div[1]/div[2]/div[6]/a");
	private By emailid = By.name("email");
	private By pass = By.name("password");
	private By login_btn = By.name("submit");
	private By searchBox = By.name("q");
	private By searchButton = By.xpath("//button[@class=\"udlite-btn udlite-btn-large udlite-btn-ghost udlite-heading-md udlite-btn-icon udlite-btn-icon-large\"]");


	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public void clickLogin() {
		driver.findElement(btn_login).click();
	}

	public void enterUsernameAndPassword(String username, String password) {
		driver.findElement(emailid).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
	}

	public void LoginClick() {
		driver.findElement(login_btn).click();
	}

	public void searchAnything() {
		driver.findElement(searchBox).sendKeys("selenium");
		driver.findElement(searchButton).click();
	}
	public void logout() {

		WebElement userProfile = driver.findElement(By.xpath("//div[@class=\"user-profile-dropdown--dropdown-button-avatar--Cbd6V udlite-avatar udlite-heading-sm\"]"));

		//Code to hover on profile logo
		Actions builder = new Actions(driver);
		Action mouseOverHome = builder
				.moveToElement(userProfile)
				.build();
		mouseOverHome.perform(); 

		//Code to scroll down the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		//Code to locate Log Out link and click

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Log out']"))).click();
		
		
	}

}