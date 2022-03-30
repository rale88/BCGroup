import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class AfterSuccessLoginPage extends BasePage{



    @FindBy(xpath = "//a[text()='LAPTOPOVI I TABLETI']")
    WebElement laptopoviITabletiButton;

    @FindBy(xpath = "//a[text()='TELEFONI']")
    WebElement telefoniButton;

    @FindBy(id = "si")
    WebElement searchButton;

    @FindBy(className = "button-search")
    WebElement pronadjiButton;

    @FindBy(xpath = "//a[text() = 'Rasprodaja']")
    WebElement rasprodajaButton;

    public AfterSuccessLoginPage(ChromeDriver driver){
        super(driver);
    }




}
