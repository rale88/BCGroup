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

    public void assertUrl(String actualUrl, String expectedUrl){
        print("assertUrl (" + actualUrl + " , " + expectedUrl + " )");
        assert actualUrl.equals(expectedUrl):"Wrong URL. Expected: " + expectedUrl + " . Actual: " + actualUrl;
    }

    public PageAfterSuccessLogin loginAsValidUser(ChromeDriver driver){
        print("Login as valid user");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterTextIntoUsernameField(Strings.STANDARD_USER);
        loginPage.enterTextIntoPasswordField(Strings.VALID_PASSWORD);
        PageAfterSuccessLogin afterSuccessLoginPage = loginPage.clickLoginButton();
        return afterSuccessLoginPage;

    }




    public static void print (String s){
        System.out.println(s);
    }




}
