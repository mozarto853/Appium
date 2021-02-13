import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class YTBase {


    AndroidDriver<MobileElement> driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "SM-G950U1");
        cap.setCapability("udid", "98892a42355a4e474f");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9");
        cap.setCapability("noReset",true);

        cap.setCapability("appPackage", "com.google.android.youtube");
        cap.setCapability("appActivity", "com.google.android.apps.youtube.app.WatchWhileActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url, cap);

        System.out.println("App started");
    }

    @AfterTest
    public void close(){

    }

    public void enter(){
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void searchKeren(){
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Search");
        el1.click();

        MobileElement el2 = (MobileElement) driver.findElementById("com.google.android.youtube:id/search_edit_text");
        el2.sendKeys("Keren Ortiz");

        enter();
    }
}
