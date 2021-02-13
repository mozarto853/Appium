import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IGTest extends IGBase{

    @Test
    public void open() throws InterruptedException {

        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Search and Explore");
        el1.click();

        MobileElement el2 = (MobileElement) driver.findElementById("com.instagram.android:id/action_bar_search_edit_text");
        el2.click();
        el2.sendKeys("VivaLaaGrace");

        MobileElement el3 = (MobileElement) driver.findElementById("com.instagram.android:id/row_search_avatar_with_ring");
        el3.click();


        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("2 photos by VivaLaGrace at Row 1, Column 1");
        el4.click();

    }

}
