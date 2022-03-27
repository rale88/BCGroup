import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ShopingTest extends BaseTest {

    /**
     * Add an item from AfterSuccessLoginPage
     *
     * Steps:
     * 1. Login as valid user
     * 2. From AfterSuccessLoginPage click on 'Add to cart' button for one item
     *
     * Expected results
     * 2. Verify that shopping cart icon has number 1 on it
     */

     @Test
    public void addOneItemToPayment (){
         ChromeDriver driver = openChromeDriver();

         try {
             print("Login as valid user");
             PageAfterSuccessLogin pageAfterSuccessLogin = loginAsValidUser(driver);

             print("Choose telefoni button");
             pageAfterSuccessLogin.telefoniButton.click();

             print("Choose mobilni telefoni");
             Telefoni telefoni = new Telefoni(driver);
             telefoni.mobilniTelefoni.click();

             print("Choose SAMSUNG Galaxy A12 4GB/128GB");
             MobilniTelefoni mobilniTelefoni = new MobilniTelefoni(driver);
             mobilniTelefoni.galaxyA12.click();

             print("Choose dodaj u korpu button");
             SamsungGalaxyA12 samsungGalaxyA12 = new SamsungGalaxyA12(driver);
             samsungGalaxyA12.dodajUKorpuButton.click();

             print("Verify that shopping page contains Nasavi kupovinu text");
             Korpa korpa = new Korpa(driver);
             WebDriverWait wait = new WebDriverWait(driver,3);
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cartForm\"]/div[1]/div[1]/a")));
             korpa.nastaviKupovinuButton.getText();
             assert korpa.nastaviKupovinuButton.getText().equals("Nastavi kupovinu") : "Wrong text. Actual:" + korpa.nastaviKupovinuButton.getText();

         }
         finally {
             driver.quit();


         }
     }

}
