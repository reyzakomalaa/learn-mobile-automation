package objectRepository;

import org.openqa.selenium.By;

public class pageForms {
    By fieldInput = By.xpath("//*[@content-desc = 'text-input']");

    public By getFieldInput() {
        return fieldInput;
    }
    By fieldInputResult = By.xpath("//*[@content-desc = 'input-text-result']");

    public By getFieldInputResult() {
        return fieldInputResult;
    }

    By toggleSwitch = By.xpath("//*[@content-desc= 'switch']");

    public By getToggleSwitch() {
        return toggleSwitch;
    }

    By dropdownItem = By.xpath("//*[@content-desc= 'Dropdown']");

    public By getDropdownItem() {
        return dropdownItem;
    }
    By optionItem = By.xpath("//*[@resource-id = 'android:id/text1'][3]");

    public By getOptionItem() {
        return optionItem;
    }
    By txtItem = By.xpath("//*[@content-desc= 'Dropdown']/android.view.ViewGroup/android.widget.EditText");

    public By getTxtItem() {
        return txtItem;
    }
    By btnActive = By.xpath("//*[@content-desc = 'button-Active']");

    public By getBtnActive() {
        return btnActive;
    }
    By verifyButtonActive = By.xpath("//*[@resource-id = 'android:id/message']");

    public By getVerifyButtonActive() {
        return verifyButtonActive;
    }
    By btnOk = By.xpath("//*[@resource-id = 'android:id/button1']");

    public By getBtnOk() {
        return btnOk;
    }
}
