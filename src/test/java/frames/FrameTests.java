package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text1 = "Hello";
        String text2 = "world";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), text1+text2, "Text from editor is incorrect" );
    }

    @Test
    public void testsFrames2(){
        var nestedFramesPage2  = homePage.clickFramePage2();
        assertEquals(nestedFramesPage2.getMiddleFrame(), "MIDDLE", "Middle text incorrect");
        assertEquals(nestedFramesPage2.getRightFrame(), "RIGHT", "Right frame text incorrect");

    }

    @Test
    public void testsFrames(){
        var nestedFramesPage  = homePage.clickFramePage();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Left text incorrect");
        assertEquals(nestedFramesPage.getBottomFrame(), "BOTTOM", "Bottom frame text incorrect");
    }


}
