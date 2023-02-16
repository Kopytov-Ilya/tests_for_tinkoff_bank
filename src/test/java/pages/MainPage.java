package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    String MainPageEnUrl = "https://tinkoff-group.com/";

    private ElementsCollection
            navigationMenu = $$("[data-qa-type='uikit/navigation.menu']"),
            recommendationField = $$("[data-test='atom-container']");

    private SelenideElement
            creditCardLink = $("a[href*='tinkoff-platinum']"),
            investLink = $("a[href*='invest/account']"),
            simLink = $("a[href*='mobile-operator']"),
            depositLink = $("a[href*='deposit']"),
            osagoLink = $("a[href*='osago']"),
            title = $("[data-test='htmlTag title']");


    public MainPage openPage() {
        open(baseUrl);

        return this;
    }

    public MainPage checkRuLocale(String value) {
        navigationMenu.contains(texts(value));

        return this;
    }

    public MainPage openEnPage() {
        open(MainPageEnUrl);

        return this;
    }

    public MainPage checkEnLocale(String value) {
        navigationMenu.shouldHave(texts(value));

        return this;
    }

    public MainPage searchingCreditCardRecommendation(String value) {
        recommendationField.findBy(text(value)).shouldBe(visible);

        return this;
    }

    public MainPage openCreditCardLink() {
        creditCardLink.click();

        return this;
    }

    public MainPage checkCreditCardPageTitle(String value) {
        title.shouldHave(text(value));

        return this;
    }

    public MainPage searchingInvestRecommendation(String value) {
        recommendationField.findBy(text(value)).shouldBe(visible);

        return this;
    }

    public MainPage openInvestLink() {
        investLink.click();

        return this;
    }

    public MainPage checkInvestTitle(String value) {
        recommendationField.findBy(text(value)).shouldBe(visible);

        return this;
    }

    public MainPage searchingOsagoRecommendation(String value) {
        recommendationField.findBy(text(value)).shouldBe(visible);

        return this;
    }

    public MainPage openOsagoLink() {
        osagoLink.click();

        return this;
    }

    public MainPage checkOsagoTitle(String value) {
        title.shouldHave(text(value));

        return this;
    }

    public MainPage searchingSimRecommendation(String value) {
        recommendationField.findBy(text(value)).shouldBe(visible);

        return this;
    }

    public MainPage openSimLink() {
        simLink.click();

        return this;
    }

    public MainPage checkSimTitle(String value) {
        title.shouldHave(text(value));

        return this;
    }

    public MainPage searchingDepositRecommendation(String value) {
        recommendationField.findBy(text(value)).shouldBe(visible);

        return this;
    }

    public MainPage openDepositeLink() {
        depositLink.click();

        return this;
    }

    public MainPage checkDepositeTitle(String value) {
        title.shouldHave(text(value));

        return this;
    }
}
