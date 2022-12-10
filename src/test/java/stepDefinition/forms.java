package stepDefinition;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import objectRepository.pageHome;
import objectRepository.pageForms;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class forms extends env {
    pageHome elementHome = new pageHome();
    pageForms elementForms = new pageForms();
    @Given("user in Home page")
    public void user_in_home_page() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementHome.getVerifyHome()));
        driver.findElement(elementHome.getVerifyHome()).isDisplayed();
    }
    @When("user click Forms button")
    public void user_click_forms_button() {
        driver.findElement(elementHome.getBtnForms()).click();
    }
    @And("user input field")
    public void user_input_field() throws InterruptedException {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementForms.getFieldInput()));

        driver.findElement(elementForms.getFieldInput()).sendKeys("Test Input");

        getFieldInput = driver.findElement(elementForms.getFieldInput()).getText();
        Thread.sleep(200);
        verifyFieldInput = driver.findElement(elementForms.getFieldInputResult()).getText();
        Assert.assertEquals(getFieldInput, verifyFieldInput);

        System.out.println("Expected : " + getFieldInput);
        System.out.println("Actual : " + verifyFieldInput);
    }
    @And("user enabled switch toggle")
    public void user_enabled_switch_toggle() {
        driver.findElement(elementForms.getToggleSwitch()).click();
    }
    @And("user select an item")
    public void user_select_an_item() throws InterruptedException {
        driver.findElement(elementForms.getDropdownItem()).click();

        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementForms.getOptionItem()));

        getItem = driver.findElement(elementForms.getOptionItem()).getText();
        driver.findElement(elementForms.getOptionItem()).click();

        verifyItem = driver.findElement(elementForms.getTxtItem()).getText();
        Assert.assertEquals(getItem, verifyItem);

        System.out.println("Expected : " + getItem);
        System.out.println("Actual : " + verifyItem);
    }
    @And("user click Active button")
    public void user_click_active_button() {
        driver.findElement(elementForms.getBtnActive()).click();
    }
    @And("user click Ok")
    public void user_click_ok() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementForms.getVerifyButtonActive()));
        driver.findElement(elementForms.getVerifyButtonActive()).isDisplayed();

        driver.findElement(elementForms.getBtnOk()).click();
    }
}
