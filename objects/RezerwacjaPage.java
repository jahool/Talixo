package objects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;


public class RezerwacjaPage {
    private WebDriver driver;

    public RezerwacjaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnRozpocznijRezerwacjeButton() {
        WebElement rozpocznijRezerwacjeButton = driver.findElement(By.xpath("//*[@id=\"prebooking-form\"]/input[19]"));
        rozpocznijRezerwacjeButton.click();
    }

    public void typeIntoOdbiorField(String odbior) {
        WebElement odbiorField = driver.findElement(By.xpath("//*[@id=\"id_start_point_NEW\"]"));
        odbiorField.clear();
        odbiorField.sendKeys(odbior);
        odbiorField.sendKeys(Keys.ENTER);
    }

    public void typeIntoCelField(String cel) {
        WebElement celField = driver.findElement(By.xpath("//*[@id=\"id_end_point_NEW\"]"));
        celField.clear();
        celField.sendKeys(cel);
        celField.sendKeys(Keys.ENTER);
    }

    public void clickOnDate() {
        WebElement dateButton = driver.findElement(By.xpath("//*[@id=\"prebooking-form\"]/div[9]/div[2]/label[2]/span[2]"));
        dateButton.click();
    }

    public void setTime(String time) {
        WebElement timeField = driver.findElement(By.xpath("//*[@id=\"id_start_time_time\"]"));
        timeField.clear();
        timeField.sendKeys(time);
        timeField.sendKeys(Keys.ENTER);

    }

    public void clickConfirmTime() {
        WebElement confirmTime = driver.findElement(By.xpath("//*[@id=\"start_time_time-autocomplete\"]/li[2]/span"));
        confirmTime.click();
    }

    public void rezerwacjaCzasuCheckBox() {
        WebElement rezerwacjaCheckBox = driver.findElement(By.xpath("//*[@id=\"id_start_time_time\"]"));
        rezerwacjaCheckBox.click();
    }

    public void selectGodziny() {
        WebElement godzinyWebElement = driver.findElement(By.xpath("//*[@id=\"id_duration_chzn\"]/a/span"));
        Select godzinyDropDown = new Select(godzinyWebElement);
        godzinyDropDown.selectByIndex(1);
        assertEquals(godzinyDropDown.getFirstSelectedOption().getText(), "7h");
    }

    public void clickUpdateButton() {
        WebElement updateButton = driver.findElement(By.xpath("//*[@id=\"prebooking-form\"]/input[19]"));
        updateButton.click();
    }

    public void choseEconomyCar() {
        WebElement bookEconomyButton = driver.findElement(By.xpath("//*[@id=\"booking-what\"]/div[3]/div[2]/div/div[1]/div[1]/div[2]/form/div/div[1]/div/div[3]/label/input"));
        bookEconomyButton.click();
    }

    public void typeNewUserEmail(String email) {
        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"id_email_auth\"]"));
        emailField.sendKeys(email);
    }

    public void typeImie(String imie) {
        WebElement imieField = driver.findElement(By.xpath("//*[@id=\"id_first_name\"]"));
        imieField.sendKeys(imie);
    }

    public void typeNazwisko(String nazwisko) {
        WebElement nazwiskoField = driver.findElement(By.xpath("//*[@id=\"id_last_name\"]"));
        nazwiskoField.sendKeys(nazwisko);
    }

    public void typePrefix(String prefix) {
        WebElement prefixField = driver.findElement(By.xpath("//*[@id=\"id_mobile_0\"]"));
        prefixField.sendKeys(prefix);
        prefixField.sendKeys(Keys.ENTER);
    }

    public void typeTelefon(String telefon) {
        WebElement telefonField = driver.findElement(By.xpath("//*[@id=\"id_mobile_1\"]"));
        telefonField.sendKeys(telefon);
    }

    public void typePickUpSign(String pickupsign) {
        WebElement pickupField = driver.findElement(By.xpath("//*[@id=\"id_talixo_shield_text\"]"));
        pickupField.sendKeys(pickupsign);
    }

    public void typeMessgeForDriver(String message) {
        WebElement messageField = driver.findElement(By.xpath("//*[@id=\"id_special_wishes\"]"));
        messageField.sendKeys(message);
    }

    public void typeNumerKarty(String karta) {
        WebElement numerkartyField = driver.findElement(By.xpath("//*[@id=\"adyen-encrypted-form-number\"]"));
        numerkartyField.sendKeys(karta);
    }

    public void typeWlasciciel(String wlasciciel) {
        WebElement wlascicielField = driver.findElement(By.xpath("//*[@id=\"adyen-encrypted-form-name\"]"));
        wlascicielField.sendKeys(wlasciciel);
    }

    public void typeMiesiac(String miesiac) {
        WebElement miesiacField = driver.findElement(By.xpath("//*[@id=\"adyen-encrypted-form-expiry-month\"]"));
        miesiacField.sendKeys(miesiac);
        miesiacField.sendKeys(Keys.ENTER);
    }

    public void typeRok(String rok) {
        WebElement rokField = driver.findElement(By.xpath("//*[@id=\"adyen-encrypted-form-expiry-year\"]"));
        rokField.sendKeys(rok);
        rokField.sendKeys(Keys.ENTER);
    }

    public void typeCvC(String cvc) {
        WebElement cvcField = driver.findElement(By.xpath("//*[@id=\"adyen-encrypted-form-cvc\"]"));
        cvcField.sendKeys(cvc);
    }

    public void clickAkceptujeButton() {
        WebElement akceptujeButton = driver.findElement(By.xpath("//*[@id=\"passengerForm\"]/div[7]/label"));
        akceptujeButton.click();
    }

    public void clickCheckBoxes() {
        List<WebElement> listOfElements =
                driver.findElements(By.xpath("//span[@class='label-body']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        for (int i = 0; i < listOfElements.size(); i++) {
            executor.executeScript("arguments[0].click();", listOfElements.get(i));
        }
    }

    public void clickZarezerwujButton() {
        WebElement zarezerwujButton = driver.findElement(By.xpath("//*[@id=\"passengerForm\"]/div[9]/input"));
        zarezerwujButton.click();
    }

    public String confirmRezerwacja() {
        WebElement checkPayment = driver.findElement(By.xpath("//*[@id=\"passengerForm\"]/h2[2]/span/span"));
        String confirmText = checkPayment.getText();
        return confirmText;


    }
}












