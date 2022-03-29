import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class SearchLgTelevizorPage extends BasePage {

    public SearchLgTelevizorPage (ChromeDriver driver){
        super(driver);
    }

  @FindBy(xpath = "//a[@data-id = '84861']")
    WebElement uporediButtonForLG32LM637BPLA;

  @FindBy(xpath = "//a[@data-id = '115330']")
  WebElement uporediButtonForLG32LQ630B6LA;

    @FindBy(xpath = "//span[@data-href = '/compare']")
  WebElement uporediProizvodeButton;

}
