import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CinemaOnline4Test {
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
    public void onlineCinema04Test1() {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        var filmElement = driver.findElement(By.tagName("input"));
        var serialElement = driver.findElement(By.name("serials"));
        var saveButtonElement = driver.findElement(By.id("save"));
        var twoButtonElement = driver.findElement(By.id("two"));
        var enterElement = driver.findElement(By.id("save"));
        var okElement = driver.findElement(By.id("ok"));
        var filmResultElement = driver.findElement(By.className("result__text"));
        var serialResultElement = driver.findElement(By.id("best_serials"));
        var film = "Железный человек";
        var serial = "Игра Престолов";
        filmElement.sendKeys(film);
        serialElement.sendKeys(serial);
        saveButtonElement.click();
        twoButtonElement.click();
        enterElement.click();
        okElement.click();
        Assert.assertEquals("Любимый фильм не найден",film,filmResultElement.getText());
        Assert.assertEquals("Любимый сериал не найден",serial,serialResultElement.getText());
    }
    @Test
    public void onlineCinema04Test2(){
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        var saveButtonElement = driver.findElement(By.id("save"));
        var twoButtonElement = driver.findElement(By.id("two"));
        var CheckboxElement = driver.findElement(By.tagName("span"));
        var radiobuttonElement = driver.findElement(By.className("fake-radiobutton"));
        var enterElement = driver.findElement(By.id("save"));
        var okElement = driver.findElement(By.id("ok"));
        var languageTextElement = driver.findElement(By.id("language"));
        var ageTextElement = driver.findElement(By.id("age"));
        var language = "С русскими субтитрами";
        var age = "10-17";
        saveButtonElement.click();
        twoButtonElement.click();
        CheckboxElement.click();
        radiobuttonElement.click();
        enterElement.click();
        okElement.click();
        Assert.assertEquals("Тип фильма не указан",language,languageTextElement.getText());
        Assert.assertEquals("Тип возраста не указан",age,ageTextElement.getText());
    }
    @Test
    public void onlineCinema04Test3() {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        var filmElement = driver.findElement(By.tagName("input"));
        var serialElement = driver.findElement(By.name("serials"));
        var saveButtonElement = driver.findElement(By.id("save"));
        var twoButtonElement = driver.findElement(By.id("two"));
        var CheckboxElement = driver.findElement(By.tagName("span"));
        var radiobuttonElement = driver.findElement(By.className("fake-radiobutton"));
        var enterElement = driver.findElement(By.id("save"));
        var okElement = driver.findElement(By.id("ok"));
        var filmResultElement = driver.findElement(By.className("result__text"));
        var serialResultElement = driver.findElement(By.id("best_serials"));
        var languageTextElement = driver.findElement(By.id("language"));
        var ageTextElement = driver.findElement(By.id("age"));
        var film = "Железный человек";
        var serial = "Игра Престолов";
        var language = "С русскими субтитрами";
        var age = "10-17";
        filmElement.sendKeys(film);
        serialElement.sendKeys(serial);
        saveButtonElement.click();
        twoButtonElement.click();
        CheckboxElement.click();
        radiobuttonElement.click();
        enterElement.click();
        okElement.click();
        Assert.assertEquals("Любимый фильм не найден",film,filmResultElement.getText());
        Assert.assertEquals("Любимый сериал не найден",serial,serialResultElement.getText());
        Assert.assertEquals("Тип фильма не указан",language,languageTextElement.getText());
        Assert.assertEquals("Тип возраста не указан",age,ageTextElement.getText());
    }
    @Test
    public void onlineCinema04Test4(){
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        var saveButtonElement = driver.findElement(By.id("save"));
        var twoButtonElement = driver.findElement(By.id("two"));
        var enterElement = driver.findElement(By.id("save"));
        var okElement = driver.findElement(By.id("ok"));
        saveButtonElement.click();
        twoButtonElement.click();
        enterElement.click();
        okElement.click();
        var resultFilmText = driver.findElement(By.id("best_films"));
        var resultSerialsText = driver.findElement(By.id("best_serials"));
        var resultLanguageFilmText = driver.findElement(By.id("language"));
        var resultAgeFilmText = driver.findElement(By.id("age"));
        Assert.assertEquals("Текст найден","",resultFilmText.getText());
        Assert.assertEquals("Текст найден","",resultSerialsText.getText());
        Assert.assertEquals("Текст найден","",resultLanguageFilmText.getText());
        Assert.assertEquals("Текст найден","",resultAgeFilmText.getText());
    }
}
