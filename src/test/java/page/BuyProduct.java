package page;


import com.kitapyurdu.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class BuyProduct {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public BuyProduct(){
        methods = new Methods();
    }
    public void buyAndQuit(){

        methods.click(By.cssSelector("#shipping-tabs>:nth-child(2)"));
        methods.waitBySeconds(1);





        methods.scrollWithAction(By.cssSelector("#address-tax-id"));

        methods.sendKeys(By.id("address-firstname-companyname"),"Mustafa");
        methods.sendKeys(By.id("address-lastname-title"),"Yildiz");
        methods.selectByText(By.id("address-zone-id"),"Erzurum");
        methods.waitBySeconds(1);
        methods.selectByText(By.cssSelector("#address-county-id"),"AŞKALE");
        methods.sendKeys(By.id("district"),"BAHÇELİEVLER MAH");
        methods.sendKeys(By.id("address-address-text"),"Erzurum Caddesi no 1/B ");
        methods.sendKeys(By.id("address-postcode"),"25500");

        methods.sendKeys(By.id("address-telephone"),"4424151019");

        methods.sendKeys(By.id("address-mobile-telephone"),"5344938969");

        methods.sendKeys(By.id("address-tax-id"),"32632466664");
        System.out.println("TC YAZILDI");
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);
        System.out.println("Devama tıklandı kargoya geçildi.");
        methods.waitBySeconds(2);
        Assert.assertTrue(methods.odemeCheck(By.id("free-shipping-products")));
        methods.click(By.id("button-checkout-continue"));
        System.out.println("Kargoda devama tıklandı");
        methods.waitBySeconds(2);

        methods.sendKeys(By.id("credit-card-owner"),"Mustafa Yıldız");
        methods.sendKeys(By.id("credit_card_number_1"),"5176");
        methods.sendKeys(By.id("credit_card_number_2"),"8100");
        methods.sendKeys(By.id("credit_card_number_3"),"6103");
        methods.sendKeys(By.id("credit_card_number_4"),"9107");
        methods.selectByText(By.id("credit-card-expire-date-month"),"05");
        methods.selectByText(By.id("credit-card-expire-date-year"),"2027");
        methods.sendKeys(By.id("credit-card-security-code"),"918");



        methods.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        methods.waitBySeconds(1);










        methods.waitBySeconds(5);

    }
}
