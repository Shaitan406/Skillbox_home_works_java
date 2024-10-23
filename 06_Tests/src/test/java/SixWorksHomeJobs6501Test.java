import javax.swing.text.html.CSS;

1.(6.5) Составьте такой CSS-локатор, по которому бы находились все элементы,
    отмеченные записью <!-- Нужен этот элемент -->.

    1.a.

    <section class="header">
    <h1>Ежедневник</h1>
    <div>
a.        <p>На текущий год</p> <!-- Нужен этот элемент -->
   </div>
b. <p>Первая запись</p> <!-- Нужен этот элемент -->
c. <p>Вторая запись</p>  <!-- Нужен этот элемент -->
</section>

    a.$$("section.header > div:first-child > p ")
    b.$$("section.header > div:last-child > p:nth-child(1)")
    c.$$("section.header > div:last-child > p:nth-child(2)")


    2.b.

    <section>
    <h1>Ежедневник</h1>
    <main>
        <div class="mainText text" name="mainBlock">
a.            <a href='#'>Посмотреть за предыдущий год</a><!-- Нужен этот элемент -->
        </div>
    </main>
    <div class="text">
b.        <a href='#'>На текущий год</a> <!-- Нужен этот элемент -->
        <div>
            <a href='#'>Ещё ранее</a>
        </div>
    </div>
<p>Первая запись</p>
<p>Вторая запись</p>
</section>

    a.$$("main > div.mainText.text > a[href='#']")
    b.$$("div.text > :first-child")


    3.c.

    <section>
    <h1>Ежедневник</h1>
    <div class="text">
        <div class="header" name="headerName">
            <a href='#'>Посмотреть за предыдущий год</a>
        </div>
    </div>
    <div class="text">
a.      <a href='#'>На текущий год</a> <!-- Нужен этот элемент -->
        <div>
            <a href='#'>Ещё записи...</a>
        </div>
    </div>
    <div class="text">
        <a href='#'>За прошлый год</a>
        <div>
            <a href='#'>Ещё записи...</a>
        </div>
    </div>
<p>Первая запись</p>
<p>Вторая запись</p>
</section>

    a.$$("section > div.text:nth-child(2) > :fitst-child")