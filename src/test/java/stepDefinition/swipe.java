package stepDefinition;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pageHome;
import objectRepository.pageSwipe;

public class swipe extends env {
    pageHome elementHome = new pageHome();
    pageSwipe elementSwipe = new pageSwipe();
    @When("user click swipe")
    public void user_click_swipe() {
        driver.findElement(elementHome.getBtnSwipe()).click();
    }
    @And("user scroll down")
    public void user_scroll_down() {
        driver.findElement(elementSwipe.getScroll_toRobot());
    }
    @Then("user see robot image")
    public void user_see_robot_image() {
        driver.findElement(elementSwipe.getIconRobot()).isDisplayed();
    }

    @And("user swipe to JS Foundation")
    public void user_swipe_to_js_foundation() {
        driver.findElement(elementSwipe.getScroll_toJsFoundation());

    }
    @Then("user see JS Foundation")
    public void user_see_js_foundation() {
        driver.findElement(elementSwipe.getTxtJSFoundation()).isDisplayed();
    }
}
