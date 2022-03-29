import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class MobilniTelefoni extends BasePage {

    public MobilniTelefoni(ChromeDriver driver){
        super(driver);

    }

    @FindBy(partialLinkText = "SAMSUNG Galaxy A12 4GB/128GB Beli")
    WebElement galaxyA12;


}
