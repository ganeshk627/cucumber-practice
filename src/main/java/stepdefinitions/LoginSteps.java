package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

public class LoginSteps {

    @Given("navigate to OrangeHRM application")
    public void navigate_to_orange_hrm_application() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("enter a valid username {string} and password {string}")
    public void enter_a_valid_username_and_password(String username, String password) {
        System.out.println("enter a valid username "+username+" and password "+ password);
        loginPage.fillUsername(username);
        loginPage.fillPassword(password);
    }
    @When("click on the {string} button")
    public void click_on_the_button(String string) {

    }
    @Then("user should be navigated to dashboard")
    public void user_should_be_navigated_to_dashboard() {

    }

    @Then("user should not be navigated to dashboard")
    public void user_should_not_be_navigated_to_dashboard() {

    }


}
