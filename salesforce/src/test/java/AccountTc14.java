import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AccountTc14 extends BaseTest{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        UserLogin(driver);

        WebElement accounts = driver.findElement(By.linkText("Accounts"));
        accounts.click();
        Thread.sleep(3000);
        WebElement closePopup = driver.findElement(By.xpath("//a[text()='Close']"));
        closePopup.click();
        WebElement activity = driver.findElement((By.linkText("Accounts with last activity > 30 days")));
        activity.click();

//        Thread.sleep(5000);
//        WebElement noThanks = driver.findElement(By.xpath("//*[text()='No Thanks']"));
//        noThanks.click();

        Thread.sleep(5000);

        WebElement lastActivity = driver.findElement(By.xpath("//input[@name='dateColumn']"));
        lastActivity.click();
        WebElement createDate = driver.findElement(By.xpath("//div[text()='Created Date']"));
        createDate.click();

        WebElement fromDate = driver.findElement(By.xpath("//img[@id='ext-gen152']"));
        fromDate.click();
        WebElement fromToday = driver.findElement(By.xpath("//button[text()='Today']"));
        fromToday.click();

        WebElement toDate = driver.findElement(By.xpath("//img[@id='ext-gen154']"));
        toDate.click();
        WebElement toToday = driver.findElement(By.xpath("//button[text()='Today']"));
        toToday.click();
        Thread.sleep(5000);
        WebElement saveReport = driver.findElement(By.xpath("//button[@id='ext-gen49']"));
        saveReport.click();


    }
}
