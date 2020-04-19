package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.WishListPage;

public class VerifyProductsCatalogOptions extends MainPage {


    @Parameters({"Закладки"})
    @Test
    public void testChooseProductFromCatalog() {

        WishListPage wishListPage = new MainPage()
                .openHomePage()
                .chooseProductCategory()
                .filloutInputFormaxPrice()
                .clickOnTheProductTypeDropDown()
                .chooseProductFromProductTypeDropDown()
                .filloutInputDPIAndCPIResolutionValue()
                .chooseProductSubCategoryFromResultList()
                .addProductToWishListFromResultList()
                .closePopUpWindow()
                .openProductInTheWishListPage("Закладки");
        Assert.assertEquals(wishListPage.isProductIsAddedToTheWishListPage().getText(),"КУПИТЬ");
    }
}
