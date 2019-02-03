package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import objects.LoginPage;
import objects.RegisterPage;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class RegisterTest extends TestBase {

    @Test
    public void tryToRegister() throws InterruptedException {
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
        registerPage.clickCheckBoxes();
        registerPage.clickUtworzKontoButton();
        String loginMessage = registerPage.confirmRegistration();
        String emailLogin = registerPage.setLogin();
        assertEquals(loginMessage,emailLogin);




    }

}
