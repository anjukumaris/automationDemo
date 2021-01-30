package Techlistic.ca.techlistic;

import Techlistic.lib.BaseClass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SearchContinent extends BaseClass1 {

    public void search(String continent){
        WebElement seContinent=driver.findElement(By.xpath("//select[@id='continents' and @class='input-xlarge' or @name='continents']"));
        Select frstContinent=new Select(seContinent);
        frstContinent.selectByVisibleText(continent);
        sleep(5000);
    }
    @Test
    public void searchCont(){
        String continent="Europe";
        search(continent);
    }
}
