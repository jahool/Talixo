package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import objects.OrderPage;

public class RezerwacjaTest extends TestBase {

    @Test
    public void tryToOrderACar(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        OrderPage orderPage = new OrderPage(driver);
        jse.executeScript("window.scrollBy(0,300)");
        orderPage.clickOnRozpocznijRezerwacjeButton();
        orderPage.typeIntoOdbiorField("Halszki 28, Porucznika Halszki, Kraków, Polska");
        orderPage.typeIntoCelField("Katowice International Airport (KTW)");
        orderPage.clickOnDate();
        orderPage.setTime("12:45");
        orderPage.clickUpdateButton();
        orderPage.choseEconomyCar();
        orderPage.typeNewUserEmail("test2@test.pl");
        orderPage.typeImie("Jan");
        orderPage.typeNazwisko("Kowalski");
        orderPage.typePrefix("+48");
        orderPage.typeTelefon("765555222");
        orderPage.typePickUpSign("Wielmożny Panie Janie");
        orderPage.typeMessgeForDriver("Proszę o punktualność");
        orderPage.typeNumerKarty("4178580652613125");
        orderPage.typeWlasciciel("Jan Kowalski");
        orderPage.typeMiesiac("03");
        orderPage.typeRok("2021");
        orderPage.typeCvC("622");
        jse.executeScript("window.scrollBy(0,1000)");
        orderPage.clickAkceptujeButton();  // nie działa, do poprawy!
        orderPage.clickDiscountsButton(); // nie działa, do poprawy!
        orderPage.clickDataProtectionButton(); // nie działa, do poprawy!      // przy zaznaczaniu opcji ładuje się też dodatkowa strona www!
        orderPage.clickGeneralTermsButton(); // nie działa, do poprawy!
        orderPage.clickZarezerwujButton();
         // uzupełnić asercję!
    }
}
