import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopSocksLocator52Test {
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
    public void locatorTests() {
       driver.navigate().to("https://qajava.skillbox.ru/index.html");
    
        //1.1 https://qajava.skillbox.ru/index.html
        //Локаторы на главной странице для элемента <a href="" test-info="about-us">О магазине</a>. Осуществите поиск только по атрибуту test-info, равному about-us.
        var shop11Locator = By.cssSelector("[test-info='about-us']");
        
        //1.2 https://qajava.skillbox.ru/index.html
        //Локатор на главной странице для всех элементов с тегом a и с атрибутом href с пустым значением, то есть равным «».
        var shop12Locator = By.cssSelector("a[href='']");
        
        //1.3 https://qajava.skillbox.ru/search.html
        //Локатор на странице поиска для всех элементов с тегом option и с атрибутом selected. Осуществите поиск только по атрибуту selected. 
        var shop13Locator = By.cssSelector("[selected]");
        
        //1.4 https://qajava.skillbox.ru/index.html
        //Локатор на главной странице для элемента <div class="book-price">. Осуществите поиск одновременно по тегу и классу, равному book-price.
        var shop14Locator = By.cssSelector("div[class='book-price']");
        
        //1.5 https://qajava.skillbox.ru/index.html
        //Локатор на главной странице  для всех элементов с тегом button и с атрибутом class, начинающимся на book.
        var shop15Locator = By.cssSelector("button[class^='book']");
        
        //1.6 https://qajava.skillbox.ru/index.html
        //Локатор на главной странице для всех элементов, у которых атрибут class заканчивается на main.
        var shop16Locator = By.cssSelector("[class$=main]");
       
        //1.7 https://qajava.skillbox.ru/index.html
        //Локатор на главной странице для всех элементов с тегом a и с атрибутом class, содержащим в себе слово menu.
        var shop17Locator = By.cssSelector("a[class*='menu']");
        
        //2.1 https://qajava.skillbox.ru/index.html 
        //найдите все теги div, которые являются дочерними элементами первого уровня у элемента <footer id="footer">.
        var shop21Locator = By.cssSelector("footer[id=footer] > div");
        
        //2.2 https://qajava.skillbox.ru/index.html
        //найдите любой тег, который расположен сразу после <li id="genres">.
        var shop22Locator = By.cssSelector("li[id=genres] ~ li");
        
        //2.3 https://qajava.skillbox.ru/search.html 
        //найдите любые теги, которые расположены после <div class="filter-container"> (необязательно ближайший сосед).
        var shop23Locator = By.cssSelector("div.filter-container ~ footer[id=footer]");

        //3.1 https://qajava.skillbox.ru/module05/auth/index.html/ :
        //Первый тег h1, находящийся сразу на первом уровне вложенности внутри <section class="important-section-block" for="main-header-page">. Используйте поиск по первому child.
        var shop31Locator = By.cssSelector("section[class='important-section-block'][for='main-header-page']>:first-child");
        
        //3.2 https://qajava.skillbox.ru/module05/auth/index.html/ :
        //Последний тег p, находящийся сразу на первом уровне вложенности внутри <form class="form" id="login-form">. Используйте поиск по child.
        var shop32Locator = By.cssSelector("form[class='form'][id='login-form']>:last-child");
        
        //3.3 https://qajava.skillbox.ru/module05/auth/index.html/ :
        //Любой тег, который является третьим дочерним элементом первого уровня тега <body>. Используйте поиск по child.
        var shop33Locator = By.cssSelector("body >:nth-child(3)");
        
        //3.4 https://qajava.skillbox.ru/module05/auth/index.html/ :
        //Все элементы с тегом <a>, которые являются первым элементом своего родителя <div class="footer__menuList">. Используйте поиск по type.
        var shop341Locator = By.cssSelector("div.footer__menuList > [for*='buyTitle'] + a:nth-of-type(1)");
        
        //3.5 https://qajava.skillbox.ru/module05/auth/index.html/ :
        //По желанию: найдите элемент с тегом <a>, который является первым дочерним элементом данного типа у своего родителя <div class="footer__menuList">, при этом <div class="footer__menuList">
        //является первым дочерним элементом у своего родителя <div class="footer__menu">. Составленный поиск должен вернуть ровно один найденный элемент.
        var shop35Locator = By.cssSelector("div.footer__menu > div.footer__menuList:first-child > a:nth-of-type(1)");
    }
}
