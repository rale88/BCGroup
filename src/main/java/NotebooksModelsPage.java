import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class NotebooksModelsPage extends BasePage {

    public NotebooksModelsPage(ChromeDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//label[text() = 'HP']")
    WebElement checkboxHP;

    @FindBy(xpath = "//label[text() = 'Office']")
    WebElement checkboxOffice;

    @FindBy(xpath = "//label[@for = 'f-1-7']")
    WebElement checkboxDiagonalSize;

    @FindBy(xpath = "//label[@for = 'f-2-14']")
    WebElement checkboxProcessor;

    @FindBy(xpath = "//label[@for = 'f-3-22']")
    WebElement checkboxRamMemory;

    @FindBy(xpath = "//img[@alt='HP ZBook Fury 15 G7 i7-10750H, 16GB, 256GB+500GB SSD, T1000 4GB, Win10 Pro (119X9EA/500)']")
    WebElement hpZbookFury;
}
