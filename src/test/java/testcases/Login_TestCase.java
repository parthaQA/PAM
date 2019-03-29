package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Login_Page;
import org.testng.Reporter.*;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Login_TestCase {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait=new WebDriverWait(driver, 30);


    @BeforeMethod()
    public void VerifyHomepage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        String baseUrl = "http://ec2-13-233-33-22.ap-south-1.compute.amazonaws.com/pam-dev/#/master/vessel";
        Reporter.log("Open Browser");
        Reporter.log("Navigating to url");
        driver.get(baseUrl);


    }

    @Test(priority =0)
    public void Login() throws InterruptedException
    {

        Login_Page login=new Login_Page(driver);
        login.login();
        Login_Page select=new Login_Page(driver);
        select.selectOrg(wait);


    }

    //@AfterMethod
    public void closeBrowser()
    {
        driver.close();
    }

}
