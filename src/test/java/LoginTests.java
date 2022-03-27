import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    /**
     * Login with valid credentials
     *
     * Steps:
     * 1. Open Chrome driver
     * 2. Enter valid Username
     * 3. Enter valid password
     * 4. Click on the login button
     *
     * Expected results
     * Verify that current URL is AFTERLOGIN_URL = "https://www.bcgroup-online.com/korisnik";
     */

    @Test
    public void loginWithValidCredentials() {

        ChromeDriver driver = openChromeDriver();

        try {
            LoginPage loginPage = new LoginPage(driver);

            loginPage.enterTextIntoUsernameField(Strings.STANDARD_USER)
                    .enterTextIntoPasswordField(Strings.VALID_PASSWORD)
                    .clickLoginButton();

            assertUrl(driver.getCurrentUrl(), Strings.AFTERLOGIN_URL);
        } finally {
            driver.quit();
        }
    }

    /**
     * Login with invalid credentials
     *
     * Steps:
     * 1. Open Chrome driver
     * 2. Enter invalid Username
     * 3. Enter valid password
     * 4. Click on the login button
     *
     * Expected results
     * Verify that current URL is LOGIN_URL = "https://www.bcgroup-online.com/korisnik-login";
     */
        @Test
        public void loginWithInvalidCredentials(){

            ChromeDriver driver = openChromeDriver();

            try {
                LoginPage loginPage = new LoginPage(driver);

                loginPage.enterTextIntoUsernameField(Strings.INVALID_USER)
                        .enterTextIntoPasswordField(Strings.VALID_PASSWORD).clickLoginButton();

                assertUrl(driver.getCurrentUrl(), Strings.LOGIN_URL);
            }finally {
                driver.quit();
            }
    }
}