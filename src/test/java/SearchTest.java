import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class SearchTest {

//achie
    @Test
    void SearchJunit5CodeOnGithub() {
        open("https://github.com/");//Открытие гитхаба
        $x("//span[@class='flex-1']").click();//Нажатие на поисковую строку
        $x("//input[@id='query-builder-test']").setValue("selenide").pressEnter();//Ввод запроса "selenide"
        $x("//a[@class='prc-Link-Link-85e08']").click();//Вход в репозиторий
        $x("//a[@id='wiki-tab']").click();//Вход в wiki
        $x("//button[contains(@class,'js-wiki-more-pages')]").scrollIntoView(true);//Поиск кнопки "Show ... more pages"
        $x("//button[contains(@class,'js-wiki-more-pages')]").click();//Нажатие на кнопку "Show ... more pages"
        $x("//div[@class='wiki-rightbar']").shouldHave(text("SoftAssertions"));//Поиск раздела "Soft Assertions"
        $x("//div[@class='wiki-rightbar']").$(byText("SoftAssertions")).click();//Вход в "Soft Assertions"
        $x("//div[@class='markdown-body']").shouldHave(text("3. Using JUnit5 extend test class:"));//Проверка, что в разделе есть пример кода для JUnit5

        sleep(3000);
    }
}
