package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Test {
/*

    By LOGINLINK=By.xpath("//a[@href='/login']");
    By USERNAME=By.xpath("//div[@class='signup-form']//input[@name='name']");
    By SIGNUPEmail=By.xpath("//input[@data-qa='signup-email']");
 */
    @org.testng.annotations.Test
    public void testcase() throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
        WebDriverManager.safaridriver().setup();
        WebDriver driver=new SafariDriver();
       // WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
       System.out.println("pass");
        // driver.findElement(By.xpath("//a[@href='/login']"));
//        Thread.sleep(4);
////        JavascriptExecutor js=(JavascriptExecutor)driver;
////        js.executeScript("document.getElementByName")
//        Actions action=new Actions(driver);
//        action.moveToElement(driver.findElement(By.xpath("//div[@class='signup-form']//input[@name='name']")))
//                        .sendKeys("cds");
////        driver.findElement(By.xpath("//div[@class='signup-form']//input[@name='name']")).sendKeys("abc");
       Thread.sleep(4);
        driver.quit();

    }}
