package test;

import com.kitapyurdu.BaseTest;
import org.junit.Test;
import page.BuyProduct;
import page.LoginPage;
import page.ProductPage;

public class BuyProductTest extends BaseTest {

    @Test
    public void buyProductTest(){
        BuyProduct buyProduct=new BuyProduct();
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        ProductPage productPage=new ProductPage();
        productPage.scrollAndSelect();
        buyProduct.buyAndQuit();
    }

}
