package konakartDemo.lib;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static java.lang.Thread.sleep;

public class BaseClass {
    protected WebDriver driver=null;
    protected String baseUrl="https://www.konakart.com/konakart/";
    @BeforeTest
    public void beforeAllTest(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void beforeEachMethod(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        sleep(3000);
    }
    @AfterMethod
    public void afterEachMethod(){
        //driver.close();
    }
    public void sleep(long msec) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
