package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.BaseTest;

public class XPathExample extends BaseTest {

    @Test(priority = 1)
    public void xpathExample(){
        //<li class="menu_user_login">
        //--> li[class='menu_user_login']  --> CSS
        //--> //li[@class = 'menu_user_login'] --> xPath

        driver.findElement(By.xpath("//li[@class = 'menu_user_login']")).click();
        //OR
        //input[@id='log' or @name='log']
        driver.findElement(By.xpath("//input[@id='log' or @name='log']")).sendKeys("TestUser");
        //AND
        driver.findElement(By.xpath("//input[@id='password' and @name='pwd']")).sendKeys("12345@67890");

        driver.findElement(By.xpath("//input[@value='Login']")).click();

    }

    @Test(priority = 2)
    public void xpathExample2(){
        driver.findElement(By.xpath("//span[@class='user_name']")).click();

        //<a href="https://keybooks.ro/wp-admin/profile.php" class="icon icon-cog">Settings</a>
        // text() --> citeste textul dintre tagurile html. pe elementul de mai sus, citeste Settings
        //a[text() = 'Settings']
        driver.findElement(By.xpath("//a[text() = 'Settings']")).click();
    }
}
