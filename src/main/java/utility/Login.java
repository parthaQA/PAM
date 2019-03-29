package utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Login {


    public void Log_in(WebDriver driver) throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver, 30);

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        String baseUrl = "http://idndsolutions.com/ship/";
        driver.get(baseUrl);
        By username=By.cssSelector("#mat-input-0");
        By password=By.cssSelector("#mat-input-1");
        By login = By.className("mat-button-wrapper");
        WebElement user_name;
        user_name = driver.findElement(username);
        user_name.click();
        user_name.sendKeys("anuj@gmail.com");
        WebElement pass_word;
        pass_word = driver.findElement(password);
        pass_word.click();
        pass_word.sendKeys("Pass@1234");
        WebElement Login;
        Login = driver.findElement(login);
        Login.submit();
        By select_arrow = By.cssSelector("#mat-select-0 > div > div.mat-select-value > span");
        By Org = By.id("mat-option-0");
        By go = By.xpath("*//button[@color='warn']");
        By verify = By.xpath("//*[contains(text(),'dashboard works!')]");
        By container_popup = By.xpath("//*[contains(text(),'Continue')]");
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

    }

}

