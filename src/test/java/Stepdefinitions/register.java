package Stepdefinitions;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class register {
	WebDriver driver;

 @Given("^I have navigated to Register page$")
 public void i_have_navigated_to_register_page() {
	 WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.manage().window().maximize();
		
	 driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	  
	}
 @When("I enter the below details")
 public void i_enter_the_below_details(DataTable dataTable) {
     Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
     driver.findElement(By.id("input-firstname")).sendKeys(dataMap.get("firstname"));
     driver.findElement(By.id("input-lastname")).sendKeys(dataMap.get("lastname"));
     driver.findElement(By.id("input-email")).sendKeys(dataMap.get("email"));
     driver.findElement(By.id("input-telephone")).sendKeys(dataMap.get("Telephone"));
     driver.findElement(By.id("input-password")).sendKeys(dataMap.get("password"));
     driver.findElement(By.id("input-confirm")).sendKeys("password");
 }
 @When("i select the privacy option")
 public void i_select_the_privacy_option() {
	 driver.findElement(By.name("agree")).click();
     
 }

 
 
}
