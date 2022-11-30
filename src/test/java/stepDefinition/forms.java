package stepDefinition;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import objectRepository.pageHome;

public class forms extends env {
    pageHome elementHome = new pageHome();
    @Given("user in Home page")
    public void user_in_home_page() {
//        driver.findElement(elementHome.getTxtWebdriver()).isDisplayed();
    }
    @When("user click Forms button")
    public void user_click_forms_button() {

    }
    @And("user input field")
    public void user_input_field() {

    }
    @And("user enabled switch toggle")
    public void user_enabled_switch_toggle() {

    }
    @And("user select an item")
    public void user_select_an_item() {

    }
    @And("user click Active button")
    public void user_click_active_button() {

    }
    @And("user click Ok")
    public void user_click_ok() {

    }
}
