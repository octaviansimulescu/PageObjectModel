package tests;

import PageObjects.LoginPage;
import PageObjects.MenuPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class LoginTest extends BaseTest {



    @Test(description = "positveScenario")
    public void validLoginTest(){
        MenuPage menu = new MenuPage(driver);
        menu.navigateTo(menu.loginLink);
        LoginPage login = new LoginPage(driver);
        login.loginInApp("TestUser","12345@67890");

        Assert.assertTrue(login.loginMsgIsDisplayed(login.loginSuccessMsg));
    }

    @Test(description = "negativeScenario")
    public void invalidUsernameLogTest(){
        MenuPage menu = new MenuPage(driver);
        menu.navigateTo(menu.loginLink);
        LoginPage login = new LoginPage(driver);
        login.loginInApp("TestLooser","12345@67890");

        Assert.assertTrue(login.loginMsgIsDisplayed(login.loginErrorMsg));
        login.closePopUp();
    }

    @Test(description = "negativeScenario")
    public void invalidPasswordLogTest() {
        MenuPage menu = new MenuPage(driver);
        menu.navigateTo(menu.loginLink);
        LoginPage login = new LoginPage(driver);
        login.loginInApp("TestUser", "parolagresita");

        Assert.assertTrue(login.loginMsgIsDisplayed(login.loginErrorMsg));
        login.closePopUp();
    }
}
