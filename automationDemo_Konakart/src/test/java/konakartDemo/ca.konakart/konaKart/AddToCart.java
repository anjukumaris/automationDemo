package konakartDemo.ca.konakart.konaKart;

import konakartDemo.lib.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddToCart extends BaseClass {
    @Test
    public  void productInCart(){
        WebElement btnProductCart=driver.findElement(By.xpath("//a[text()='Vision Clock']"));
        btnProductCart.click();
        ////div[@class='product-buttons']/a[@class='add-to-cart-button-big button small-rounded-corners' ]
        //div[@class='product-buttons']/a[@class='add-to-cart-button-big button small-rounded-corners' and text()='Add to Cart']
        WebElement btnAddCart=driver.findElement(By.xpath("//div[@id='buying-details' and @class='rounded-corners-top']//a[text()='Add to Cart' and @class='add-to-cart-button-big button small-rounded-corners']"));
        btnAddCart.click();

    }
}
