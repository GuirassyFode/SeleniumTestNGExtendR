package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;


public class RegistrationPage extends BrowserDriver {

    public static String verify_user_registration_page = "//*[text() = 'User Registration Page']";



    public static void visibility_registration_page() throws InterruptedException {

        String new_user_registion_text = driver.findElement(By.xpath(verify_user_registration_page)).getText();
        assertEquals("User Registration Page", new_user_registion_text);



    }





}
