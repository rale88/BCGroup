import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RasprodajaPage extends BasePage {

    public RasprodajaPage(ChromeDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//label[text() = 'Zvucnici']")
    WebElement checkBoxZvucnici;

    @FindBy(xpath = "//select[@class = 'form-control input-sm']")
    WebElement priceDropDown;

    @FindBy(xpath = "//*[@id=\"products\"]/div[1]/div/p[3]")
    WebElement priceForFirstZvucnickOption;

    @FindBy(xpath = "//*[@id=\"products\"]/div[2]/div/p[3]")
    WebElement priceForSecondZvucnickOption;


    public RasprodajaPage chooseZvucniciAndChoosePriceFromDropDown() {
        Select price = new Select(priceDropDown);
        price.selectByValue("30000");
        sleep(3);
        checkBoxZvucnici.click();
        return this;
    }



//
    public RasprodajaPage assertValuesAreBelowThanRequested() {
        int num = 30000;
        priceForFirstZvucnickOption.getText();
        String price1 = priceForFirstZvucnickOption.getText();
        sleep(3);
        Float priceNum1 = Float.valueOf(price1);
//        priceForSecondZvucnickOption.getText();
        String price2 = priceForSecondZvucnickOption.getText();
        int priceNum2 = Integer.parseInt(price2);
        System.out.println(priceNum1);
        if(priceNum1<num){
            System.out.println("GOOD!");
        }
        if (priceNum2<num){
            System.out.println("GOOD!");
        }
        else {
            System.out.println("Wrong, products should be cheaper than requested value of" + num);
        }
        return this;
        }
    }





