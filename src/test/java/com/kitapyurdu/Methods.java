package com.kitapyurdu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.appender.rolling.action.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;


public class Methods {


    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;

    Logger logger= LogManager.getLogger(Methods.class);

    public Methods() {
        driver = BaseTest.driver;
        wait = new FluentWait<WebDriver>(driver);
        jsdriver = (JavascriptExecutor) driver;
    }


        public WebElement findElement (By by){ //element almak için gerekli olan metod
            return wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }

         public void click(By by){
            findElement(by).click();
         }


    public boolean isElementVisible(By by) { //element görünürlüğü
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public void sendKeys(By by, String text){
        findElement(by).sendKeys(text);
    } //seçilen elemente değer girme

    public void waitBySeconds(long seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void  scrollWithAction(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public String getId(By by) { return findElement(by).getAttribute("id");} // 3. ürünü silerken kullanılacak id alır
    public void turnBack(){
        driver.navigate().back();
    }

// düşükten-yükseğe sıralama için gerekli metod
    public Select getSelect(By by){
        return new Select(findElement(by));
    }

    public void selectByText(By by,String text){
        getSelect(by).selectByVisibleText(text);
    }
    public void clearValue(By by){
        driver.findElement(by).clear();
    }

    public boolean odemeCheck(By by){
        logger.info("");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            logger.info("True");
            System.out.println("True");
            return true;
        }
        catch (Exception e){
            logger.info("False"+ e .getMessage());
            return false;
        }
    }
}
