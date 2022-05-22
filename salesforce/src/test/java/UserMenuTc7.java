import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class UserMenuTc7 extends BaseTest{
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        UserLogin(driver);

       // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement userMenu  = driver.findElement(By.xpath("//span[@class='menuButtonLabel']"));
        userMenu.click();

        WebElement settings  = driver.findElement(By.xpath("//a[text()='My Settings']"));
        settings.click();

        WebElement personal = driver.findElement(By.xpath("//a[@class='header setupFolder']/span[text()='Personal']"));
        personal.click();
        WebElement loginHistory = driver.findElement(By.xpath("//a[@id='LoginHistory_font']/span[text()='Login History']"));
        loginHistory.click();
        WebElement download = driver.findElement(By.xpath("//div[@class='pShowMore']/a"));
        download.click();
        WebElement DispLayout = driver.findElement(By.xpath("//div[@id='DisplayAndLayout']/a/span[2]"));
        DispLayout.click();
        WebElement customizeTabs = driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']/span[text()='Customize My Tabs']"));
        customizeTabs.click();
        WebElement sel1 = driver.findElement(By.xpath("//select[@id='p4']"));
        Select select1 = new Select(sel1);
        select1.selectByVisibleText("Salesforce Chatter");

        WebElement sel2 = driver.findElement(By.xpath("//select[@id='duel_select_0']"));
        Select select2 = new Select(sel2);
        select2.selectByValue("report");

        WebElement add =driver.findElement(By.xpath("//a[@id='duel_select_0_right']/img[@class='rightArrowIcon']"));
        add.click();

        WebElement email = driver.findElement(By.xpath("//a[@class='header setupFolder']/span[text()='Email']"));
        email.click();

        WebElement emailSettings = driver.findElement(By.xpath("//a[@id='EmailSettings_font']/span[text()='My Email Settings']"));
        emailSettings.click();

         WebElement save = driver.findElement(By.xpath("//input[@value=' Save ']"));

         WebElement calendarReminders=driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']"));
         calendarReminders.click();

         WebElement activity = driver.findElement(By.xpath("//span[text()='Activity Reminders']"));
         activity.click();

         WebElement testReminder = driver.findElement(By.xpath("//input[@value='Open a Test Reminder']"));
         testReminder.click();



     }
}
