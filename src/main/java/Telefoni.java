import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Telefoni extends BasePage {

    public Telefoni (ChromeDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"rightwrap\"]/div/div[1]/div/p/a/img")
    WebElement mobilniTelefoni;

}
