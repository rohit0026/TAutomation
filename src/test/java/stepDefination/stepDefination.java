package stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefination {
	
	
	@Given("^User on login page$")
	public void User_on_login_page()
	{
		System.out.println("Given invoked from cucumber");
	}
	
	@When("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String arg1, String arg2) throws Throwable {
	
		System.out.println("When invoked from cucumber");
		System.out.println(arg1);
		System.out.println(arg2);
	}
	
	@Then("^Home page is diaplayed \"([^\"]*)\"$")
	public void Home_page_is_diaplayed(String arg1) throws Throwable
	{
		System.out.println("Then invoked from cucumber " + "" + arg1);
	}  
	
	@And("^Success \"([^\"]*)\"$")
	public void success(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("And invoked from cucumber for " + arg1);
	}
	

}
