package Featurefile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstFeature {
	
WebDriver driver;
@Given("^user is in facebook log in page$")
public void user_is_in_facebook_log_in_page()  {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\pradeep.kumar.nr\\Downloads\\installations\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");

  
}

@When("^User enters users first name$")
public void user_enters_users_first_name() {
	driver.findElement(By.xpath("//*[@id=\"u_0_l\"]")).sendKeys("pradeep");
	   
}

@And("^User enters surname$")
public void user_enters_surname() throws Throwable {
	
	 driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).sendKeys("nadig");

   
}

@Then("^First name is reflected in the userts first name field$")
public void first_name_is_reflected_in_the_userts_first_name_field()  {
	String usernameactual= driver.findElement(By.xpath("//*[@id=\"u_0_l\"]")).getAttribute("value");
	Assert.assertEquals("pradeep", usernameactual);
    
}


@And("^User checks users surnmae is present$")
public void user_checks_users_surnmae_is_present() throws Throwable {
	String userSurnameactual= driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).getAttribute("value");
	Assert.assertEquals("nadig", userSurnameactual);
  
}

@And("^User checks the mobile number filed is empty$")
public void user_checks_the_mobile_number_filed_is_empty() throws Throwable {
	String userMobileNumber= driver.findElement(By.xpath("//*[@id=\"u_0_q\"]")).getAttribute("value");
	Assert.assertEquals("", userMobileNumber);

}



}
