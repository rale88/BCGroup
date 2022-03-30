import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    public CartPage(ChromeDriver driver) {
        super(driver);

    }
        @FindBy(xpath = "//a[text() = 'Nastavi kupovinu']")
        WebElement nastaviKupovinuButton;


    public String getNastaviKupovinuText(){
        String nastaviKupovinuText = nastaviKupovinuButton.getText();
        return nastaviKupovinuText;
    }
    }



