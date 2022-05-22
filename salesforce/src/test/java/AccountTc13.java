import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AccountTc13 extends BaseTest{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        UserLogin(driver);

        WebElement accounts = driver.findElement(By.linkText("Accounts"));
        accounts.click();
        Thread.sleep(3000);
        WebElement closePopup = driver.findElement(By.xpath("//a[text()='Close']"));
        closePopup.click();
        WebElement merge = driver.findElement(By.linkText("Merge Accounts"));
        merge.click();
        WebElement accName = driver.findElement(By.xpath("//input[@id='srch']"));
        accName.sendKeys("SoumyaB");
        WebElement findAcct = driver.findElement(By.xpath("//input[@value='Find Accounts']"));
        findAcct.click();
        Thread.sleep(5000);

        WebElement next = driver.findElement(By.xpath("//div[@class='pbTopButtons']//input[@value=' Next ']"));
        next.click();
        WebElement mergeAcct = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[2]"));
        mergeAcct.click();

        String MainWindow=driver.getWindowHandle();
        // To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();

        if(i1.hasNext()) {
            String ChildWindow = i1.next();
            driver.switchTo().window(ChildWindow);
            WebElement ok = driver.findElement(By.linkText("OK"));
            ok.click();

        }
        Thread.sleep(5000);

    }

}
