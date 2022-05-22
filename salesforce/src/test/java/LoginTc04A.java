import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTc04A {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com");

        WebElement pwdReset=driver.findElement(By.xpath("//a[contains(text(),'Forgot Your Password')]"));
        pwdReset.click();
        WebElement username = driver.findElement(By.xpath("//input[@id='un']"));
        username.sendKeys("shivani@tekarch.com");

        WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
        cont.click();

    }
}
