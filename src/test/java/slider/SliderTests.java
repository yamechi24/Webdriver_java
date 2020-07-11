package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void testSlide(){
        String value = "4";
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.clickSlide(value);
        assertEquals(horizontalSliderPage.getResult(), value, "Slider value is incorrect");


    }
}
