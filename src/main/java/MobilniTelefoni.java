import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class MobilniTelefoni extends BasePage {

    public MobilniTelefoni(ChromeDriver driver){
        super(driver);

    }

    @FindBy(xpath = "//*[@id=\"prodCarousel\"]/div/div[1]/div[1]/div/p[1]/a[2]/img")
    WebElement galaxyA12;

}
