import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class byXpathFinalJobs03Test {
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
    public void threePracticalWordText()
    {
        driver.navigate().to("https://qajava.skillbox.ru/index.html");
        //Задание 3. XPath-локаторы для сайта книжного магазина
        //Что нужно сделать
        //Применяя правила построения хороших локаторов, составьте XPath-локаторы для следующих элементов на сайте книжного магазина:
        //https://qajava.skillbox.ru/index.html

        //1.Ссылка «О магазине» в футере.
        var theStoreElement = By.xpath("//a[@test-info='about-us']");

        //2.Заголовок «Бестселлеры».
        var bestselleryElement = By.xpath("//ul[@class='menu-main']/li/a[@href='pages/bestsellers.html']");

        //3.Строка поиска.
        var poiskElement = By.xpath("//*[@id='search-input']");

        //4.Итоговая сумма заказа в корзине.
        var korzinaElement = By.xpath("//*[@id='total']");

        //5.Заголовок «Ваш заказ: в корзине.
        var vashZakaz = By.xpath("//*[@id='total']/preceding-sibling::div");

        //6.Кнопка «Отменить» на странице поиска.
        var cancelElement = By.xpath("//*[@class='filter-button']");

    }
}
