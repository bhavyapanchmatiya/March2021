package March2021;

import org.openqa.selenium.By;

public class RegisterPage extends UtilsPage{


    private By _clickOnRadioMale = By.id("gender-male");
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _selectDate = By.name("DateOfBirthDay");
    private By _selectMonth = By.name("DateOfBirthMonth");
    private By _selectYear = By.name("DateOfBirthYear");
    private By _enterEmail = By.id("Email");
    private By _enterCompany = By.id("Company");
    private By _enterPassword = By.id("Password");
    private By _enterConfirmPassword = By.id("ConfirmPassword");
    private By _clickRegister = By.id("register-button");

    public void verifyUserIsOnRegisterPage(){

        assert_URLMethod("https://demo.nopcommerce.com/register?returnUrl=%2F");
    }

    public void selectRadioMale(){

        pause(1000);

        clickElement(_clickOnRadioMale);
    }

    public void enterRegistrationDetails(){

      enterText(_firstName,getProperty("FirstName"));
      enterText(_lastName,getProperty("LastName"));
      selectByIndex(_selectDate,3);
      selectByVisibleText(_selectMonth,"November");
      selectByValue(_selectYear,"1985");
      enterText(_enterEmail, generateEmail());
      enterText(_enterCompany,getProperty("Company"));
      enterText(_enterPassword,getProperty("PassWord"));
      enterText(_enterConfirmPassword,getProperty("PassWord"));
      clickElement(_clickRegister);

    }

    public void confirmRegistration(){

        assert_URLMethod("https://demo.nopcommerce.com/registerresult/1?returnUrl=/");
    }

}
