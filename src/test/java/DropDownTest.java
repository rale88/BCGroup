import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {

    /**
     * Check dropdown functionality
     *
     * Steps:
     * 1. Open Chrome driver
     * 2. Login as valid user
     * 3. Click on 'Rasprodaja' button
     * 4. Choose options 'Zvucnini' and price 30.000 from drop down
     * Expected results
     * Verify that all prices are below 30.000 value
     */

@Test

    public void dropdownPriceValueAndCheckbox () {

    ChromeDriver driver = openChromeDriver();

    try {
        print("Login as valid user");
        AfterSuccessLoginPage pageAfterSuccessLogin = loginAsValidUser(driver);

        print("Click on 'Rasprodaja' button");
        pageAfterSuccessLogin.rasprodajaButton.click();

        print("Choose options 'Zvucnini' and choose price under 30.000 from drop down menu");
        RasprodajaPage rasprodajaPage = new RasprodajaPage(driver);
        rasprodajaPage.chooseZvucniciAndChoosePriceFromDropDown();
        sleep(3);

        print("Verify that all prices are below 30.000 value");
        rasprodajaPage.assertValuesAreBelowThanRequested();


    }finally {
//        driver.quit();
    }


}

}
