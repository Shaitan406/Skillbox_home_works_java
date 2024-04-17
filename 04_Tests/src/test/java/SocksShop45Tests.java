import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SocksShop45Tests {
    private WebDriver driver;
    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void tearDown()
    {
        driver.quit();
    }
    private By emailLocator1 = By.id("email");
    private By passwordLocator1 = By.name("password");
    private By buttonLocator1 = By.tagName("button");
    private By errorResult1 = By.className("form-error-password-email");


    @Test
    public void shopsSocks1Test() {
        driver.navigate().to("https://qajava.skillbox.ru/module04/homework/auth/index.html");
        driver.findElement(emailLocator1).sendKeys("@");
        driver.findElement(passwordLocator1).sendKeys("123");
        driver.findElement(buttonLocator1).click();
        var textResult = "Некорректный email или пароль";
        Assert.assertTrue("Тест не появился",driver.findElement(errorResult1).isDisplayed());
        Assert.assertEquals("Текст не правильный",textResult,driver.findElement(errorResult1).getText());
    }
    private By emailLocator2 = By.cssSelector(".form-input.input-data");
    private By passwordLocator2 = By.cssSelector(".form-input.password");
    private By buttonLocator2 = By.cssSelector(".form-submit");
    private By errorResult2 = By.cssSelector(".form-error-password-email");

    @Test
    public void shopSocks2Test() {
        driver.navigate().to("https://qajava.skillbox.ru/module04/homework/auth/changed.html");
        driver.findElement(emailLocator2).sendKeys("@");
        driver.findElement(passwordLocator2).sendKeys("123");
        driver.findElement(buttonLocator2).click();
        var textResult = "Некорректный email или пароль";
        Assert.assertTrue("Текст отсутствует", driver.findElement(errorResult2).isDisplayed());
        Assert.assertEquals("Текст неправильный", textResult, driver.findElement(errorResult2).getText());
    }
    private By emailLocator3 = By.cssSelector("input.form-input.input-data");
    private By passwordLocator3 = By.cssSelector("input.form-input.password");
    private By buttonLocator3 = By.cssSelector("button.form-submit");
    private By errorResult3 = By.cssSelector("pre.form-error-password-email");

    @Test
    public void shopSocks3Test() {
        driver.navigate().to("https://qajava.skillbox.ru/module04/homework/auth/changed.html");
        driver.findElement(emailLocator3).sendKeys("@");
        driver.findElement(passwordLocator3).sendKeys("123");
        driver.findElement(buttonLocator3).click();
        var textResult = "Некорректный email или пароль";
        Assert.assertTrue("Текст отсутствует", driver.findElement(errorResult3).isDisplayed());
        Assert.assertEquals("Текст неправильный", textResult, driver.findElement(errorResult3).getText());
    }

    private By emailLocator4 = By.cssSelector("#email");
    private By passwordLocator4 = By.cssSelector("#password");
    private By buttonLocator4 = By.cssSelector("#submit");
    private By errorResult4 = By.cssSelector("#error");

    @Test
    public void shopSocks4Test() {
        driver.navigate().to("https://qajava.skillbox.ru/module04/homework/auth/changed.html");
        driver.findElement(emailLocator4).sendKeys("@");
        driver.findElement(passwordLocator4).sendKeys("123");
        driver.findElement(buttonLocator4).click();
        var textResult = "Некорректный email или пароль";
        Assert.assertTrue("Текст отсутствует", driver.findElement(errorResult4).isDisplayed());
        Assert.assertEquals("Текст неправильный", textResult, driver.findElement(errorResult4).getText());
    }
    private By emailLocator5 = By.cssSelector("input#email.form-input.input-data");
    private By passwordLocator5 = By.cssSelector("input#password.form-input.password");
    private By buttonLocator5 = By.cssSelector("button#submit.form-submit");
    private By errorResult5 = By.cssSelector("pre#error.form-error-password-email");

    @Test
    public void shopSocks5Test() {
        driver.navigate().to("https://qajava.skillbox.ru/module04/homework/auth/changed.html");
        driver.findElement(emailLocator5).sendKeys("@");
        driver.findElement(passwordLocator5).sendKeys("123");
        driver.findElement(buttonLocator5).click();
        var textResult = "Некорректный email или пароль";
        Assert.assertTrue("Текст отсутствует", driver.findElement(errorResult5).isDisplayed());
        Assert.assertEquals("Текст неправильный", textResult, driver.findElement(errorResult5).getText());
    }
}
