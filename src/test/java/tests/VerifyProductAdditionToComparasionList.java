package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.ComparasionListPage;
import pages.MainPage;

public class VerifyProductAdditionToComparasionList extends MainPage {

    @Parameters({"Сравнение товаров"})
    @Test
    public void testProductAdditionToTheList() {

        ComparasionListPage comparasionListPage = new MainPage()
                .openHomePage()
                .addItemToComparasionList()
                .closePopUpWindow()
                .openComparasionListPage("Сравнение товаров");
        Assert.assertEquals(comparasionListPage.isElementAddedInComparasionListPage().getText(), "Товары для сравнения");
    }
}

