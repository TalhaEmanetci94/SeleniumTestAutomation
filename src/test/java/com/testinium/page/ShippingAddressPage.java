package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class ShippingAddressPage {
    Methods methods;

    public ShippingAddressPage() {
        methods = new Methods();
    }

    public void addressInfo() {

        methods.click(By.xpath("//h4[text()='Sepetim']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//a[@id='js-cart']"));
        methods.waitBySeconds(1);
        methods.findElement(By.xpath("//input[@name='quantity']")).clear();
        methods.waitBySeconds(1);
        methods.sendKey(By.xpath("//input[@name='quantity']"),"4");
        methods.waitBySeconds(1);
        methods.clickWithJavaScript(By.xpath("//i[@title='Güncelle']"));
        methods.waitBySeconds(5);
        methods.click(By.cssSelector("div[class='right']>a[class='button red']")); //satın alma
        //methods.waitBySeconds(3);
        //methods.click(By.xpath("//a[text()='Satın Al']"));
        methods.waitBySeconds(1);

        /*methods.sendKey(By.id("address-firstname-companyname"),"Talha");
        methods.waitBySeconds(1);
        methods.sendKey(By.id("address-lastname-title"),"Emanetci");
        methods.waitBySeconds(1);
        methods.selectByText(By.cssSelector("#address-zone-id"),"İstanbul" );
        methods.waitBySeconds(1);
        methods.selectByText(By.cssSelector("#address-county-id"),"SARIYER" );
        methods.waitBySeconds(1);
        methods.sendKey(By.id("address-address-text"),"Testinium");
        methods.waitBySeconds(1);
        methods.sendKey(By.id("address-telephone"),"1111111111");
        methods.waitBySeconds(1); */
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(1);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(1);


        methods.sendKey(By.id("credit-card-owner"), "Talha Emanetci");
        methods.sendKey(By.id("credit_card_number_1"), "1111");
        methods.sendKey(By.id("credit_card_number_2"), "1111");
        methods.sendKey(By.id("credit_card_number_3"), "1111");
        methods.sendKey(By.id("credit_card_number_4"), "1111");
        methods.waitBySeconds(1);
        methods.sendKey(By.id("credit-card-expire-date-month"), "01");
        methods.waitBySeconds(1);
        methods.sendKey(By.id("credit-card-expire-date-year"), "2027");
        methods.waitBySeconds(1);
        methods.sendKey(By.id("credit-card-security-code"), "112");
        methods.waitBySeconds(1);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(1);

        String errorText = methods.getText(By.cssSelector("#form-credit-card > div.credit-card-form-content > table > tbody > tr:nth-child(5) > td > span"));
        if (errorText != null) {
            System.out.println(errorText);
            methods.click(By.cssSelector("#logo > a > img"));//Homepage
            //Logout
            methods.scrollWithJavaScript(By.cssSelector("#header-top > div > div.welcome.fl > div.menu.top.login > ul > li > a"));
            methods.clickWithJavaScript(By.cssSelector("#header-top > div > div.welcome.fl > div.menu.top.login > ul > li > div > ul > li:nth-child(4) > a"));
        } else if (errorText == null) {
            System.out.println("Satın alma işlemi gerçekleşiyor.");
        }
        methods.click(By.cssSelector("#header-top>.container_12>.welcome.fl>.menu.top.login"));
        methods.scrollWithAction(By.cssSelector("#header-top > div > div.welcome.fl > div.menu.top.login > ul > li > a"));
        methods.clickWithJavaScript(By.cssSelector("#header-top > div > div.welcome.fl > div.menu.top.login > ul > li > div > ul > li:nth-child(4) > a"));

    }
}
