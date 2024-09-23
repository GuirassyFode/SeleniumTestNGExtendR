package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;


public class HomePage extends BrowserDriver {


    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";

    public static String signIn_link_linktext = "Sign In Portal";

    public static String new_product_xpath = "//*[@id=\"menu\"]/a[3]/li";


    public static void click_on_hamburger_menu() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();

    }

    public static void click_on_signIn_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(signIn_link_linktext)).click();

    }

    public static void click_on_online_product() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(new_product_xpath)).click();

    }


}
