package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testClickContextMenu() {
        var menuPage = homePage.clickContextMenu();
        menuPage.rightClickContextMenu();
        String message = menuPage.alert_getText();
        menuPage.alert_clickToAccept();
        assertEquals(message, "You selected a context menu", "Incorrect message");


    }
}
