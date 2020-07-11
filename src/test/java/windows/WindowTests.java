package windows;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WindowTests extends BaseTests {


    @Test
    public void testWindow(){

        var buttonPage = homePage.clickDynamicLoading().rightClickExample2();
        getWindowManager().switchToNewTab();
        assertTrue(buttonPage.isStartButtonDisplayed(), "Start button is not displayed");


    }
}
