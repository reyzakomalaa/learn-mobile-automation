package config;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class env {
    protected static AppiumDriver driver;
    protected static WebDriverWait wait;
    protected static DesiredCapabilities capabilities;
    public static String getFieldInput;
    protected static String verifyFieldInput;
    public static String getItem ;
    protected static String verifyItem;
}
