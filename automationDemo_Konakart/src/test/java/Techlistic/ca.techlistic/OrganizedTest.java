package Techlistic.ca.techlistic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrganizedTest {
    private WebDriver driver=null;
    private String baseUrl="https://www.techlistic.com/p/selenium-practice-form.html";
    @BeforeTest
    public void beforeAllTest(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void beforeEachMethod(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        try{
            Thread.sleep(5000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @AfterMethod
    public void afterEachMethod(){
        driver.close();
    }
    @Test
    public void checkHomePageTitle(){
        String expTitle="Selenium Practice Form";
        String actTitle=driver.getTitle();
        Assert.assertEquals(actTitle,expTitle,"Title Not Match");
    }
}
