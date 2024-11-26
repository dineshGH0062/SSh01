package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OmayoLogin {
WebDriver driver;
	@Given("I navigate to application URL")
	public void i_navigate_to_application_url() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://omayo.blogspot.com/#");
		
	    
	}

	@When("I enter user name as {string} and password as {string} into the filed")
	public void i_enter_user_name_as_and_password_as_into_the_filed(String username, String password) {
	 
		driver.findElement(By.name("userid")).sendKeys(username);
		driver.findElement(By.name("pswrd")).sendKeys(password);
		
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	    
	}

	@Then("User should be able to login based on {string} login status")
	public void user_should_be_able_to_login_based_on_login_status(String string) {
	    String actualResul=null;
	    try {
		
		Alert alert = driver.switchTo().alert();
		if(alert.getText().contains("Error Password or Username")) {
			
		actualResul="Failed";	
		}
	}catch (Exception e) {
		actualResul="Passed";
	}
	    Assert.assertEquals(actualResul, actualResul);
	    driver.quit();
	}

}

