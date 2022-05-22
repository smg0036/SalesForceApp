import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountTc12 extends BaseTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        UserLogin(driver);

        WebElement accounts = driver.findElement(By.linkText("Accounts"));
        accounts.click();
        Thread.sleep(3000);
        WebElement closePopup = driver.findElement(By.xpath("//a[text()='Close']"));
        closePopup.click();
        WebElement edit = driver.findElement(By.linkText("Edit"));
        edit.click();
        WebElement viewName = driver.findElement(By.xpath("//input[@id='fname']"));
        viewName.sendKeys("Soumya_Screen");
        WebElement rb=driver.findElement(By.xpath("//input[@class=' radio']/following::label[text()='My Accounts']"));
        rb.click();

//        if(rb.get(1).isSelected()){
//            System.out.println("Already selected.Select another ption");
//        }else{
//            rb.get(1).click();
//        }
        WebElement sel = driver.findElement(By.xpath("//select[@id='fcol1']"));
        Select select = new Select(sel);
        select.selectByValue("ACCOUNT.NAME");
        WebElement opr = driver.findElement(By.xpath("//select[@class ='operator' and @id='fop1']"));
        Select selectOp= new Select(opr);
        selectOp.selectByVisibleText("contains");
        WebElement value = driver.findElement(By.xpath("//input[@id='fval1']"));
        value.sendKeys("Soumya");
        WebElement filter = driver.findElement(By.xpath("//select[@id='colselector_select_0']"));
        Select selectActivity= new Select(filter);
        selectActivity.selectByValue("ACCOUNT.LAST_ACTIVITY");
        WebElement add = driver.findElement(By.xpath("//a[@id='colselector_select_0_right']/img"));
        add.click();
        WebElement saveAct = driver.findElement(By.xpath("//td[@class='pbButtonb']/following::input[@value=' Save ']"));
        saveAct.click();


    }
}
