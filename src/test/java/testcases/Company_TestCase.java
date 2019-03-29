package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import  pages.Company_Page;
import  utility.Login;

public class Company_TestCase {


    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 20);

   @BeforeMethod
    public void VerifyHomepage() throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        System.out.println("Open Browser");
        //Thread.sleep(3000);
        Login log=new Login();
        log.Log_in(driver);


    }



    @Test(priority = 0)
     public void Click_add() throws InterruptedException {
        Thread.sleep(3000);
        Company_Page click_master=new Company_Page(driver);
        click_master.click_Master();
        Company_Page click_company=new Company_Page(driver);
        click_company.click_Company();
        Company_Page click=new Company_Page(driver);
        click.Add_Company(wait);
        Company_Page detail=new Company_Page(driver);
        detail.Add_details(wait);
        Company_Page add= new Company_Page(driver);
        add.Create_Company();
    }

   // @AfterMethod
    public void Close_Window() throws InterruptedException
    {
        System.out.println("Closing browser");
        driver.close();
    }




}
