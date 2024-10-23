import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SixWorksHomeJobs6502Test {
    private WebDriver driver;
    @Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void twoSixWorksTest(){
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module04/practice1/");
        //1.Найдите тег input, у которого нет атрибута id.
        var tegNotId = By.cssSelector("input:not([id]");

        //2.Найдите все теги p, у которых одновременно выполняются два условия:
        // class начинается на слово form;
        // class НЕ заканчивается на слово error.
        var tegTwoConditions = By.cssSelector("p[class^='form']:not([class$=error]");

        //3.Найдите <div class="form-inner">, у него найдите первый по счёту элемент такого типа: <p class="form-row">.
        var divFormInner = By.cssSelector("div.form-inner p.form-row:first-child");
    }
}
