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
        var shop121Locator = By.cssSelector("footer > div:first-child > a");
        var shop122locator = By.cssSelector("footer > div:nth-child(2) > a");
        var shop123Locator = By.cssSelector("footer > div:last-child > a");
        
        //1.3 https://qajava.skillbox.ru/search.html
        //Локатор на странице поиска для всех элементов с тегом option и с атрибутом selected. Осуществите поиск только по атрибуту selected. 
        var shop131Locator = By.cssSelector("option[selected]:first-child");
        var shop132Locator = By.cssSelector("option[selected]:last-child");
        
        //1.4 https://qajava.skillbox.ru/index.html
        //Локатор на главной странице для элемента <div class="book-price">. Осуществите поиск одновременно по тегу и классу, равному book-price.
        var shop141Locator = By.cssSelector("img[src='./img/book1.jpg'] ~ div[class='book-price']");
        var shop142Locator = By.cssSelector("img[src='./img/book2.jpg'] ~ div[class='book-price']");
        var shop143Locator = By.cssSelector("img[src='./img/book3.jpg'] ~ div[class='book-price']");
        var shop144Locator = By.cssSelector("img[src='./img/book4.jpg'] ~ div[class='book-price']");
        var shop145Locator = By.cssSelector("img[src='./img/book5.jpg'] ~ div[class='book-price']");
        var shop146Locator = By.cssSelector("img[src='./img/book6.jpg'] ~ div[class='book-price']");
        var shop147Locator = By.cssSelector("img[src='./img/book7.jpg'] ~ div[class='book-price']");
        var shop148Locator = By.cssSelector("img[src='./img/book8.jpg'] ~ div[class='book-price']");
        var shop149Locator = By.cssSelector("img[src='./img/book9.jpg'] ~ div[class='book-price']");
        var shop1410Locator = By.cssSelector("img[src='./img/book10.jpg'] ~ div[class='book-price']");
        var shop1411Locator = By.cssSelector("img[src='./img/book11.jpg'] ~ div[class='book-price']");
        var shop1412Locator = By.cssSelector("img[src='./img/book12.jpg'] ~ div[class='book-price']");
        var shop1413Locator = By.cssSelector("img[src='./img/book13.jpg'] ~ div[class='book-price']");
        var shop1414Locator = By.cssSelector("img[src='./img/book14.jpg'] ~ div[class='book-price']");
        var shop1415Locator = By.cssSelector("img[src='./img/book15.jpg'] ~ div[class='book-price']");
        
        //1.5 https://qajava.skillbox.ru/index.html
        //Локатор на главной странице  для всех элементов с тегом button и с атрибутом class, начинающимся на book.
        var shop151Locator = By.cssSelector("img[src='./img/book1.jpg'] ~ div.book-price > button.book-add");
        var shop152Locator = By.cssSelector("img[src='./img/book2.jpg'] ~ div.book-price > button.book-add");
        var shop153Locator = By.cssSelector("img[src='./img/book3.jpg'] ~ div.book-price > button.book-add");
        var shop154Locator = By.cssSelector("img[src='./img/book4.jpg'] ~ div.book-price > button.book-add");
        var shop155Locator = By.cssSelector("img[src='./img/book5.jpg'] ~ div.book-price > button.book-add");
        var shop156Locator = By.cssSelector("img[src='./img/book6.jpg'] ~ div.book-price > button.book-add");
        var shop157Locator = By.cssSelector("img[src='./img/book7.jpg'] ~ div.book-price > button.book-add");
        var shop158Locator = By.cssSelector("img[src='./img/book8.jpg'] ~ div.book-price > button.book-add");
        var shop159Locator = By.cssSelector("img[src='./img/book9.jpg'] ~ div.book-price > button.book-add");
        var shop1510Locator = By.cssSelector("img[src='./img/book10.jpg'] ~ div.book-price > button.book-add");
        var shop1511Locator = By.cssSelector("img[src='./img/book11.jpg'] ~ div.book-price > button.book-add");
        var shop1512Locator = By.cssSelector("img[src='./img/book12.jpg'] ~ div.book-price > button.book-add");
        var shop1513Locator = By.cssSelector("img[src='./img/book13.jpg'] ~ div.book-price > button.book-add");
        var shop1514Locator = By.cssSelector("img[src='./img/book14.jpg'] ~ div.book-price > button.book-add");
        var shop1515Locator = By.cssSelector("img[src='./img/book15.jpg'] ~ div.book-price > button.book-add");
        
        //1.6 https://qajava.skillbox.ru/index.html
        //Локатор на главной странице для всех элементов, у которых атрибут class заканчивается на main.
        var shop161Locator = By.cssSelector("[class$='main'] :nth-child(1) > a ");
        // Книги
        var shop162Locator = By.cssSelector("[class$='main'] :nth-of-type(2) > a ");
        // Новинки
        var shop163Locator = By.cssSelector("[class$='main'] :nth-child(3) > a ");
        // Бестселлеры
        var shop164Locator = By.cssSelector("[class$='main'] :nth-child(4) > a ");
        // Доставка и оплата
        var shop165Locator = By.cssSelector("[class$='main'] :nth-child(5) > a ");
        // Корзина
        var shop166Locator = By.cssSelector("[class$='main'] :nth-child(6) > a ");
        // Контакты
        var shop167Locator = By.cssSelector("[class$='main'] :nth-child(7) > a ");
        // Поиск
        var shop168Locator = By.cssSelector("[class$='main'] :nth-child(8) > a ");
        // Поддержка
        
        //1.7 https://qajava.skillbox.ru/index.html
        //Локатор на главной странице для всех элементов с тегом a и с атрибутом class, содержащим в себе слово menu.
        var shop171Locator = By.cssSelector("a[class*='menu']:nth-child(1)");
        var shop172Locator = By.cssSelector("a[class*='menu']:nth-child(2)");
        var shop173Locator = By.cssSelector("a[class*='menu']:nth-child(3)");
        var shop174Locator = By.cssSelector("a[class*='menu']:nth-child(4)");
        var shop175Locator = By.cssSelector("a[class*='menu']:nth-child(5)");
        var shop176Locator = By.cssSelector("a[class*='menu']:nth-child(6)");
        var shop177Locator = By.cssSelector("a[class*='menu']:nth-child(7)");
        var shop178Locator = By.cssSelector("a[class*='menu']:nth-child(8)");

        //2.1 https://qajava.skillbox.ru/index.html 
        //найдите все теги div, которые являются дочерними элементами первого уровня у элемента <footer id="footer">.
        var shop211Locator = By.cssSelector("footer[id='footer'] > div:first-child");
        var shop212Locator = By.cssSelector("footer[id='footer'] > div:nth-child(2)");
        var shop213Locator = By.cssSelector("footer[id='footer'] > div:last-child");
        
        //2.2 https://qajava.skillbox.ru/index.html
        //найдите любой тег, который расположен сразу после <li id="genres">.
        var shop22Locator = By.cssSelector("li[id='genres'] > :first-child");
        
        //2.3 https://qajava.skillbox.ru/search.html 
        //найдите любые теги, которые расположены после <div class="filter-container"> (необязательно ближайший сосед).
        var shop231Locator = By.cssSelector("div[class='filter-container'] > :first-child");
        var shop232Locator = By.cssSelector("div[class='filter-container'] ~ footer");

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
        var shop342Locator = By.cssSelector("div.footer__menuList+div.footer__menuList:nth-child(2)>a:nth-of-type(1)");
        var shop343Locator = By.cssSelector("div.footer__menuList+div.footer__menuList:nth-child(3)>a:nth-of-type(1)");
        var shop344Locator = By.cssSelector("div.footer__menuList+div.footer__menuList:nth-child(4)>a:nth-of-type(1)");
        var shop345Locator = By.cssSelector("div.footer__menuList+div.footer__menuList:nth-child(5)>a:nth-of-type(1)");
        
        //3.5 https://qajava.skillbox.ru/module05/auth/index.html/ :
        //По желанию: найдите элемент с тегом <a>, который является первым дочерним элементом данного типа у своего родителя <div class="footer__menuList">, при этом <div class="footer__menuList">
        //является первым дочерним элементом у своего родителя <div class="footer__menu">. Составленный поиск должен вернуть ровно один найденный элемент.
        var shop35Locator = By.cssSelector("div.footer__menu > div.footer__menuList:first-child > a:nth-of-type(1)");
    }
}
