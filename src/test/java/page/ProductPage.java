package page;

import com.kitapyurdu.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.kitapyurdu.BaseTest.driver;

public class ProductPage {


    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);


    public ProductPage(){
        methods = new Methods();
    }

    public void scrollAndSelect(){
        methods.waitBySeconds(5); //yazılmadığında giriş yapmadan ürün aramaya geçiyor
        Assert.assertEquals("Hesabım",driver.getTitle());
        methods.sendKeys(By.id("search-input"),"Oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.scrollWithAction(By.cssSelector(".product-list>:nth-child(7)>:nth-child(2)>:nth-child(3)>a[class='add-to-favorites']"));
        methods.click(By.cssSelector("#product-table>:nth-child(4)>:nth-child(2)>div[class=hover-menu]>a[class='add-to-favorites']"));
        methods.click(By.cssSelector("#product-table>:nth-child(5)>:nth-child(2)>div[class=hover-menu]>a[class='add-to-favorites']"));
        methods.click(By.cssSelector("#product-table>:nth-child(6)>:nth-child(2)>div[class=hover-menu]>a[class='add-to-favorites']"));
        String id=methods.getId(By.cssSelector("#product-table>:nth-child(6)>:nth-child(2)"));
        methods.click(By.cssSelector("#product-table>:nth-child(7)>:nth-child(2)>div[class=hover-menu]>a[class='add-to-favorites']"));
        methods.scrollWithAction(By.cssSelector(".heading"));
        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.click(By.cssSelector(".menu.top.my-list>ul>li>div>ul>li>a"));
        methods.turnBack();
        methods.click(By.cssSelector(".lvl1feature>.lvl1catalog>a"));
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.selectByText(By.cssSelector(".product-filter-header>div[class=sort]>select"),"Yüksek Oylama");
        methods.click(By.cssSelector(".lvl2.js-bookCr>.js-ajaxCt.js-bookCt>:nth-child(3)"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".open-menu-ct.bookAllCategories>div>ul:nth-child(3)>li:nth-child(14)>a"));
        methods.click(By.xpath("//a[@title='Türkiye Gastronomi Atlası']"));
        methods.scrollWithAction(By.cssSelector(".sprite__product.icon__price-alert-list.icon--dimension-addlist.icon--opacitiy-4"));
        methods.click(By.cssSelector(".add-to-cart.btn-orange.btn-ripple>span"));
        methods.scrollWithAction(By.cssSelector(".heading"));
        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.click(By.cssSelector(".menu.top.my-list>ul>li>div>ul>li>a"));
        methods.scrollWithAction(By.xpath("//a[@href ='https://www.kitapyurdu.com/index.php?route=account/notification_publisher']"));
        methods.click(By.cssSelector("#product-561234>.grid_2.alpha.omega.relative>.hover-menu>a>.fa.fa-heart-o"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"cart\"]/div[1]"));
        methods.waitBySeconds(2);
        methods.click(By.id("js-cart"));

        methods.clearValue(By.cssSelector(".js-cart-update-product>:first-child"));
        methods.sendKeys(By.cssSelector(".js-cart-update-product>:first-child"),"2");

        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".buttons>div"));
        methods.waitBySeconds(3);




    }






}
