package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CareerPage {

    private SelenideElement
            fioInputSelect = $("[data-qa-type='uikit/inputFio']"),
            fioInput = $("[name='name']"),
            fieldInputSelect = $("[data-qa-type='uikit/inputAutocomplete']"),
            cityInput = $("[name='city']"),
            cityOptionSelect = $(byText("Россия, г Санкт-Петербург")),
            emailInput = $("[name='email']"),
            numberInputSelect = $("[data-qa-type='uikit/input.inputBox']"),
            numberInput = $("[name='phone']"),
            downloadField = $("[data-qa-type='uikit/attachFile.input']"),
            approveCheckbox = $("[data-qa-type='uikit/linkCheckbox.checkbox']"),
            sendButton = $(byText("Отправить"));


    public CareerPage openCareerPage(String value) {
        open(value);

        return this;
    }

    public CareerPage setFio(String value) {
        fioInputSelect.click();
        fioInput.setValue(value);

        return this;
    }

    public CareerPage setCity(String value) {
        fieldInputSelect.click();
        cityInput.setValue(value);
        cityOptionSelect.click();

        return this;
    }

    public CareerPage setEmail(String value) {
        fieldInputSelect.click();
        emailInput.setValue(value);

        return this;
    }

    public CareerPage setPhoneNumber(String value) {
        numberInputSelect.click();
        numberInput.setValue(value);

        return this;
    }

    public CareerPage uploadResume(String value) {
        downloadField.uploadFromClasspath(value);

        return this;
    }

    public CareerPage approveConditions() {
        approveCheckbox.click();

        return this;
    }

    public CareerPage sendForm() {
        sendButton.click();

        return this;
    }
}