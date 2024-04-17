import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PractikeShoes34Tests {
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
    @Test
    public void shoesTest1()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module03/practice1/");
        driver.findElement(By.name("check")).sendKeys("45");
        driver.findElement(By.tagName("button")).click();
        var actualResult = driver.findElement(By.id("size-error")).getText();
        var expectedResult = "В нашем магазине нет обуви вашего размера";
        Assert.assertEquals("Ошибка выбора размера обуви",expectedResult,actualResult);
    }
    @Test
    public void shoesTest2()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module03/practice1/");
        driver.findElement(By.name("check")).sendKeys("34");
        driver.findElement(By.tagName("button")).click();
        var actualResult = driver.findElement(By.id("size-success")).getText();
        var expectedResult = "В нашем магазине есть обувь вашего размера";
        Assert.assertEquals("Ошибка выбора размера обуви",expectedResult,actualResult);
    }
}
