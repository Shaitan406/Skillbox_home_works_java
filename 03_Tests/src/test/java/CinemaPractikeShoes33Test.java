import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CinemaPractikeShoes33Test {
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
    public void cinemaTest() {

       driver.navigate().to("https://lm.skillbox.cc/qa_tester/module05/practice1/");
       driver.findElement(By.className("form-input")).sendKeys("test@test.ru");
       driver.findElement(By.name("password")).sendKeys("qwerty12345");
       driver.findElement(By.id("confirm_password")).sendKeys("qwerty12345");
       driver.findElement(By.tagName("button")).click();
       var actualResult = driver.findElement(By.className("form-title")).getText();
       var expectedResult = "Спасибо за регистрацию!";
       Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void shoesTest()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module03/practice1/");
        driver.findElement(By.name("check")).sendKeys("34");
        driver.findElement(By.tagName("button")).click();
        var actualResult = driver.findElement(By.id("size-success")).getText();
        var expectedResult = "В нашем магазине есть обувь вашего размера";
        Assert.assertEquals(expectedResult,actualResult);
    }
}





