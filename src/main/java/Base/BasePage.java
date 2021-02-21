package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.reporters.EmailableReporter2;
import lombok.Getter;

import java.lang.reflect.Method;


public class BasePage extends EmailableReporter2 {

    @Getter public static WebDriver driver;

    @BeforeSuite
    public void initializeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void beforeMethod(final Method method, final Object[] testData, final ITestContext ctx) {
        ThreadLocal<String> testName = new ThreadLocal<>();
        if (testData.length > 0) {
            testName.set(method.getName() + "_" + testData[0]);
            ctx.setAttribute("testName", testName.get());
        } else ctx.setAttribute("testName", method.getName());
                method.getName();
    }

//    @AfterSuite
//    public void closeBrowser() {
//        driver.close();
//    }
}