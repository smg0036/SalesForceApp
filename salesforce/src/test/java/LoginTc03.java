import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LoginTc03 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com");
       // JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("shivani@tekarch.com");
        WebElement pwd = driver.findElement(By.id("password"));
        pwd.sendKeys("sN@nn@0923");

        WebElement check = driver.findElement(By.name("rememberUn"));
        check.click();

        Thread.sleep(5000);

        WebElement login =  driver.findElement(By.id("Login"));
        login.click();

        Thread.sleep(5000);
        WebElement userMenu  = driver.findElement(By.xpath("//span[@class='menuButtonLabel']"));
        userMenu.click();

        //WebElement logout = driver.findElement(By.xpath("//div[@class='mbrMenuItems]/a[text()='Logout']"));

        WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));


       // WebElement logout  = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/a[5]"));


     Thread.sleep(5000);

     logout.click();
     Thread.sleep(5000);
     String s =  username.getText();
     if(s.equals("shivani@tekarch.com")){
         System.out.println("The username is displayed");
     }
//
    //       // js.executeScript("arguments[0].scrollIntoView();", logOut).;
////        Thread.sleep(5000);
////
//        Actions action = new Actions(driver);
//
//       action.click(userMenu).build().perform();
//
//       action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();


    }
}
