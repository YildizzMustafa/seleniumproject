package test;

import com.kitapyurdu.BaseTest;
import org.junit.Test;
import page.HomePage;

public class HomeTest extends BaseTest {

    @Test
    public void homeTest(){
        HomePage homePage= new HomePage();

        homePage.home();
    }
}
