package Techlistic.lib;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass1 {
    protected WebDriver driver=null;
    protected String baseUrl="https://www.techlistic.com/p/selenium-practice-form.html";
    @BeforeTest
    public void beforeAllTest(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void beforeEachMethod(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        sleep(5000);
    }
    @AfterMethod
    public void afterEachMethod(){
        driver.close();
    }
    public void sleep(long msec) {
        try {
            Thread.sleep(msec);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
