import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SixWorksHomeJobs6503Test {

    private WebDriver driver;
    private WebDriverWait wait;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void sixFiveTest() {

        driver.navigate().to("https://qa.skillbox.ru/module15/bignotes/#/statistic");
        var centerOfScreenLocator = By.cssSelector("div.articlePreview.pageStatistic__article:last-child");
        var vseZapisiLocator = By.cssSelector("div.articlePreview.pageArticle__articlePreview:first-child");
        var zagolovokLocator = By.cssSelector("div.vb-content > div:nth-child(1) p.articlePreview__title");
        var textLocator = By.cssSelector("div.vb-content > div:nth-child(1) p.articlePreview__text");
        var clearLocator = By.cssSelector("button.pageArticle__button:nth-of-type(2) svg");
        var zapisiDextralLocator = By.cssSelector("button.articlePreview__link");

        driver.findElement(centerOfScreenLocator).click();
        Assert.assertTrue("Запись не появилась", driver.findElement(vseZapisiLocator).isDisplayed());
        var actualZagolovok = driver.findElement(zagolovokLocator).getText();
        var actualText = driver.findElement(textLocator).getText();
        var expectedZagolovok = "План на следующий месяц";
        var expectedText = "Прочитать книгу «Искусство цвета».";
        Assert.assertEquals("Заголовок не совпадает",expectedZagolovok,actualZagolovok);
        Assert.assertEquals("Текст под заголовком не совпадает",expectedText,actualText);
        driver.findElement(clearLocator).click();
        driver.findElement(zapisiDextralLocator).click();
        driver.findElement(clearLocator).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(zapisiDextralLocator));
        Assert.assertTrue("Не исчез лайтбокс - Все записи", driver.findElements(zapisiDextralLocator).size()==0);
    }
}
