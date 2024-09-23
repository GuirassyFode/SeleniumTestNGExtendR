package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static pages.HomePage.*;
import static pages.LoginPage.*;
import static pages.RegistrationPage.*;

public class LoginPage {

    @When("User successfully enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {

        sendKeyUserName();
        sendKeyPassword();
        clickOnLogin_btn();


    }


    @When("User click on new Registration button")
    public void user_click_on_new_Registration_button() throws InterruptedException {

        clickOnNewRegistrationBnt();



    }



}
