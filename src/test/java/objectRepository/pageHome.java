package objectRepository;

import org.openqa.selenium.By;

public class pageHome {
    By txtWebdriver = By.xpath("//*[contains(text(), 'WEBDRIVER')]");

    public By getTxtWebdriver() {
        return txtWebdriver;
    }

    By btnSwipe = By.xpath("//*[@content-desc = 'Swipe']");

    public By getBtnSwipe() {
        return btnSwipe;
    }
}
