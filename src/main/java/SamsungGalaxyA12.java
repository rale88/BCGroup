import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class SamsungGalaxyA12  extends  BasePage{


    public SamsungGalaxyA12(ChromeDriver driver) {
        super(driver);
    }

    @FindBy(id = "adtocart id=")
    WebElement dodajUKorpuButton;
}


