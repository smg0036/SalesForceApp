import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

     protected static void UserLogin(WebDriver driver){
           driver.get("https://login.salesforce.com");
           driver.manage().window().maximize();
           WebElement username = driver.findElement(By.id("username"));
           username.sendKeys("shivani@tekarch.com");
           WebElement pwd = driver.findElement(By.id("password"));
           pwd.sendKeys("sN@nn@0923");

           WebElement login =  driver.findElement(By.id("Login"));
           login.click();
       }
}
