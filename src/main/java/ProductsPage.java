import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    WebDriver driver;

    public By proizvod      = By.className("title");
    public By dodajUKorpu    = By.id("add-to-cart-sauce-labs-backpack");
    public By korpaDugme    = By.className("shopping_cart_link");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean naProductsStraniciJe() {
        return driver.getCurrentUrl().contains("inventory");
    }

    public String getNaslovStranice() {
        return driver.findElement(proizvod).getText();
    }

    public void dodajProizvodUKorpu() {
        driver.findElement(dodajUKorpu).click();
    }

    public void klikniNaKorpu() {
        driver.findElement(korpaDugme).click();
    }
}




















