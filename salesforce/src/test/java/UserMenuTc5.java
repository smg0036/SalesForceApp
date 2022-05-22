import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserMenuTc5 extends BaseTest{
    public static void main(String[] args) throws InterruptedException {
          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();

          UserLogin(driver);
//        driver.get("https://login.salesforce.com");
//        // JavascriptExecutor js = (JavascriptExecutor)driver;
//
//        WebElement username = driver.findElement(By.id("username"));
//        username.sendKeys("shivani@tekarch.com");
//        WebElement pwd = driver.findElement(By.id("password"));
//        pwd.sendKeys("sN@nn@0923");


        WebElement userMenu  = driver.findElement(By.xpath("//span[@class='menuButtonLabel']"));
        userMenu.click();
    }
}
