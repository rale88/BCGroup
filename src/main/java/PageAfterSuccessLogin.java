import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class PageAfterSuccessLogin extends BasePage{

    //Webelements
    @FindBy(xpath = "//*[@id=\"mainnavwrap\"]/ul/li[1]/ul/li[2]/a")
    WebElement laptopoviITabletiButton;

    @FindBy(xpath = "//*[@id=\"mainnavwrap\"]/ul/li[1]/ul/li[5]/a")
    WebElement telefoniButton;


    public PageAfterSuccessLogin(ChromeDriver driver){
        super(driver);
    }




}
