import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class byXpachFinalJobs02Test {

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
    public void twoPracticalWordTest()
    {
        driver.navigate().to("https://qa.skillbox.ru/module16/maincatalog/");
        //Задание 2. XPath-локаторы для сайта онлайн-института
        //Что нужно сделать
        //Для сайта онлайн-института составьте XPath-локаторы следующих элементов:
        //https://qa.skillbox.ru/module16/maincatalog/

        //1.Заголовок пятого курса.
        var zagolovokElement  = By.xpath("(//*[@class='baseCard__title'])[5]");

        //2.Элемент с учебным периодом последнего курса.
        var elementLastWell = By.xpath("(//p)[24]");

        //3.Необязательное задание. Все div, которые являются непосредственными родителями для ссылок с href='#'.
        var divElement = By.xpath("//a[@href='#']/parent::div");

        //4.Необязательное задание. Преобразуйте предыдущий локатор, чтобы он возвращал пятый элемент
        var previousElement = By.xpath("(//a[@href='#']/parent::div)[5]");

        //5.Необязательное задание. Все родительские элементы заголовка «Все курсы».
        var allCoursesElement = By.xpath("//div[@class='pageCreate__title']/following-sibling::div");

    }
}
