import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTc4B {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("123");
        Thread.sleep(5000);
        WebElement pwd = driver.findElement(By.id("password"));
        pwd.sendKeys("22131");
        WebElement login = driver.findElement(By.id("Login"));
        login.click();
    }
}
