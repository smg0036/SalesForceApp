import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class UserMenuTc9  extends BaseTest {
    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        UserLogin(driver);

        // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement userMenu  = driver.findElement(By.xpath("//span[@class='menuButtonLabel']"));
        userMenu.click();

        WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
        logout.click();

    }
}
