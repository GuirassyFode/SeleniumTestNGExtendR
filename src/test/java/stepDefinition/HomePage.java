package stepDefinition;
import static pages.HomePage.*;
import io.cucumber.java.en.Given;

public class HomePage {

    @Given("^User navigate to the Login page")
    public void user_navigate_to_the_login_page() throws InterruptedException {

        click_on_hamburger_menu();
        click_on_signIn_link();

    }


    @Given("User navigate to Online products page")
    public void user_navigate_to_online_products_page() throws InterruptedException {

        click_on_hamburger_menu();

        click_on_online_product();

    }


}
