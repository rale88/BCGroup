import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class SmarthponeModelsPage extends BasePage {

    public SmarthponeModelsPage(ChromeDriver driver){
        super(driver);

    }

    @FindBy(partialLinkText = "SAMSUNG Galaxy A12 4GB/128GB Beli")
    WebElement galaxyA12;

    @FindBy(partialLinkText = "DENVER FAS-18100M")
    WebElement denverFas;

    @FindBy(xpath = "//a[@title='Strana 3']")
    WebElement page3Button;

    @FindBy(xpath = "//a[@title='Poslednja strana']")
    WebElement lastPageButton;

    public void pickGalaxyA12 (){
        galaxyA12.click();
    }


}
