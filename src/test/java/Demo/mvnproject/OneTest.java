package Demo.mvnproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OneTest {

	@Test
	public void SampleTest() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("data.proprties");
		prop.load(fis);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
		WebElement mouse = driver.findElement(By.id("blogsmenu"));
		Actions action = new Actions(driver);
		action.moveToElement(mouse).perform();
		Thread.sleep(3000);
		WebElement Sele4 = driver.findElement(By.xpath("//span[normalize-space()='Selenium143']"));
		action.moveToElement(Sele4).click().build().perform();
		driver.close();
	}

}
