package pages;

import io.cucumber.java.an.E;
import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class OnlineProductsPage extends BrowserDriver {

    public static String formal_shoes_drop_down_xpath = "/html/body/div[2]/center/div/i[1]";

    public static String formal_body_table_xpath_webtable = "/html/body/div[2]/table";

    public static String formal_body_table_xpath_tr = "/html/body/div[2]/table/tbody/tr[1]/td[1]";





    public static void formal_shoes_dropdown_class() throws InterruptedException {

        driver.findElement(By.xpath(formal_shoes_drop_down_xpath)).click();


    }


    public static Object gettest_formal_shoes_firstvalue() {

        String gettest_formal_shoes_value = driver.findElement(By.xpath(formal_body_table_xpath_tr)).getText();

        return gettest_formal_shoes_value;



    }
}
