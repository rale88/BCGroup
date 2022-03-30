import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    ChromeDriver driver = null;

    //Webelementi


    @FindBy(className = "glyphicon glyphicon-user")
    WebElement vipLoginButton;

    @FindBy(id = "email")
    WebElement userField;

    @FindBy(id = "password")
    WebElement passField;

    @FindBy(id = "loginuser")
    WebElement loginButton;

    //konstruktor
    public LoginPage(ChromeDriver driver){
        driver.get(Strings.LOGIN_URL);
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    //metoda za upis username-a
    public LoginPage enterTextIntoUsernameField(String user){
        userField.sendKeys(user);
        return this;
    }
    //metoda za upis pass
    public LoginPage enterTextIntoPasswordField (String pass){
        passField.sendKeys(pass);
        return this;
    }

    //metoda koja klikce na "Uloguj se" dugme
    public AfterSuccessLoginPage clickLoginButton(){
        loginButton.click();
        AfterSuccessLoginPage afterSuccessLoginPage = new AfterSuccessLoginPage(driver);
        return afterSuccessLoginPage;
    }



}
