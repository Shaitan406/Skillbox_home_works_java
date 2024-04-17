import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KetDogLocatorTests {
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

    private  By emailLocator = By.className("email");
    private  By writeToMeLocator = By.id("write-to-me");
    private  By resuleEmailLocator = By.className("notification-email");
    @Test
    public void locatorKetTest1(){
        driver.navigate().to("https://qajava.skillbox.ru/module04/lesson2/changed.html");
        var email = "test@test.ru";
        driver.findElement(emailLocator).sendKeys(email);
        driver.findElement(writeToMeLocator).click();
        Assert.assertTrue("Email есть=true,нету=False ",driver.findElement(resuleEmailLocator).isDisplayed());
        Assert.assertEquals("email - совпал",email,driver.findElement(resuleEmailLocator).getText());
    }
    @Test
    public void locatorKetTest2(){
        driver.navigate().to("https://qajava.skillbox.ru/module04/lesson2/changed.html");
        driver.findElement(writeToMeLocator).click();
        Assert.assertEquals("Ошабка - email найден","",driver.findElement(resuleEmailLocator).getText());
    }
    private By boyLocator = By.id("boy");
    private By girlLocator = By.id("girl");
    private By emailDogLocator = By.name("email");
    private By buttonLocator = By.tagName("button");
    private By resultLocator = By.className("your-email");
    @Test
    public void nameDogTest1(){
        driver.navigate().to("https://qajava.skillbox.ru/module04/lesson2/practice/");
        var email = "test@test.ru";
        driver.findElement(boyLocator).click();
        driver.findElement(emailDogLocator).sendKeys(email);
        driver.findElement(buttonLocator).click();
        Assert.assertTrue("Результат: email не найден",driver.findElement(resultLocator).isDisplayed());
    }
    @Test
    public void nameDogTest2(){
        driver.navigate().to("https://qajava.skillbox.ru/module04/lesson2/practice/");
        driver.findElement(girlLocator).click();
        driver.findElement(buttonLocator).click();
        Assert.assertFalse("Результат: email найден",driver.findElement(resultLocator).isDisplayed());
    }

    @Test
    public void computerTest43() {
        driver.navigate().to("https://qajava.skillbox.ru/module04/lesson3/os.html");
        var nameLocator = By.cssSelector(".data.text");
        driver.findElement(nameLocator).sendKeys("Вадим");
        var emailLocator = By.cssSelector(".data.field");
        driver.findElement(emailLocator).sendKeys("test@test.ru");
        var textLocator = By.cssSelector(".field.text");
        driver.findElement(textLocator).sendKeys("Спасибо,все отлично!");
        var buttonLocator = By.id("comment");
        driver.findElement(buttonLocator).click();
        var massegeLocator = By.className("message-header");
        Assert.assertTrue("Нету сообщения - спасибо за отзыв",driver.findElement(massegeLocator).isDisplayed());
    }
}
