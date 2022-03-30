import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class BaseTest {

    public ChromeDriver openChromeDriver() {
        print("Openening Chrome Driver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--start-maximized"});
        options.addArguments(new String[]{"--ignore-certificate-errors"});
        options.addArguments(new String[]{"--disable-popup-blocking"});
        options.addArguments(new String[]{"--incognito"});
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
        return driver;
    }

    public void assertUrl(String actualUrl, String expectedUrl) {
        print("assertUrl (" + actualUrl + " , " + expectedUrl + " )");
        assert actualUrl.equals(expectedUrl) : "Wrong URL. Expected: " + expectedUrl + " . Actual: " + actualUrl;
    }

    public PageAfterSuccessLogin loginAsValidUser(ChromeDriver driver) {
        print("Login as valid user");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterTextIntoUsernameField(Strings.STANDARD_USER);
        loginPage.enterTextIntoPasswordField(Strings.VALID_PASSWORD);
        PageAfterSuccessLogin afterSuccessLoginPage = loginPage.clickLoginButton();
        return afterSuccessLoginPage;

    }

    public SearchLgTelevizorPage putTextInSearchField(ChromeDriver driver) {
        print("unesi text 'LG televizor'");
        PageAfterSuccessLogin pageAfterSuccessLogin = new PageAfterSuccessLogin(driver);
        pageAfterSuccessLogin.searchButton.sendKeys("LG televizor");
        pageAfterSuccessLogin.searchButton.click();
        SearchLgTelevizorPage searchLgTelevizorPage = new SearchLgTelevizorPage(driver);
        return searchLgTelevizorPage;

    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
        }

    }

    public static void print(String s) {
        System.out.println(s);
    }
    


}
