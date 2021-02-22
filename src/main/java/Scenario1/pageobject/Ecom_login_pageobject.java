package Scenario1.pageobject;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ecom_login_pageobject{

    private BasePage basepage;

    public Ecom_login_pageobject(BasePage basePage) {
        this.basepage = basePage;
        PageFactory.initElements(BasePage.getDriver(), this);
    }

//    By cross = By.xpath("//button[.='✕']"); can be used but ignore

    @FindBy(xpath = "//button[.='✕']")
    public WebElement cross;

    public void flipkart_login(WebDriver driver) throws InterruptedException {
        System.out.println(cross);
        Thread.sleep(5000);
//        driver.findElement(cross).click();can be used but ignore
        cross.click();

    }
}
