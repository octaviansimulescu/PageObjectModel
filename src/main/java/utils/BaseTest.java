package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {


    public WebDriver driver;

    @BeforeClass
    public void setup(){

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//caz global
        driver.manage().window().maximize();//maximizeaza fereastra browserului
        driver.get("https://keybooks.ro/");

    }

    @AfterClass
    public void teardown() throws InterruptedException{

        Thread.sleep(4000); //doar pt test, in produsul final trebuie scos
        driver.quit();//inchide browserul cu toate taburile
        //driver.close();//inchide tabul curent
    }
}
