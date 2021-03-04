package March2021;

import org.openqa.selenium.By;

public class HomePage extends UtilsPage{


    private By _clickOnRegister = By.className("ico-register");





    public void verifyUserIsOnHomePage(){


assert_URLMethod("https://demo.nopcommerce.com/");

    }



public void clickOnRegister(){

        clickElement(_clickOnRegister);
}





}
