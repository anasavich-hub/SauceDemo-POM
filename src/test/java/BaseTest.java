import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public static WebDriver driver;

    public LoginPage    loginPage;
    public ProductsPage productsPage;
    public CartPage     cartPage;

    @BeforeClass
    public static void beforeAllTests() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void afterAllTests() {
        driver.quit();
    }
















}
