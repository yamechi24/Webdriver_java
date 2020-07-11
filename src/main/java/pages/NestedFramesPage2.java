package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage2 {

    private WebDriver driver;
    private String topFrame = "frame-top";
    private String middleFrame = "frame-middle";
    private String rightFrame = "frame-right";
    private By body = By.tagName("body");

    public NestedFramesPage2(WebDriver driver){
        this.driver = driver;
    }
    public String getMiddleFrame(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(middleFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame(); //exit middle to top
        driver.switchTo().parentFrame(); //exit top to main
        return text;
    }

    public String getRightFrame(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(rightFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getFrameText(){
        return driver.findElement(body).getText();
    }

}
