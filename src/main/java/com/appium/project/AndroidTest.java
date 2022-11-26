package com.appium.project;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidTest {
    private static AppiumDriver<MobileElement> driver;
    private static DesiredCapabilities capabilities;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "RYZ");
        capabilities.setCapability("udid", "c3b0b9c4");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
        //capabilities.setCapability("app", "/Users/reyzapratamakomala/Downloads/Foody.apk");
        capabilities.setCapability("appPackage", "com.foody.vn.activity");
        capabilities.setCapability("appActivity", "com.foody.vn.activity.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url, capabilities);

    }
}
