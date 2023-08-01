package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Locatori
    public By userNameField = By.id("log");
    public By passwordField = By.id("password");
    public By submitButton = By.cssSelector("input[class='submit_button']");
    public By loginSuccessMsg = By.cssSelector("div[class*='sc_infobox_style_success']");
    public By loginErrorMsg = By.cssSelector("div[class*='sc_infobox_style_error']");

    public By closeLoginPopup = By.cssSelector("a[class='popup_close']");
    //metode
    public void loginInApp(String user, String pass){
        driver.findElement(userNameField).clear();
        driver.findElement(userNameField).sendKeys(user);
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(pass);
        driver.findElement(submitButton).click();
    }

    public void closePopUp(){
        driver.findElement(closeLoginPopup).click();
    }
    public boolean loginMsgIsDisplayed(By locator){
        return driver.findElement(locator).isDisplayed();
    }
}
