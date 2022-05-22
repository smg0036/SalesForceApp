import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class UserMenuTc8 extends BaseTest{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        UserLogin(driver);

        // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement userMenu  = driver.findElement(By.xpath("//span[@class='menuButtonLabel']"));
        userMenu.click();

        WebElement devConsole= driver.findElement(By.xpath("//a[text()='Developer Console']"));
        devConsole.click();

        String oldWindow = driver.getWindowHandle();

        Set<String> getAllWindows = driver.getWindowHandles();
        Thread.sleep(5000);
        String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
        Thread.sleep(5000);
        driver.switchTo().window(getWindow[1]);
        driver.manage().window().maximize();
        driver.close();



    }
}
