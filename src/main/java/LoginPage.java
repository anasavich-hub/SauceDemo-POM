import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public By usernamePolje = By.id("user-name");
    public By passwordPolje = By.id("password");
    public By loginDugme    = By.id("login-button");
    public By errorPoruka   = By.xpath("//h3[@data-test='error']");
    public By example = By.id("example");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void otvoriLoginStranicu() {
        driver.get("https://www.saucedemo.com/");
    }

    public void unosKredencijala(String username, String password) {
        driver.findElement(usernamePolje).sendKeys(username);
        driver.findElement(passwordPolje).sendKeys(password);
        driver.findElement(loginDugme).click();
    }

    public boolean errorPorukaJeVidljiva() {
        return driver.findElement(errorPoruka).isDisplayed();
    }

    public String getErrorTekst() {
        return driver.findElement(errorPoruka).getText();
    }
}


















