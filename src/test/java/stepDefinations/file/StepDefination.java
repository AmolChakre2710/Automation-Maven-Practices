package stepDefinations.file;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import java.util.Collections;
import java.util.List;


@RunWith(Cucumber.class)
public class StepDefination {

	@Given("^User  is on Netbanking login page$")
    public void user_is_on_netbanking_login_page() throws Throwable {
        System.out.println("User  is on Netbanking login page");
    }

	@When("User enter his username {string} and password {string}")
	public void user_enter_his_username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Logged in successfuly");
	    System.out.println(string);
	    System.out.println(string2);
    }

    @Then("^User is on Netbanking home page$")
    public void user_is_on_netbanking_home_page() throws Throwable {
        System.out.println("User is on his Netbanking home page");
    }

    @And("cards displayed are {string}")
	public void cards_displayed_are(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println(string);
    }
    
    @When("^User is signup with following details$")
    public void user_is_signup_with_following_details(DataTable data) throws Throwable {
 
    	/*List<List<String>> datas = Collections.singletonList(data.asList());*/
    	 List<List<String>> datas = data.asLists(String.class);
    	System.out.println(datas.get(0).get(0));
    	System.out.println(datas.get(0).get(1));
    	System.out.println(datas.get(0).get(2));
    	System.out.println(datas.get(0).get(3));
    	System.out.println(datas.get(0).get(4));
    	
    }
    
    @When("^User login into application with username (.+) and password (.+)$")
    public void user_login_into_application_with_username_and_password(String username, String password) throws Throwable {
    	
		 System.out.println(username);
		 System.out.println(password);
    }
    
    @Given("Validate browser is opening")
    public void validate_browser_is_opening() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Deciding the browser");
    }
    @When("Browser is triggered")
    public void browser_is_triggered() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Trigerring the browser");
    }
    @Then("Broweser is opened successfully")
    public void broweser_is_opened_successfully() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Browser is opened sucessfully");
    }



}