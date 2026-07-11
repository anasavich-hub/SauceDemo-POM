import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SauceLabsTest extends BaseTest {

    @Before
    public void beforeEachTest() {
        loginPage    = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        cartPage     = new CartPage(driver);
        loginPage.otvoriLoginStranicu();
    }

    @Test
    public void testValidniLogin() {
        loginPage.unosKredencijala("standard_user", "secret_sauce");

        Assert.assertTrue(
                "Treba da smo na Products stranici",
                productsPage.naProductsStraniciJe()
        );
        Assert.assertEquals("Products", productsPage.getNaslovStranice());
        System.out.println("PASS - Login: " + driver.getCurrentUrl());
    }

    @Test
    public void testDodatjeUKorpu() {
        loginPage.unosKredencijala("standard_user", "secret_sauce");

        productsPage.dodajProizvodUKorpu();
        productsPage.klikniNaKorpu();

        Assert.assertTrue(
                "Treba da smo na Cart stranici",
                cartPage.naCartStraniciJe()
        );
        Assert.assertTrue(
                "Proizvod treba da bude u korpi",
                cartPage.proizvodJeUKorpi()
        );
        System.out.println(" Naziv proizvoda u korpi: " + cartPage.getNazivProizvoda());
    }

    @Test
    public void testNevalidniLogin() {
        loginPage.unosKredencijala("pogresni_user", "pogresna_lozinka");

        Assert.assertTrue(
                "Error poruka treba da bude vidljiva",
                loginPage.errorPorukaJeVidljiva()
        );
        System.out.println("PASS - Error: " + loginPage.getErrorTekst());
    }
}
