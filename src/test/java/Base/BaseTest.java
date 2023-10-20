package Base;

import Pages.ABTestingPage;
import Pages.AddRemoveElementsPage;
import Pages.BasicAuthPage;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public WebDriverWait wait;
    public HomePage homePage;
    public ABTestingPage abTestingPage;
    public AddRemoveElementsPage addRemoveElementsPage;
    public BasicAuthPage basicAuthPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homePage = new HomePage();
        abTestingPage = new ABTestingPage();
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/");
        addRemoveElementsPage = new AddRemoveElementsPage();
        basicAuthPage = new BasicAuthPage();


    }
}
