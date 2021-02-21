package Scenario1.pagetest;

import Base.BasePage;
import Scenario1.pageobject.Ecom_login_pageobject;
import org.testng.annotations.Test;

public class Ecom_login_pagetest extends BasePage {
    Ecom_login_pageobject ecom_login_pageobject;

    @Test
    public void dashboardLogin() throws InterruptedException {
        ecom_login_pageobject =new Ecom_login_pageobject(this);
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        ecom_login_pageobject.flipkart_login(driver);
    }
}
