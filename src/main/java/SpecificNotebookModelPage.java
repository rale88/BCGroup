import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecificNotebookModelPage {

    @FindBy(xpath = "//*[@id=\"product\"]/div[2]/div/h2")
    WebElement introText;


    public SpecificNotebookModelPage getIntroText () {
        assert introText.getText().equals("HP ZBook Fury 15 G7 i7-10750H, 16GB, 256GB+500GB SSD, T1000 4GB, Win10 Pro (119X9EA/500)") : "Wrong, actual shoud be:" + introText.getText();
        return this;
    }
}





