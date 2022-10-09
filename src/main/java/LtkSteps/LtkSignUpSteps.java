package LtkSteps;

import com.test.ltk.pages.SignUpPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LtkSignUpSteps {

    WebDriver driver = new ChromeDriver();
    SignUpPage signUp = new SignUpPage(driver);

    @When("The user navigate to LTK home page")
    public void the_user_navigate_to_ltk_home_page() {

    }
    @Then("the user create username and password")
    public void the_user_create_username_and_password() {

    }
    @Then("The user navigates to Discover page")
    public void the_user_navigates_to_discover_page() {

    }


}
