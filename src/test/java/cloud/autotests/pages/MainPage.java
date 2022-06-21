package cloud.autotests.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byAttribute;

public class MainPage {
    // locators
    SelenideElement mainPageSearchField = $("#searchInput"),
                    deliveryButton = $(".simple-menu__link.j-wba-header-item[href='/services/besplatnaya-dostavka?desktop=1']"),
                    sellOnWbButton = $(".simple-menu__link.simple-menu__link--sell-on-wb.j-wba-header-item"),
                    workAtWbButton = $(".simple-menu__link.simple-menu__link--employment.j-wba-header-item"),
                    reportProblemButton = $(".btn-chat__text");
    ElementsCollection itemCard = $$(".product-card__brand-name");


    public void searchItem(String productName) {
        mainPageSearchField.setValue(productName).pressEnter();
    }
    public void chekItem(String productName) {
        itemCard.findBy(text(productName)).shouldBe(visible);
    }
    public void checkDeliveryButton() { deliveryButton.shouldBe(visible); }
    public void checkSellOnWbButton() { sellOnWbButton.shouldBe(visible); }
    public void checkWorkAtWbButton() { workAtWbButton.shouldBe(visible); }
    public void checkReportProblemButton() { reportProblemButton.shouldBe(visible); }

}
