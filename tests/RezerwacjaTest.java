package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import objects.RezerwacjaPage;

import static org.testng.AssertJUnit.assertEquals;

public class RezerwacjaTest extends TestBase {

    @Test
    public void tryToOrderACar(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        RezerwacjaPage rezerwacjaPage = new RezerwacjaPage(driver);
        jse.executeScript("window.scrollBy(0,300)");
        rezerwacjaPage.clickOnRozpocznijRezerwacjeButton();
        rezerwacjaPage.typeIntoOdbiorField("Halszki 28, Porucznika Halszki, Kraków, Polska");
        rezerwacjaPage.typeIntoCelField("Katowice International Airport (KTW)");
        rezerwacjaPage.clickOnDate();
        rezerwacjaPage.setTime("12:45");
        rezerwacjaPage.clickUpdateButton();
        rezerwacjaPage.choseEconomyCar();
        rezerwacjaPage.typeNewUserEmail("test6@test.pl");
        rezerwacjaPage.typeImie("Jan");
        rezerwacjaPage.typeNazwisko("Kowalski");
        rezerwacjaPage.typePrefix("+48");
        rezerwacjaPage.typeTelefon("765555222");
        rezerwacjaPage.typePickUpSign("Wielmożny Panie Janie");
        rezerwacjaPage.typeMessgeForDriver("Proszę o punktualność");
        rezerwacjaPage.typeNumerKarty("4178580652613125");
        rezerwacjaPage.typeWlasciciel("Jan Kowalski");
        rezerwacjaPage.typeMiesiac("03");
        rezerwacjaPage.typeRok("2021");
        rezerwacjaPage.typeCvC("622");
        jse.executeScript("window.scrollBy(0,1000)");
        rezerwacjaPage.clickCheckBoxes();
        rezerwacjaPage.clickZarezerwujButton();
        String paymentWarrning = rezerwacjaPage.confirmRezerwacja();
        String paymentWarningText = "The card does not have enough money to cover the payable amount.";
        assertEquals(paymentWarrning,paymentWarningText);

    }
}
