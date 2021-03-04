package March2021;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyStepdefs {


    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();


    @Given("^User is on Homepage and click register\\.$")
    public void userIsOnHomepageAndClickRegister() {

        homePage.verifyUserIsOnHomePage();
        homePage.clickOnRegister();



    }

    @When("^enter Registration Details and click Register$")
    public void enterRegistrationDetailsAndClickRegister() {

        registerPage.verifyUserIsOnRegisterPage();
        registerPage.selectRadioMale();
        registerPage.enterRegistrationDetails();


    }

    @Then("^User should see the message “Your Registration Completed\\.”$")
    public void userShouldSeeTheMessageYourRegistrationCompleted() {

        registerPage.confirmRegistration();
    }
}
