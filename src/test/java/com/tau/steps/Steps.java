package com.tau.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Steps {


  private WebDriver driver;
	
  @Before
  public void Setup(){
	  System.setProperty("webdriver.chrome.driver","D:\\cucmber\\tau-cucumber-course\\src\\main\\resources\\drivers\\chromedriver.exe");
      driver = new ChromeDriver();
  }
  
  @Given("I am in the applicion")
	public void i_am_in_the_applicion() {
	  

         driver.get("https://parabank.parasoft.com/parabank/index.htm");
	}

	@When("I enter valid credentials {string} and {string}")
	public void i_enter_valid_credentials(String username, String password ) {
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.cssSelector("#loginPanel > form > div:nth-child(5) > input")).click();
	}

	@Then("I should be taken to the Overview page")
	public void i_should_be_taken_to_the_Overview_page() {
		
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1")).isDisplayed();
		driver.findElement(By.linkText("Log Out")).click();


	}

	
	  @After
	  public void close(){
			driver.close();
	  }

}
