package konakartDemo.ca.konakart.konaKart;

import konakartDemo.lib.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchProduct extends BaseClass {

    @Test
    public void searchProduct(){
        WebElement txtSearch=  driver.findElement(By.xpath("//input[@type=text or  @id='search-input']"));
        txtSearch.sendKeys("clock");
        WebElement btnSearch=driver.findElement(By.xpath("//a[@id='search-button' and @class='rounded-corners-right' ]"));
        btnSearch.click();
        WebElement lnkProduct=driver.findElement(By.xpath("//a[text()='Vision Clock']"));
        String expProductName="Vision Clock";
        String actProductName=lnkProduct.getText();
        System.out.println("Actual Product Name::"+actProductName);
        System.out.println("Expected Product Name:::"+expProductName);
        Assert.assertEquals(actProductName,expProductName,"Product Not Match");
    }
    public void search(String category,String product){
        WebElement weCategory=driver.findElement(By.xpath("//select[@id='top-cat-list']"));
        Select FirstCategory=new Select(weCategory);
        FirstCategory.selectByVisibleText(category);
        WebElement txtSearch=driver.findElement(By.xpath("//input[@type='text' and @id='search-input']"));
        txtSearch.sendKeys(product);
        WebElement btnSearch=driver.findElement(By.xpath("//a[@id='search-button' and @class='rounded-corners-right']"));
        btnSearch.click();
        sleep(5000);

    }
    public void validateSearchResult(List<String> expItems){
        List<String> actItems=new ArrayList<String>();
        List<WebElement> weItems=driver.findElements(By.xpath("//div[@class='item']/a[@class='item-title']"));
        System.out.println("ItemCount:::"+weItems.size());
        for(WebElement we:weItems){
            actItems.add(we.getText());
        }
        System.out.println("Expected Items:::"+expItems);
        System.out.println("Actual Items:::"+actItems);
        Assert.assertEquals(actItems,expItems,"Items Not Match");
    }
    @Test
    public void searchForProductTest(){
        String category="Home & Garden";
        String product="clock";
        List<String> expItems= Arrays.asList("Cadiz Clock","60s Pluto Starburst Clock", "Acctim Metal Clock",
                "Vision Clock", "Milan 93 Clock", "Ministry Clock", "Weather Station Clock",
                "Westclox 32042r Retro 1950 Kitchen Wall Clock 9.5-inch Red");
        search(category,product);
        validateSearchResult(expItems);
    }
}
