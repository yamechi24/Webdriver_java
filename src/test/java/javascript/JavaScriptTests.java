package javascript;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testSelectMultipleOptions(){
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.addElementToDD();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropDownPage::selectFromDropDown);

        var selectedOptions =  dropDownPage.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().ScrollToParagraph(5);
    }

}
