import javax.swing.text.html.CSS;

1.(6.5) Составьте такой CSS-локатор, по которому бы находились все элементы,
    отмеченные записью <!-- Нужен этот элемент -->.

    1.a.

    <section class="header">
    <h1>Ежедневник</h1>
    <div>
        <p>На текущий год</p> <!-- Нужен этот элемент -->
   </div>
   <p>Первая запись</p> <!-- Нужен этот элемент -->
   <p>Вторая запись</p>  <!-- Нужен этот элемент -->
</section>

    Локатор: $$("p")


    2.b.

    <section>
    <h1>Ежедневник</h1>
    <main>
        <div class="mainText text" name="mainBlock">
           <a href='#'>Посмотреть за предыдущий год</a><!-- Нужен этот элемент -->
        </div>
    </main>
    <div class="text">
        <a href='#'>На текущий год</a> <!-- Нужен этот элемент -->
        <div>
            <a href='#'>Ещё ранее</a>
        </div>
    </div>
    <p>Первая запись</p>
    <p>Вторая запись</p>
</section>

    Локатор: $$(".text > a")


    3.c.

    <section>
    <h1>Ежедневник</h1>
    <div class="text">
        <div class="header" name="headerName">
            <a href='#'>Посмотреть за предыдущий год</a>
        </div>
    </div>
    <div class="text">
        <a href='#'>На текущий год</a> <!-- Нужен этот элемент -->
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

    Локатор: $$("div:nth-child(3) > a")
