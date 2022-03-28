package test;

import com.kitapyurdu.BaseTest;
import org.junit.Test;
import page.LoginPage;
import page.ProductPage;

public class ProductTest extends BaseTest {
    @Test
    public void productTest(){
        ProductPage productPage = new ProductPage();
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        productPage.scrollAndSelect();
    }

}
