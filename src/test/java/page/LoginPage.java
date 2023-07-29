package page;

import com.kitapyurdu.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.kitapyurdu.BaseTest.driver;

public class LoginPage {

    Methods methods;
    public LoginPage(){
        methods = new Methods();
    }

    public void login() {
        methods.click(By.xpath("//div[@class='menu-top-button login']"));

        methods.sendKeys(By.id("login-email"),"kullanici adi (kullanıcı mail degeri girilir)");
        methods.sendKeys(By.id("login-password"),"Password (kullanıcı password degeri girilir)");

        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(15);



    }
}
