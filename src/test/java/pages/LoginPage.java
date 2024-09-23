package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {


    public static String enterUserName_text_id = "usr";

    public static String enterPassWord_text_id = "pwd";
    public static String clickOnLogin_xpath = "//*[@id=\"second_form\"]/input";

    public static String clickOnNewRegistrationButton_id = "NewRegistration";

    //public static String clickOnNewRegistrationButton_text = "Online Products";





    public static void sendKeyUserName() throws InterruptedException {
        driver.findElement(By.id(enterUserName_text_id)).sendKeys("sleniumtest");

    }

    public static void sendKeyPassword() throws InterruptedException {

        driver.findElement(By.id(enterPassWord_text_id)).sendKeys("Sleniumtest122!");

    }

    public static void clickOnLogin_btn() throws InterruptedException {

        driver.findElement(By.xpath(clickOnLogin_xpath)).click();

    }

    public static void clickOnNewRegistrationBnt() throws InterruptedException {

        driver.findElement(By.id(clickOnNewRegistrationButton_id)).click();

    }



}
