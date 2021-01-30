package konakartDemo.ca.konakart.konaKart;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import static java.lang.Thread.sleep;

public class OrganizedTest {
    private WebDriver driver=null;
    private String baseUrl="https://www.konakart.com/konakart/";
    @BeforeTest
    public void beforeAllTest(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void beforeEachMethod(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @AfterMethod
    public  void afterEachMethod(){
        //driver.close();
    }
    @Test
    public void checkHomePageTitle(){
        String actTitle=driver.getTitle();
        String expTitle="KonaKart";
        Assert.assertEquals(actTitle,expTitle,"Title Not Match");
    }
}
