package tests;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.*;


public class VerifyHeaderButtonsAreClickable extends MainPage {

    @Parameters({"Вход/регистрация"})
    @Test
    public void testLoginWindowIsDisplayed() {
        LoginPage loginPage = new MainPage()
                .openHomePage()
                .openLoginPage("Вход/регистрация");
        Assert.assertTrue(loginPage.isLoginPageHeaderDisplayed());
    }

    @Parameters({"Доставка"})
    @Test
    public void testDeliveryPageIsDisplayed() {

        DeliveryPage deliveryPage = new MainPage()
                .openHomePage()
                .openDeliveryPage("Доставка");
        Assert.assertTrue(deliveryPage.isDeliveryPageHeaderDisplayed());
    }

    @Parameters({"Корзина"})
    @Test
    public void testBasketPageIsDisplayed() {

        BasketPage basketPage = new MainPage()
                .openHomePage()
                .openBasketPage("Корзина");
        Assert.assertTrue(basketPage.isBasketPageHeaderDisplayed());
    }


    @Parameters({"Сравнение товаров"})
    @Test
    public void testComparasionListPageIsDisplayed() {

        ComparasionListPage comparasionListPage = new MainPage()
                .openHomePage()
                .openComparasionListPage("Сравнение товаров");
        Assert.assertTrue(comparasionListPage.isComparasionListPageHeaderDisplayed());
    }


    @Parameters({"Гарантия"})
    @Test
    public void testWarrantyPageIsDisplayed() {

        WarrantyPage warrantyPage = new MainPage()
                .openHomePage()
                .openWarrantyPage("Гарантия");
        Assert.assertTrue(warrantyPage.isWarrantyPageHeaderDisplayed());
    }


    @Parameters({"Оплата"})
    @Test
    public void testPaymentPageIsDisplayed() {
        PaymentPage paymentPage = new MainPage()
                .openHomePage()
                .openPaymentPage("Оплата");
        Assert.assertTrue(paymentPage.isPaymentPageHeaderDisplayed());

    }


    @Parameters({"Закладки"})
    @Test
    public void testWishListPageIsDisplayed() {
        WishListPage wishListPage = new MainPage()
                .openHomePage()
                .openProductInTheWishListPage("Закладки");
        Assert.assertTrue(wishListPage.isWishListPageHeaderDisplayed());

    }

    @Parameters({"Система скидок"})
    @Test
    public void testDiscountSystemPageIsDisplayed() {
        DiscountSystemPage discountSystemPage = new MainPage()
                .openHomePage()
                .openDiscountSystemPage("Система скидок");
        Assert.assertTrue(discountSystemPage.isDiscountSystemPageHeaderDisplayed());

    }

    @Parameters({"Закладки"})
    @Test
    public void testBookmarksPageIsDisplayed() {
       BookmarksPage bookmarksPage = new MainPage()
                .openHomePage()
                .openBookmarksPage("Закладки");
        Assert.assertTrue(bookmarksPage.isBookmarksPageHeaderDisplayed());

    }
}






