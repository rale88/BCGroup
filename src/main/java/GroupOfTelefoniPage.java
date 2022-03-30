import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class GroupOfTelefoniPage extends BasePage {

    public GroupOfTelefoniPage(ChromeDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//img[@alt='Mobilni telefoni']")
    WebElement mobilniTelefoni;


}

