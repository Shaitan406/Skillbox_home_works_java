import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractikeBookShop03Tests {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void TearDown() {
        driver.quit();
    }

    @Test
    public void locatorsManyTest() {
        driver.navigate().to("https://qajava.skillbox.ru/");
        var noteElements = driver.findElements(By.className("book-info"));
        Assert.assertEquals("Неверное количество записей на странице", 15, noteElements.size());
    }
}