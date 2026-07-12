import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {


    WebDriver driver;

    public By mojaKupovina  = By.id("title");
    public By poljeProizvoda   = By.id("cart_item");
    public By nazivProizvoda   = By.id("inventory_item_name");
    public By checkoutDugme = By.id("checkout");


    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean naCartStraniciJe() {
        return driver.findElement(mojaKupovina).isDisplayed();
    }

    public String getNaslovStranice() {
        return driver.findElement(mojaKupovina).getText();
    }

    public boolean proizvodJeUKorpi() {
        return driver.findElement(poljeProizvoda).isDisplayed();
    }

    public String getNazivProizvoda() {
        return driver.findElement(nazivProizvoda).getText();
    }

    public void klikniNaCheckout() {
        driver.findElement(checkoutDugme).click();
    }




}


















