import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    /**
     * Login with valid credentials
     *
     * Steps:
     * 1. Open Chrome
     * 2. Open login page
     * 3. Enter valid Username
     * 4. Enter valid password
     * 5. Click on the login button
     *
     * Expected results
     * Verify that current URL is AFTERLOGIN_URL = "https://www.bcgroup-online.com/korisnik";
     */

    @Test
    public void loginWithValidCredentials() {

        print("Open Chrome");
        ChromeDriver driver = openChromeDriver();

        try {
            print("Open login page");
            LoginPage loginPage = new LoginPage(driver);

            print("Enter valid username");
            loginPage.enterTextIntoUsernameField(Strings.STANDARD_USER);

            print("Enter valid password");
            loginPage.enterTextIntoPasswordField(Strings.VALID_PASSWORD);

            print("Click on the login button");
            loginPage.clickLoginButton();

            print("Verify that current URL is AFTERLOGIN_URL");
            assertUrl(driver.getCurrentUrl(), Strings.AFTERLOGIN_URL);
        } finally {
//            driver.quit();
        }
    }

    /**
     * Login with invalid credentials
     *
     * Steps:
     * 1. Open Chrome
     * 2. Open login page
     * 2. Enter invalid Username
     * 3. Enter valid Password
     * 4. Click on the login button
     *
     * Expected results
     * Verify that current URL is LOGIN_URL = "https://www.bcgroup-online.com/korisnik-login";
     */
        @Test
        public void loginWithInvalidCredentials(){

            print("Open Chrome");
            ChromeDriver driver = openChromeDriver();

            try {
                print("Open login page");
                LoginPage loginPage = new LoginPage(driver);

                print("Enter invalid username");
                loginPage.enterTextIntoUsernameField(Strings.INVALID_USER);

                print("Enter valid password");
                loginPage.enterTextIntoPasswordField(Strings.VALID_PASSWORD);

                print("Click on the login button");
                loginPage.clickLoginButton();

                print("Verify that current URL is LOGIN_URL = \"https://www.bcgroup-online.com/korisnik-login");
                assertUrl(driver.getCurrentUrl(), Strings.LOGIN_URL);
            }finally {
//                driver.quit();
            }
    }
}