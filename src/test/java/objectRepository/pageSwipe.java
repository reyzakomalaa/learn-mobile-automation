package objectRepository;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class pageSwipe {
    By scroll_toJsFoundation = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollIntoView(textContains(\"JS.FOUNDATION\"))");

    public By getScroll_toJsFoundation() {
        return scroll_toJsFoundation;
    }
    By scroll_toRobot = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(descriptionContains(\"WebdriverIO logo\"))");

    public By getScroll_toRobot() {
        return scroll_toRobot;
    }
    By iconRobot = By.xpath("//*[@content-desc= 'WebdriverIO logo']");

    public By getIconRobot() {
        return iconRobot;
    }
    By txtJSFoundation = By.xpath("//*[contains(@text, 'JS.FOUNDATION')]");

    public By getTxtJSFoundation() {
        return txtJSFoundation;
    }
}
