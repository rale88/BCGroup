import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class TVModelPage extends BasePage {

    public TVModelPage(ChromeDriver driver){
        super(driver);
    }

  @FindBy(xpath = "//a[@data-id = '115326']")
    WebElement uporediButtonForLG32LQ63006LA;

  @FindBy(xpath = "//a[@data-id = '115330']")
  WebElement uporediButtonForLG32LQ630B6LA;

    @FindBy(xpath = "//span[@data-href = '/compare']")
  WebElement uporediProizvodeButton;

}
