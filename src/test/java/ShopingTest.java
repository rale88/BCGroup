import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.print.attribute.standard.PrinterInfo;

public class ShopingTest extends BaseTest {

    /**
     * Add an item from AfterSuccessLoginPage to cart
     * <p>
     * Steps:
     * 1. Login as valid user
     * 2. From AfterSuccessLoginPage choose 'telefoni' group option
     * 3. From GroupOfTelefoniPage choose 'mobilni telefoni' button
     * 4. From SmarthponeModelsPage, click on 'galaxyA12' button
     * 5. From SpecificSmartphoneModelPage, click on 'dodaj u korpu' button
     * Expected results
     * 1. Verify that shopping page contains 'Nastavi kupovinu' text
     * 2. Verify that current URL is: "https://www.bcgroup-online.com/korpa"
     */

    @Test
    public void addOneItemToPayment() {
        ChromeDriver driver = openChromeDriver();

        try {
            print("Login as valid user");
            AfterSuccessLoginPage pageAfterSuccessLogin = loginAsValidUser(driver);

            print("Choose 'telefoni' group option");
            pageAfterSuccessLogin.telefoniButton.click();

            print("Choose 'mobilni telefoni' ");
            GroupOfTelefoniPage telefoni = new GroupOfTelefoniPage(driver);
            telefoni.mobilniTelefoni.click();

            print("Choose SAMSUNG Galaxy A12 4GB/128GB");
            SmarthponeModelsPage mobilniTelefoni = new SmarthponeModelsPage(driver);
            mobilniTelefoni.pickGalaxyA12();

            print("Choose 'dodaj u korpu' button");
            SpecificSmartphoneModelPage samsungGalaxyA12 = new SpecificSmartphoneModelPage(driver);
            samsungGalaxyA12.getPhoneInCart();

            print("Verify that shopping page contains 'Nastavi kupovinu' text");
            CartPage korpa = new CartPage(driver);
            assert korpa.getNastaviKupovinuText().equals("Nastavi kupovinu") : "Wrong text. Actual:" + korpa.getNastaviKupovinuText();

            print("Verify that current URL is: 'https://www.bcgroup-online.com/korpa");
            assertUrl(driver.getCurrentUrl(), Strings.KORPA_PAGE);


        } finally {
//             driver.quit();

        }
    }
        /**
         * Go to smartphones page and add one item from different page
         *
         * Steps:
         * 1. Login as valid user
         * 2. From AfterSuccessLoginPage click on 'Telefoni' button
         * 3. From GroupOfTelefoniPage, click on mobilni telefoni' button
         * 4. From SmarthponeModelsPage page, go on 3rd page
         * 5. From 3rd page go to last page '>>'
         * Expected results
         * Verify that going through pages redirecting properly
         * 1.Verify via URL redirection to 3rd page
         * 2.Verify via URL redirection to last page
         */
//
        @Test
        public void checkRedirectionToDifferentPages () {
            ChromeDriver driver = openChromeDriver();

            try {
                print("Login as valid user");
                AfterSuccessLoginPage pageAfterSuccessLogin = loginAsValidUser(driver);

                print("Choose 'telefoni' button");
                pageAfterSuccessLogin.telefoniButton.click();

                print("Choose 'mobilni telefoni' button");
                GroupOfTelefoniPage telefoni = new GroupOfTelefoniPage(driver);
                telefoni.mobilniTelefoni.click();

                print("Go to page 3");
                SmarthponeModelsPage mobilniTelefoni = new SmarthponeModelsPage(driver);
                mobilniTelefoni.page3Button.click();

                print("Verify via URL redirection to 3rd page");
                assertUrl(driver.getCurrentUrl(), Strings.THIRD_PAGE);

                print("Go to last page '>>'");
                mobilniTelefoni.lastPageButton.click();

                print("Verify via URL redirection to last page");
                assertUrl(driver.getCurrentUrl(), Strings.LAST_PAGE);


            } finally {
//             driver.quit();

            }
        }
    }

