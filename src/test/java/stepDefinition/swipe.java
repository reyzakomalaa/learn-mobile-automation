package stepDefinition;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pageHome;

public class swipe extends env {
    pageHome elementHome = new pageHome();
    @When("user click swipe")
    public void user_click_swipe() {
        driver.findElement(elementHome.getBtnSwipe()).click();
    }
    @And("user scroll down")
    public void user_scroll_down() {

    }
    @Then("user see robot image")
    public void user_see_robot_image() {

    }
}
