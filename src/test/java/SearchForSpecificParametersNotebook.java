import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchForSpecificParametersNotebook extends BaseTest {




    /**
     * Search for specific HP Notebook
     *
     * Steps:
     * 1. Login as valid user
     * 2. Choose ''laptopovi i tableti''
     * 3. Choose ''laptopovi''
     * 4. Choose HP, Office, 15.6'', Core i7, 16GB
     * 5. Choose Zbook Fury model
     * Expected results
     * 1. Verify that you are on page ZBOOK_URL from Strings class
     * 2. Verify that header text contains all requested specification
     */

    @Test
    public void searchForSpecificNotebook () {

        ChromeDriver driver = openChromeDriver();

        try {
            print("Login as valid user");
            PageAfterSuccessLogin pageAfterSuccessLogin = loginAsValidUser(driver);

            print("Choose ''laptopovi i tableti''");
            pageAfterSuccessLogin.laptopoviITabletiButton.click();

            print("Choose ''laptopovi''");
            PageLaptopoviITableti pageLaptopoviITableti = new PageLaptopoviITableti(driver);
            pageLaptopoviITableti.laptopoviButton.click();

            PageLaptopovi pageLaptopovi = new PageLaptopovi(driver);
            print("Choose HP checkbox");
            pageLaptopovi.checkboxHP.click();
            sleep(1);

            print("Choose office checkbox");
            pageLaptopovi.checkboxOffice.click();
            sleep(1);

            print("Choose 15.6'' checkbox");
            pageLaptopovi.checkboxDiagonalSize.click();
            sleep(1);

            print("Choose Core i7 checkbox");
            pageLaptopovi.checkboxProcessor.click();
            sleep(1);

            print("Choose 16GB checkbox");
            pageLaptopovi.checkboxRamMemory.click();
            sleep(1);

            print("Choose Zbook Fury model");
            pageLaptopovi.hpZbookFury.click();

            print("Verify that header text contains all requested specification");
            assertUrl(driver.getCurrentUrl(), Strings.ZBOOK_URL_PAGE);


        }finally {
//            driver.quit();
        }



    }


}
