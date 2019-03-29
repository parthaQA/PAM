package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.Reporter;
import testcases.Login_TestCase;
import org.testng.reporters.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;
import org.openqa.selenium.Alert;


public class Login_Page {

    static WebDriver driver;


    By username = By.cssSelector("#mat-input-0");
    By password = By.cssSelector("#mat-input-1");
    By login = By.className("mat-button-wrapper");
    By select_arrow = By.cssSelector("#mat-select-0 > div > div.mat-select-value > span");
    By Org = By.id("mat-option-0");
    By go = By.xpath("*//button[@color='warn']");
    By verify = By.xpath("//*[contains(text(),'dashboard works!')]");
   // By Container_display = By.xpath("//*mat-dialog-container[@id='mat-dialog-1']");
    By container_popup = By.xpath("//*[contains(text(),'Continue')]");



    public Login_Page(WebDriver driver) {
        this.driver = driver;
    }


    public void login() {
        WebElement user_name;
        user_name = driver.findElement(username);
        user_name.click();
        user_name.sendKeys("user5");
        WebElement pass_word;
        pass_word = driver.findElement(password);
        pass_word.click();
        pass_word.sendKeys("Pass@1234");
        WebElement Login;
        Login = driver.findElement(login);
        Login.submit();


    }

    public void selectOrg(WebDriverWait wait) throws InterruptedException {
        WebElement window = wait.until(ExpectedConditions.visibilityOfElementLocated(select_arrow));
        window.click();
        WebElement org = driver.findElement(Org);
        org.click();
        Thread.sleep(4000);
        WebElement Go = driver.findElement(go);
        Go.click();
        Thread.sleep(3000);


        try {
            if (driver.findElement(container_popup).isDisplayed()) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(container_popup)).click();
            }
        } catch (Exception e) {
           e.printStackTrace();

        }


        Thread.sleep(3000);
        WebElement Verify = driver.findElement(verify);
        String expected = "dashboard works!";
        System.out.println(Verify.getText());
        Assert.assertEquals(Verify.getText(), expected);

    }


}
