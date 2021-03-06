import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class SpecificSmartphoneModelPage extends  BasePage{


    public SpecificSmartphoneModelPage(ChromeDriver driver) {
        super(driver);
    }

    @FindBy(id = "adtocart id=")
    WebElement dodajUKorpuButton;

    @FindBy(xpath = "//img[@alt='akcija']")
    WebElement lastPageAssertText;

    public void getPhoneInCart() {
        dodajUKorpuButton.click();
    }



}


