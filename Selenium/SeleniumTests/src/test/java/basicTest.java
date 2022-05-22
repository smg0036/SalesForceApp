import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicTest {
    public static void main(String[] args) {
        String expectedTitle ="Google";
//         System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String actual = driver.getTitle();
        if(actual.equals(expectedTitle)){
            System.out.println("test script passed");
        }else {
            System.out.println("test script failed");
        }
        driver.close();
    }
}