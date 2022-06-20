package cloud.autotests.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byAttribute;

public class MainPage {
    // locators
    SelenideElement mainPageSearchField = $("#searchInput");
    ElementsCollection itemCard = $$(".product-card__brand-name");

    public void searchItem(String productName) {
        mainPageSearchField.setValue(productName).pressEnter();
    }
    public void chekItem(String productName) {
        itemCard.findBy(text(productName)).shouldBe(visible);
    }

}
