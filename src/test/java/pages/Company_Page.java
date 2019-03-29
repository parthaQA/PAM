package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Company_Page {

   static WebDriver driver;


    By Master=By.xpath("//*[contains(text(),'Master')]");
    By company=By.cssSelector("#cdk-accordion-child-0 > div > mat-list > mat-list-item > div");
    By Add_button= By.cssSelector("body > app-root > app-main-nav > mat-sidenav-container > mat-sidenav-content > div > app-company > mat-card > mat-card-content > button > span > mat-icon");
    By Company_Name= By.cssSelector("#mat-input-5");
    By Phone_No = By.className("mat-form-field-infix");
    By email = By.cssSelector("#mat-input-51");
    By street= By.cssSelector("#mat-input-52");
    By city= By.cssSelector("#mat-input-53");
    By state= By.cssSelector("#mat-input-54");
    By country= By.cssSelector("#mat-input-55");
    By zip_code= By.cssSelector("#mat-input-56");
    By pan= By.cssSelector("#mat-input-57");
    By tan= By.cssSelector("#mat-input-58");
    By tele= By.cssSelector("#mat-input-59");
    By gst= By.cssSelector("#mat-input-60");
    By currency= By.cssSelector("#mat-input-61");
    By Add_company= By.className("mat-button-wrapper");


    public Company_Page(WebDriver driver)
    {
        this.driver=driver;
    }

    public void click_Master() throws InterruptedException {
        Thread.sleep(3000);
        WebElement click=driver.findElement(Master);
        click.click();
    }

    public void click_Company() throws InterruptedException {
        Thread.sleep(3000);
        WebElement click=driver.findElement(company);
        click.click();
    }


    public  void Add_Company(WebDriverWait wait) throws InterruptedException {
      wait.until(ExpectedConditions.visibilityOfElementLocated(Add_button)).click();

        //WebElement click_add=driver.findElement(Add_button);
      //click_add.click();
    }

    public void Add_details(WebDriverWait wait)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Company_Name)).sendKeys("Sunrich");
        WebElement phone=driver.findElement(Phone_No);
        phone.sendKeys("1000000000");
        WebElement email_id=driver.findElement(email);
        email_id.sendKeys("p@gmail.com");
        WebElement Street=driver.findElement(street);
        Street.sendKeys("abc");
        WebElement City=driver.findElement(city);
        City.sendKeys("Kolkata");
        WebElement State=driver.findElement(state);
        State.sendKeys("West Bengal");
        WebElement Country=driver.findElement(country);
        Country.sendKeys("India");
        WebElement Zip=driver.findElement(zip_code);
        Zip.sendKeys("70000000");
        WebElement Pan=driver.findElement(pan);
        Pan.sendKeys("FFFFF0000A");
        WebElement Tan=driver.findElement(tan);
        Tan.sendKeys("FFFF00000A");
        WebElement Tele=driver.findElement(tele);
        Tele.sendKeys("1000000000");
        WebElement GST=driver.findElement(gst);
        GST.sendKeys("FFFFF");
        WebElement Currency=driver.findElement(currency);
        Currency.sendKeys("INR");


    }

    public void Create_Company()
    {
        WebElement create=driver.findElement(Add_company);
        create.click();
    }


}
