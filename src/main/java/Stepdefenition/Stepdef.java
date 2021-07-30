package Stepdefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
	WebDriver driver;
	@When("^I Launch Demo Automation$")
	public void i_Launch_Demo_Automation() throws Throwable {
	    driver.get("http://demo.automationtesting.in/Register.html");
	    throw new PendingException();
	}

	@Then("^I Click Skip Signin$")
	public void i_Click_Skip_Signin() throws Throwable {
		driver.findElement(By.id("btn2")).click();
	    throw new PendingException();
	}
		
	@Given("^user fill the register form$")
	public void Register_Form(){
		driver.findElement(By.id("btn2")).click();
		
	}
@Then("^Register Page Should get Displayed$")
public void register_Page_Should_get_Displayed() throws Throwable {
	
    throw new PendingException();
}

@Then("^I Enter First Name as \"([^\"]*)\"$")
public void i_Enter_First_Name_as(String arg1) throws Throwable {
	driver.findElement(By.xpath("/input[@placeholder='First Name']")).sendKeys("selvi");
    throw new PendingException();
}

@Then("^I Enter Last Name as \"([^\"]*)\"$")
public void i_Enter_Last_Name_as(String arg1) throws Throwable {
	driver.findElement(By.xpath("/input[@placeholder='Last Name']")).sendKeys("Ganesan");
    throw new PendingException();
}

@Then("^I Enter Address as\"([^\"]*)\"$")
public void i_Enter_Address_as(String arg1) throws Throwable {
	driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Ramasamy konar nagar vellalore");
    throw new PendingException();
}
@Then("^I Enter Email Address as \"([^\"]*)\"$")
public void i_Enter_Email_Address_as(String arg1) throws Throwable {
	driver.findElement(By.xpath("input[@ng-model='EmailAdress']")).sendKeys("selviganesansn.123@gmail.com");
    throw new PendingException();
}

@Then("^I Enter Phone Number as \"([^\"]*)\"$")
public void i_Enter_Phone_Number_as(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I Choose Gender  \"([^\"]*)\"$")
public void i_Choose_Gender(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I Choose Hobbies  \"([^\"]*)\"$")
public void i_Choose_Hobbies(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I Select Language as \"([^\"]*)\"$")
public void i_Select_Language_as(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I Select Skill  \"([^\"]*)\"$")
public void i_Select_Skill(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I Select Country  \"([^\"]*)\"$")
public void i_Select_Country(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I Select Date Of Birth \"([^\"]*)\"$")
public void i_Select_Date_Of_Birth(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I Enter Password as \"([^\"]*)\"$")
public void i_Enter_Password_as(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I Enter Confirm Password as \"([^\"]*)\"$")
public void i_Enter_Confirm_Password_as(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I Should Submit the Filled Form$")
public void i_Should_Submit_the_Filled_Form() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should Not Click Refresh$")
public void i_should_Not_Click_Refresh() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}}