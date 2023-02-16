package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DepositPage {

    private SelenideElement
            depositAmount = $("[name='deposit_amount']"),
            depositPeriod = $("[name='deposit_period']"),
            checkbox = $(byText("Оставлять проценты")),
            resultSum = $("[data-qa-type='uikit/sidebar.subtitle']");

    public DepositPage openDepositePage(String value) {
        open(value);

        return this;
    }

    public DepositPage enterAmount(String value) {
        depositAmount.sendKeys("\b\b\b\b\b\b\b");
        depositAmount.setValue(value).pressEnter();

        return this;
    }

    public DepositPage enterPeriod(String value) {
        depositPeriod.sendKeys("\b\b");
        depositPeriod.setValue(value).pressEnter();

        return this;
    }

    public DepositPage turnOffLeavePercentCheckbox() {
        checkbox.click();

        return this;
    }

    public DepositPage checkTotalSum(String value) {
        resultSum.shouldHave(text(value));

        return this;
    }
}
