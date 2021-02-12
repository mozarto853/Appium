import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class IGBase {
    AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "SM-G950U1");
        cap.setCapability("udid", "98892a42355a4e474f");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9");
        cap.setCapability("noReset",true);

        cap.setCapability("appPackage", "com.instagram.android");
        cap.setCapability("appActivity", "com.instagram.mainactivity.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);

        System.out.println("App started");
    }

    @AfterTest
    public void close(){

    }
}
