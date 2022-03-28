package test;

import com.kitapyurdu.BaseTest;
import com.kitapyurdu.Methods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import page.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void LoginTest(){
        LoginPage loginPage=new LoginPage();
        loginPage.login();
    }




}
