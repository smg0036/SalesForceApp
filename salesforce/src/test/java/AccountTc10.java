import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountTc10 extends BaseTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        UserLogin(driver);

        WebElement accounts = driver.findElement(By.linkText("Accounts"));
        accounts.click();
        Thread.sleep(3000);
        WebElement closePopup = driver.findElement(By.xpath("//a[text()='Close']"));
        closePopup.click();

        WebElement newAcct = driver.findElement(By.xpath("//input[@name='new']"));
        newAcct.click();
        WebElement accName = driver.findElement(By.xpath("//input[@id='acc2']"));
        accName.sendKeys("SoumyaB");
        WebElement saveAcct=driver.findElement(By.xpath("//td[@class='pbButton']/following::input[@value=' Save ']"));
        saveAcct.click();

    }
}
