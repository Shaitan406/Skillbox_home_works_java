import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class byXpachFinalJobs01Test {
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
    public void onePracticalWordTest()
    {
      driver.navigate().to("https://qa.skillbox.ru/module19/");
      //Задание 1. XPath-локаторы для сайта домашнего кинотеатра
        //Что нужно сделать
        //Для сайта домашнего кинотеатра составьте XPath-локаторы следующих элементов:

        //1.Кнопка перехода к предыдущему объявлению в слайдере «<». <span class="da-arrows-prev"></span>
        var previousElement = By.xpath("//*[@class='da-arrows-prev']");

        //2.Кнопка «Узнать больше» в слайдере. Используйте поиск сразу по двум классам. <a href="#" class="da-link button">Узнать больше</a>
        var infoMoreButton = By.xpath("//a[@href='#' and @class='da-link button'])[3]");

        //3. Все неактивные фильтры из раздела фильмов, которые есть в онлайн-кинотеатре.
        var inactiveFiltreslocator = By.xpath("//*[@href='#noAction']");

        //4.Все элементы, у которых класс начинается на слова button.
        var ourElementsButton = By.xpath("//*[starts-with(@class,'button')]");

        //5.Кнопка «Подписаться сейчас».
        var subscribeuButtom = By.xpath("//*[@class='large-text']/following-sibling::*");

        //6.Все картинки клиентов из раздела «Наши клиенты». Для уточнения локатора используйте указание ближайшего родительского элемента с ID.
        var ourСlientsPictureslocator = By.xpath("//*[@id='clint-slider']//a");

        //7.Необязательное задание. Все элементы с ценами тарифов, следующих после тарифа «Любительский».
        var pricesTariffsLocator = By.xpath("//*[contains(@class,'price-column')]/following-sibling::div");

        //8.Необязательное задание. Все поля для ввода в форме «Скажите “Привет”», которые предшествуют полю «* Текст сообщения».
        var sayHiLoctor = By.xpath("//div[@class='controls']//preceding-sibling::input");
    }
}
