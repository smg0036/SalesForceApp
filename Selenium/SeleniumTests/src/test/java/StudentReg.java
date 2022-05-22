import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class StudentReg {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
       // System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://qa-tekarch.firebaseapp.com");
        Thread.sleep(5000);
        By locator =By.id("email_field");

        WebElement email = driver.findElement(locator);
        email.sendKeys("admin123@gmail.com");

       driver.findElement(By.id("password_field")).sendKeys("admin123");
       driver.findElement(By.xpath("//button[@onclick='login()']")).click();

        Thread.sleep(5000);

       driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Soumya");



        List<WebElement> rb=driver.findElements(By.id("radiobut"));

        if(rb.get(0).isSelected()){
            System.out.println("Already selected.Select another option");
        }else{
            rb.get(0).click();
        }

        WebElement sel = driver.findElement(By.xpath("//select[@id='city']"));
        Select select = new Select(sel);
        select.selectByValue("mumbai");

        //Mouse Hover 1

        WebElement element1  = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/button[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(element1).build().perform();

        Thread.sleep(5000);

//
//       WebDriverWait wait = new WebDriverWait(driver, 10);
//       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text(),'Windows']")));

        WebElement ele1  = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/a[2]"));

       action.moveToElement(ele1).click().build().perform();
       Thread.sleep(5000);


        //Mouse hover 2


        WebElement element2  = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/button[1]"));
        action.moveToElement(element2).build().perform();

        Thread.sleep(5000);

//
//       WebDriverWait wait = new WebDriverWait(driver, 10);
//       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text(),'Windows']")));

        WebElement ele2  = driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/a[1]"));

        action.moveToElement(ele2).click().build().perform();

        Thread.sleep(5000);

        //Drag and drop

        WebElement from = driver.findElement(By.xpath(""));
        WebElement to = driver.findElement(By.xpath(""));

        action.clickAndHold(from).moveToElement(to).release(to).build().perform();
       driver.close();


    }
}
