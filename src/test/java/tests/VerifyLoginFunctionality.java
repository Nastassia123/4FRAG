package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.PersonalAreaPage;


public class VerifyLoginFunctionality extends MainPage {


    @Parameters ({"Вход/регистрация"})
    @Test
    public void testLoginOption() {
        PersonalAreaPage loginPage = new MainPage()
                .openHomePage()
                .openLoginPage("Вход/регистрация")
                .fillOutEmailField()
                .fillOutPasswordField();
        Assert.assertEquals(loginPage.isPersonalPageHeaderDisplayed().getText(),"Подписка");
    }
    }

