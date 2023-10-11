package stepdefinitions;

import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;

import java.time.Duration;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Given("navigate to OrangeHRM application")
    public void navigate_to_orange_hrm_application() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
    }
    @When("enter a valid username {string} and password {string}")
    public void enter_a_valid_username_and_password(String username, String password) {
//        System.out.println("enter a valid username "+username+" and password "+ password);
        loginPage.fillUsername(username);
        loginPage.fillPassword(password);
    }
    @When("click on the {string} button")
    public void click_on_the_button(String string) {
        loginPage.clickLogin();
    }
    @Then("user should be navigated to dashboard")
    public void user_should_be_navigated_to_dashboard() {
        if(!dashboardPage.verifyDashboard()) {
            System.out.println("***USER SHOULD BE LOGGED IN***");
            Assert.fail("***USER SHOULD BE LOGGED IN***");
        }
    }

    @Then("user should not be navigated to dashboard")
    public void user_should_not_be_navigated_to_dashboard() {
        if(dashboardPage.verifyDashboard()) {
            System.out.println("***USER SHOULD NOT BE LOGGED IN***");
            Assert.fail("***USER SHOULD NOT BE LOGGED IN***");
        }

    }

    @Then("close the application")
    public void close_application() {
        driver.quit();
    }


    //// Hooks

    // Feature Hook
    @BeforeAll
    public static void beforeFeature() {
        System.out.println("*****BEFORE FEATURE*****");
    }
    @AfterAll
    public static void afterFeature() {
        System.out.println("*****AFTER FEATURE*****");
    }

    // Scenario Hooks
    @Before
    public void beforeScenario() {
        System.out.println("*****BEFORE SCENARIO*****");
    }
    @After
    public void afterScenario() {
        System.out.println("*****AFTER SCENARIO*****");
    }

    // Step Hooks
    @BeforeStep
    public void beforeEveryStep() {
        System.out.println("*****BEFORE STEP*****");
    }
    @AfterStep
    public void afterEveryStep() {
        System.out.println("*****AFTER STEP*****");
    }

}
