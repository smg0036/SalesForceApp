import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountTc11 extends BaseTest{
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        UserLogin(driver);

        WebElement accounts = driver.findElement(By.linkText("Accounts"));
        accounts.click();
        Thread.sleep(3000);
        WebElement closePopup = driver.findElement(By.xpath("//a[text()='Close']"));
        closePopup.click();
        WebElement newView = driver.findElement(By.linkText("Create New View"));
        newView.click();
        WebElement viewName = driver.findElement(By.xpath("//input[@id='fname']"));
        viewName.sendKeys("My_Screen");
        WebElement uniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
        uniqueName.clear();
        uniqueName.sendKeys("Soumya");
        WebElement viewSave= driver.findElement(By.xpath("//td[@class='pbButtonb']/following::input[@value=' Save ']"));
        viewSave.click();
    }
}
