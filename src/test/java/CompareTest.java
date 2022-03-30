import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CompareTest extends BaseTest {

    /**
     * Compare two different LG tv models
     *
     * Steps:
     * 1. Login as valid user
     * 2. Put text "LG televizor" into search bar and click on "pronadji" button
     * 3. Click on the button "uporedi" for "LG 32LM637BPLA SMART HD READY model"
     * 4. Click on the button "uporedi" for "LG 32LQ630B6LA HD READY SMART model"
     * 5. Click on the button "UPOREDI PROIZVODE"
     * Expected results
     * 1. Verify that you are on compare page URL "https://www.bcgroup-online.com/compare"
     * 2. Verify that "POREDJENJE PROIZVODA" text is on the front of page
     */



    @Test
    public void searchForLgInSearchMenu()
    {
        ChromeDriver driver = openChromeDriver();

        try {
            print("Login as valid user");
            PageAfterSuccessLogin pageAfterSuccessLogin = loginAsValidUser(driver);

            print("Put text LG televizor into search bar and click on pronadji button");
            pageAfterSuccessLogin.searchButton.sendKeys("LG televizor");
            pageAfterSuccessLogin.pronadjiButton.click();

            SearchLgTelevizorPage searchLgTelevizorPage = new SearchLgTelevizorPage(driver);

            print("Click on the button uporedi for LG 32LM637BPLA SMART HD READY model");
            searchLgTelevizorPage.uporediButtonForLG32LM637BPLA.click();

            print("Click on the button uporedi for LG 32LQ630B6LA SMART HD READY model");
            searchLgTelevizorPage.uporediButtonForLG32LQ630B6LA.click();

            sleep(1);
            print("Click on the button UPOREDI PROIZVODE");
            searchLgTelevizorPage.uporediProizvodeButton.click();

            print("Verify that you are on compare page URL https://www.bcgroup-online.com/compare");
            assertUrl(driver.getCurrentUrl(), Strings.COMPARE_PAGE);

            print("Verify that ''POREDJENJE PROIZVODA'' text is on the front of page");
            ComparePage comparePage = new ComparePage(driver);
            comparePage.compare();


        }finally {
//            driver.quit();

        }

    }



}
