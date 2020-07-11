package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ForgotPassTests extends BaseTests {

    @Test
    public void testRetrievePassword(){
        var forgetPasswordPage = homePage.clickForgotPass();
        var emailSentPage = forgetPasswordPage.retrievePassword("tau@example.com");
        assertEquals( emailSentPage.getMessage(), "Your e-mail's been sent!", "Message is incorrect");
    }
}
