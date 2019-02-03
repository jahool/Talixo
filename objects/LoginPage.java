package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    String login = "JAHOL@ONET.PL";  // set login here! write it in capitals

    public String setLogin(){
        String email = login;
        return email;
    }
    public void clickRejestracjaButton(){
        WebElement rejestracjaButton = driver.findElement(By.xpath("//*[@id=\"landing\"]/div[1]/div[1]/div[1]/ul/li[2]/a"));
        rejestracjaButton.click();
    }
    public void typeLoginField(){
        WebElement loginField = driver.findElement(By.xpath("//*[@id=\"id_email_auth\"]"));
        loginField.clear();
        loginField.sendKeys(login);
    }
    public void typePasswordField(String password){
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    public void clickZalogujSiebutton(){
        WebElement zalogujSieButton = driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/div[2]/div/div[1]/div/form/div[3]/input[2]"));
        zalogujSieButton.click();
    }
    public String confirmLogin(){
        WebElement checkEmail = driver.findElement(By.xpath("//*[@id=\"landing\"]/div[3]/div[1]/div/ul/li[2]/span/span"));
        String confirmText = checkEmail.getText();
        return confirmText;
    }


}
