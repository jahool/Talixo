package tests;

import org.testng.annotations.Test;
import objects.LoginPage;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTest extends TestBase {

    @Test
    public void tryToLogin(){
        LoginPage loginPage = new LoginPage (driver);
        loginPage.clickRejestracjaButton();
        loginPage.typeLoginField(); // set login in LoginPage class
        loginPage.typePasswordField("haslo1haslo");
        loginPage.clickZalogujSiebutton();
        String loginMessage = loginPage.confirmLogin();
        String emailLogin = loginPage.setLogin();

        assertEquals(loginMessage,emailLogin);


    }
}
