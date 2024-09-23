package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static pages.HomePage.*;

import static pages.LoggedInPage.*;
import static pages.OnlineProductsPage.*;
import static pages.RegistrationPage.visibility_registration_page;

public class OnLineProductPage {


    @Given("User click on Formal Shoes drop down")
    public void user_click_on_formal_shoes_drop_down() throws InterruptedException {

        formal_shoes_dropdown_class();


    }





    @Given("User should be able to view the Products")
    public void user_should_be_able_to_view_the_products() throws InterruptedException {

        gettest_formal_shoes_firstvalue();

        assertEquals("Classic Cheltenham", gettest_formal_shoes_firstvalue());








    }




}
