import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTests {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zlata.DESKTOP-S3VC9UU\\Desktop\\uni\\JavaAutomatization\\lection4-example\\TestingLibraries\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();

        WebElement resultStats = driver.findElement(By.id("result-stats"));
        assertTrue(resultStats.isDisplayed(), "Result stats should be displayed");
    }

    @Test
    public void testWikipediaLogo() {
        driver.get("https://www.wikipedia.org");

        WebElement logo = driver.findElement(By.cssSelector(".central-featured-logo"));
        assertTrue(logo.isDisplayed(), "Wikipedia logo should be displayed");
    }

    @Test
    public void testGithubTitle() {
        driver.get("https://github.com");

        WebElement heading = driver.findElement(By.tagName("h1"));
        assertEquals("Where the world builds software", heading.getText(), "Heading should be 'Where the world builds software'");
    }
}
