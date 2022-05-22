import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTc01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com");

       WebElement username =  driver.findElement(By.id("username"));
       username.sendKeys("shivani@tekarch.com");
       Thread.sleep(5000);
       WebElement pwd =  driver.findElement(By.id("password"));
       pwd.clear();
       WebElement login =  driver.findElement(By.id("Login"));
       login.click();

    }
}
