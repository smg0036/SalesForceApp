import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UserMenuTc6 extends BaseTest{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        UserLogin(driver);

        WebElement userMenu  = driver.findElement(By.xpath("//span[@class='menuButtonLabel']"));
        userMenu.click();

        WebElement profile = driver.findElement(By.xpath("//a[@class='menuButtonMenuLink firstMenuItem']"));
        profile.click();

        Thread.sleep(5000);
        Actions action = new Actions(driver);
        //WebElement edit = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[2]/div[2]/div[1]/h3[1]/div[1]/div[1]/a[1]/img[1]"));
        WebElement edit = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']"));
        action.moveToElement(edit).click().build().perform();

        driver.switchTo().frame("contactInfoContentId");

       Thread.sleep(5000);
        WebElement abt = driver.findElement(By.linkText("About"));
        abt.click();

        Thread.sleep(5000);
        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.click();
        lastName.clear();
        lastName.sendKeys("Muddu");

        WebElement save = driver.findElement(By.xpath("//input[@value='Save All']"));
        save.click();


       WebElement post = driver.findElement(By.xpath(" //a[@id='publisherAttachTextPost']//span[text()='Post']"));
        post.click();

        WebElement frame = driver.findElement(By.xpath("//div[@class='cke_contents cke_reset']//iframe[@class='cke_wysiwyg_frame cke_reset']"));
        driver.switchTo().frame(frame);

        WebElement content = driver.findElement(By.xpath("//html//body[contains(text(),'Share an update')]"));
        content.click();
        Thread.sleep(5000);
        content.sendKeys("Profile Updated");

        driver.switchTo().parentFrame();
        Thread.sleep(5000);
        WebElement share = driver.findElement(By.xpath("//div[@class='publisherBottomBarPlaceholder']//input[@name='publishersharebutton']"));
        share.click();

        Thread.sleep(5000);

        WebElement file = driver.findElement(By.xpath("//a[@id='publisherAttachContentPost']//span[text()='File']"));
        action.moveToElement(file).click().build().perform();
         Thread.sleep(5000);
        WebElement upload = driver.findElement(By.xpath("//a[contains(text(),'Upload a file')]"));
        upload.click();

        Thread.sleep(5000);

        WebElement chooseFile= driver.findElement(By.xpath("//input[@id='chatterFile']"));
        chooseFile.sendKeys("C:/Users/srini/Pictures/Saved Pictures/_downloadfiles_wallpapers_1600_1200_beautiful_waterfall_wallpaper_rivers_nature_1142.jpg");

        WebElement mh = driver.findElement(By.xpath("//div[@id='photoSection']//img[@class='chatter-photo']"));

        action.moveToElement(mh).build().perform();

        WebElement photo  = driver.findElement(By.xpath("//div[@class='photoUploadSection']/a[text()='Add Photo']"));
        photo.click();


        WebElement photoUpload = driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']"));

        driver.switchTo().frame(photoUpload);

        WebElement choosePhoto = driver.findElement(By.xpath("//input[@class='fileInput']"));

        choosePhoto.sendKeys("C:/Users/srini/Pictures/Saved Pictures/_downloadfiles_wallpapers_1600_1200_beautiful_waterfall_wallpaper_rivers_nature_1142.jpg");

        Thread.sleep(5000);

        WebElement savePhoto = driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']"));

        savePhoto.click();

        Thread.sleep(5000);

        WebElement saveAgain = driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']"));

        saveAgain.click();
    }
}
