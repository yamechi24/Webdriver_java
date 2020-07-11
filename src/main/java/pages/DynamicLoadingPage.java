package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By link_Example1 = By.xpath(String.format(linkXpath_Format, "Example 1"));
    private By link_Example2 = By.xpath(String.format(linkXpath_Format, "Example 2"));
    private By startButton = By.cssSelector("#start button");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingPageExample1Page clickExample1() {
        driver.findElement(link_Example1).click();
        return new DynamicLoadingPageExample1Page(driver);
    }

    public DynamicLoadingPageExample2Page clickExample2() {
        driver.findElement(link_Example2).click();
        return new DynamicLoadingPageExample2Page(driver);
    }

    public DynamicLoadingPageExample2Page rightClickExample2() {

        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        driver.findElement(link_Example2).sendKeys(selectLinkOpeninNewTab);
        return new DynamicLoadingPageExample2Page(driver);
    }



}
