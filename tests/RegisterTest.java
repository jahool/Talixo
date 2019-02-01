package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import objects.LoginPage;
import objects.RegisterPage;

import static org.testng.AssertJUnit.assertEquals;

public class RegisterTest extends TestBase {

    @Test
    public void tryToRegister(){
        LoginPage loginPage = new LoginPage (driver);
        RegisterPage registerPage = new RegisterPage(driver);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        loginPage.clickRejestracjaButton();
        jse.executeScript("window.scrollBy(0,300)");
        registerPage.clickRegisterButton();
        registerPage.typeImieField("Jan");
        registerPage.typeNazwiskoField("Kowalski");
        registerPage.typePrefixField("+48");
        registerPage.typePhoneNumberField("675553445");
        registerPage.typeEmailField();
        registerPage.typeHasloField("haslo2haslo");
        registerPage.clickPodrozujeSluzbowoField();
        registerPage.typeNazwaFirmyField("Firma Pana Jana");
        jse.executeScript("window.scrollBy(0,200)");
        registerPage.clickDiscountsCheckBox(); // nie działa, do poprawy!      // przy zaznaczaniu opcji ładuje się też dodatkowa strona www!
        registerPage.clickDataCheckBox(); // nie działa, do poprawy!      // przy zaznaczaniu opcji ładuje się też dodatkowa strona www!
        registerPage.clickTermsCheckBox();// nie działa, do poprawy!      // przy zaznaczaniu opcji ładuje się też dodatkowa strona www!
        registerPage.clickUtworzKontoButton();// nie działa, do poprawy!      // przy zaznaczaniu opcji ładuje się też dodatkowa strona www!
        String loginMessage = registerPage.confirmRegistration();
        String emailLogin = registerPage.setLogin();
        assertEquals(loginMessage,emailLogin);




    }

}
