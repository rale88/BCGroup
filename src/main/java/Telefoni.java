import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Telefoni extends BasePage {

    public Telefoni (ChromeDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//img[@alt='Mobilni telefoni']")
    WebElement mobilniTelefoni;

}

