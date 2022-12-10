package objectRepository;

import org.openqa.selenium.By;

public class pageHome {
    By verifyHome = By.xpath("//*[@content-desc = 'Home-screen']");

    public By getVerifyHome() {
        return verifyHome;
    }
    By btnSwipe = By.xpath("//*[@content-desc = 'Swipe']");

    public By getBtnSwipe() {
        return btnSwipe;
    }
    By btnForms = By.xpath("//*[@content-desc = 'Forms']");

    public By getBtnForms() {
        return btnForms;
    }
}
