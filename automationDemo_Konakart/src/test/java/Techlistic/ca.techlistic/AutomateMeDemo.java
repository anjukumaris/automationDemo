package Techlistic.ca.techlistic;

import Techlistic.lib.BaseClass1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AutomateMeDemo extends BaseClass1 {
    @Test
    public void automateme() {
        //Scrolling down //
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)", "");
        WebElement txtFirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        txtFirstName.sendKeys("ADHITHY");
        WebElement txtLastName=driver.findElement(By.xpath("//input[@name='lastname']"));
        txtLastName.sendKeys("MINE");
//        WebElement rdbtnMale=driver.findElement(By.xpath("//div[@class='control-group']/following::input[@id='sex-0']"));
//        rdbtnMale.click();
        WebElement rdbtnFemale=driver.findElement(By.xpath("//div[@class='control-group']/following::input[@id='sex-1']"));
        rdbtnFemale.click();
        WebElement rdbtnExperience1=driver.findElement(By.xpath("//label[@class='radio inline']/preceding::input[@id='exp-0']"));
        rdbtnExperience1.click();
//        WebElement rdbtnExperience2=driver.findElement(By.xpath("//label[@class='radio inline']/preceding::input[@id='exp-1']"));
//        rdbtnExperience2.click();
//        WebElement rdbtnExperience3=driver.findElement(By.xpath("//label[@class='radio inline']/preceding::input[@id='exp-2']"));
//        rdbtnExperience3.click();
//        WebElement rdbtnExperience4=driver.findElement(By.xpath("//label[@class='radio inline']/preceding::input[@id='exp-3']"));
//        rdbtnExperience4.click();
//        WebElement rdbtnExperience5=driver.findElement(By.xpath("//label[@class='radio inline']/preceding::input[@id='exp-4']"));
//        rdbtnExperience5.click();
//        WebElement rdbtnExperience6=driver.findElement(By.xpath("//label[@class='radio inline']/preceding::input[@id='exp-5']"));
//        rdbtnExperience6.click();
//        WebElement rdbtnExperience7=driver.findElement(By.xpath("//label[@class='radio inline']/preceding::input[@id='exp-6']"));
//        rdbtnExperience7.click();
        WebElement txtDate=driver.findElement(By.xpath("//input[@id='datepicker']"));
        txtDate.sendKeys("2016-03-25");
        WebElement chkboxProfession=driver.findElement(By.xpath("//div[@class='control-group']//preceding::input[@id='profession-0']"));
        chkboxProfession.click();
        WebElement chkboxProfession1=driver.findElement(By.xpath("//div[@class='control-group']//preceding::input[@id='profession-1']"));
        chkboxProfession1.click();
        sleep(5000);
        WebElement chkBoxAutomation=driver.findElement(By.xpath("//parent::div[@class='control-group']//input[@id='tool-0']"));
        chkBoxAutomation.click();
        WebElement chkBoxAutomation1=driver.findElement(By.xpath("//parent::div[@class='control-group']//input[@id='tool-1']"));
        chkBoxAutomation1.click();
        WebElement chkBoxAutomation2=driver.findElement(By.xpath("//parent::div[@class='control-group']//input[@id='tool-2']"));
        chkBoxAutomation2.click();
        sleep(5000);

    }
}