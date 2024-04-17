import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Computer44Test {
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
    private By fioLocator = By.cssSelector(".form-input.fio");
    private By streetLocator = By.cssSelector(".data.form-input.street");
    private By numberHouseLocator = By.cssSelector(".form-input.house");
    private By apartmentLocator = By.cssSelector(".form-input.flat");
    private By dataVisitLocator = By.cssSelector(".form-input.date");
    private By button2Locator = By.cssSelector(".form-submit");
    private By fioResultElement = By.cssSelector(".fio.data.show-fio");
    private By streetResultElement = By.cssSelector(".show-street");
    private By numberHouseResultElement = By.cssSelector(".show-house");
    private By apartmentResultElement = By.cssSelector(".show-flat");

    private By dataVisitResultElement = By.cssSelector(".show-date");
    @Test
    public void computer44Tests(){
        driver.navigate().to("https://qajava.skillbox.ru/module04/lesson3/index.html");
        driver.findElement(fioLocator).sendKeys("Иванов Иван Иванович");
        driver.findElement(streetLocator).sendKeys("Ленина");
        driver.findElement(numberHouseLocator).sendKeys("17");
        driver.findElement(apartmentLocator).sendKeys("35");
        driver.findElement(dataVisitLocator).sendKeys("Завтра");
        var fio = "\"Иванов Иван Иванович\"";
        var street = "\"Ленина\"";
        var number = "\"17\"";
        var apartment = "\"35\"";
        var dataVisita = "\"Завтра\"";
        driver.findElement(button2Locator).click();
        Assert.assertEquals("ФИО не найдена",fio,driver.findElement(fioResultElement).getText());
        Assert.assertEquals("Улица не найдена",street, driver.findElement(streetResultElement).getText());
        Assert.assertEquals("Номер дома не найден",number,driver.findElement(numberHouseResultElement).getText());
        Assert.assertEquals("Номер квартиры не найден",apartment, driver.findElement(apartmentResultElement).getText());
        Assert.assertEquals("День визита мастера не найден",dataVisita, driver.findElement(dataVisitResultElement).getText());
    }
}
