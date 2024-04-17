import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractikeBookShop02Tests {
    private WebDriver driver;
    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void TearDown()
    {
        driver.quit();
    }
    @Test
    public void bookShopLokatorTest()
    {
       driver.navigate().to("https://qajava.skillbox.ru/");
       var feedBackElement =  driver.findElement(By.linkText("Обратная связь"));
       var preOrdersElement = driver.findElement(By.partialLinkText("Предзаказы"));
       var basketElement = driver.findElement(By.tagName("button"));
       var cartCountElement = driver.findElement(By.id("cart_count"));
       var paragraphElement = driver.findElement(By.tagName("a"));
       var shopSearchElement = driver.findElement(By.name("search-input-form"));
    }
}
