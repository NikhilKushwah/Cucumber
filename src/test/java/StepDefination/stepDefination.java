package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {

    @Given("User is on NetBanking landing page")
    public void user_is_on_netbanking_landing_page() throws Throwable
    {
    	//Code to navigate to url login
    	System.out.println("This is landing page");
        
    }

    @When("User login into application with username and password")
    public void user_login_into_application_with_username_and_password() throws Throwable
    {
        //code to login
    	System.out.println("This is Login page");
    }

    @Then("Home page is populated")
    public void home_page_is_populated() throws Throwable
    {
     //home page validation  
    	System.out.println("This is home page");
    }

    @And("Cards are displayed")
    public void cards_are_displayed() throws Throwable 
    {
    	//card validation
    	System.out.println("Card is displayed");
        
    }
    
    @Given("some other precondition")
    public void some_other_precondition() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Some othere precondition");
    }

    @When("some other action")
    public void some_other_action() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Action performed");
    }

    @When("yet another action")
    public void yet_another_action() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("yet another action performaed");
    }

    @Given("I want to write a step with name1")
    public void i_want_to_write_a_step_with_name1() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("I want to write a step with name1");
    }

    @When("I check for the {int} in step")
    public void i_check_for_the_in_step(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Check for the in step");
    }

    @Then("I verify the success in step")
    public void i_verify_the_success_in_step() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Verify the success in step");
    }

    @Given("I want to write a step with name2")
    public void i_want_to_write_a_step_with_name2() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("write the name with step");
    }

    @Then("I verify the Fail in step")
    public void i_verify_the_fail_in_step() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Fail in step");
    }

}
