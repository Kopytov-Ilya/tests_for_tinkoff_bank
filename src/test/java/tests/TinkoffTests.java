package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import tests.data.Locale;

import java.util.List;

import static io.qameta.allure.Allure.step;

public class TinkoffTests extends TestBase {

    @MethodSource
    @Tag("MainPage, Regression")
    @Feature("Главная страница")
    @Story("Наполнение контента")
    @Owner("Kopytov-Ilya")
    @Severity(SeverityLevel.CRITICAL)
    @Link(value = "TinkoffBank", url = "https://www.tinkoff.ru/")
    @ParameterizedTest(name = "Для локали {0} отображаются пункты меню {1}")
    public void tinkoffMainPageShouldContainCorrectButtonsOnNavigationMenuForRuLocal(
            Locale locale,
            List<String> buttons
    ) {
        step("Открываем главную страницу ", () -> {
            mainPage.openPage();
        });
        step("Проверяем содержание навигационной строки ", () -> {
            mainPage.checkRuLocale(testData.navigationMenuRu);
        });
    }


    @MethodSource
    @Tag("MainPage, Regression")
    @Feature("Главная страница")
    @Story("Наполнение контента")
    @Owner("Kopytov-Ilya")
    @Severity(SeverityLevel.CRITICAL)
    @Link(value = "TinkoffBank", url = "https://www.tinkoff.ru/")
    @ParameterizedTest(name = "Для локали {0} отображаются пункты меню {1}")
    void tinkoffMainPageShouldContainCorrectButtonsOnNavigationMenuForEnLocal(
            Locale locale,
            List<String> buttons
    ) {
        step("Открываем главную страницу En локали ", () -> {
            mainPage.openEnPage();
        });
        step("Проверяем содержание навигационной строки ", () -> {
            mainPage.checkEnLocale(testData.getNavigationMenuEn);
        });
    }

    @Test
    @Tag("MainPage, Regression")
    @Feature("Главная страница")
    @Story("Наполнение контента")
    @Owner("Kopytov-Ilya")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "TinkoffBank", url = "https://www.tinkoff.ru/")
    void inRecommendedProductsShouldBeLinkOnCreditCards() {
        step("Открываем главную страницу ", () -> {
            mainPage.openPage();
        });
        step("Ищем в рекомендациях " + testData.card, () -> {
            mainPage.searchingCreditCardRecommendation(testData.card);
        });
        step("Переходим к рекомендации ", () -> {
            mainPage.openCreditCardLink();
        });
        step("Проверяем, что заголовок открытой страницы " + testData.cardPageTitle, () -> {
            mainPage.checkCreditCardPageTitle(testData.cardPageTitle);
        });
    }

    @Test
    @Tag("MainPage, Regression")
    @Feature("Главная страница")
    @Story("Наполнение контента")
    @Owner("Kopytov-Ilya")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "TinkoffBank", url = "https://www.tinkoff.ru/")
    void inRecommendedProductsShouldBeLinkOnInvestments() {
        step("Открываем главную страницу ", () -> {
            mainPage.openPage();
        });
        step("Ищем в рекомендациях " + testData.invest, () -> {
            mainPage.searchingInvestRecommendation(testData.invest);
        });
        step("Переходим к рекомендации ", () -> {
            mainPage.openInvestLink();
        });
        step("Проверяем, что заголовок открытой страницы " + testData.investPageTitle, () -> {
            mainPage.checkInvestTitle(testData.investPageTitle);
        });
    }

    @Test
    @Tag("MainPage, Regression")
    @Feature("Главная страница")
    @Story("Наполнение контента")
    @Owner("Kopytov-Ilya")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "TinkoffBank", url = "https://www.tinkoff.ru/")
    void inRecommendedProductsShouldBeLinkOnOsago() {
        step("Открываем главную страницу ", () -> {
            mainPage.openPage();
        });
        step("Ищем в рекомендациях " + testData.osago, () -> {
            mainPage.searchingOsagoRecommendation(testData.osago);
        });
        step("Переходим к рекомендации ", () -> {
            mainPage.openOsagoLink();
        });
        step("Проверяем, что заголовок открытой страницы " + testData.osagoPageTitle, () -> {
            mainPage.checkOsagoTitle(testData.osagoPageTitle);
        });
    }

    @Test
    @Tag("MainPage, Regression")
    @Feature("Главная страница")
    @Story("Наполнение контента")
    @Owner("Kopytov-Ilya")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "TinkoffBank", url = "https://www.tinkoff.ru/")
    void inRecommendedProductsShouldBeLinkOnSim() {
        step("Открываем главную страницу ", () -> {
            mainPage.openPage();
        });
        step("Ищем в рекомендациях " + testData.sim, () -> {
            mainPage.searchingOsagoRecommendation(testData.sim);
        });
        step("Переходим к рекомендации ", () -> {
            mainPage.openSimLink();
        });
        step("Проверяем, что заголовок открытой страницы " + testData.simPageTitle, () -> {
            mainPage.checkSimTitle(testData.simPageTitle);
        });
    }

    @Test
    @Tag("MainPage, Regression")
    @Feature("Главная страница")
    @Story("Наполнение контента")
    @Owner("Kopytov-Ilya")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "TinkoffBank", url = "https://www.tinkoff.ru/")
    void inRecommendedProductsShouldBeLinkOnDeposit() {
        step("Открываем главную страницу ", () -> {
            mainPage.openPage();
        });
        step("Ищем в рекомендациях " + testData.deposit, () -> {
            mainPage.searchingDepositRecommendation(testData.deposit);
        });
        step("Переходим к рекомендации ", () -> {
            mainPage.openDepositeLink();
        });
        step("Проверяем, что заголовок открытой страницы " + testData.depositPageTitle, () -> {
            mainPage.checkDepositeTitle(testData.depositPageTitle);
        });
    }

    @Test
    @Tag("Deposit, Regression")
    @Feature("Калькулятор вклада")
    @Story("Проверка расчета")
    @Owner("Kopytov-Ilya")
    @Severity(SeverityLevel.CRITICAL)
    @Link(value = "TinkoffBank", url = "https://www.tinkoff.ru/")
    void depositCalculatorWorksCorrectly() {
        step("Открываем страницу вклада", () -> {
            depositPage.openDepositePage(testData.depositePageLink);
        });
        step("Вводим сумму вклада" + testData.amount + "руб", () -> {
            depositPage.enterAmount(testData.amount);
        });
        step("Вводим срок вклада " + testData.period + "мес.",() -> {
            depositPage.enterPeriod(testData.period);
        });
        step("Убираем чекбокс 'Оставлять проценты' ", () -> {
            depositPage.turnOffLeavePercentCheckbox();
        });
        step("Проверяем, что итоговая сумма ровна " + testData.totalSum + "руб",() -> {
            depositPage.checkTotalSum(testData.totalSum);
        });
    }

    @Disabled
    @Test
    @Tag("Career, Regression")
    @Feature("Карьера в Тинькофф")
    @Story("Заполнение формы")
    @Owner("Kopytov-Ilya")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "TinkoffBank", url = "https://www.tinkoff.ru/")
    void correctFillingOfVacancyForm() {
        step("Открываем страницу с вакансией", () -> {
            careerPage.openCareerPage(testData.careerPageLink);
        });
        step("Вводим ФИО" + testData.fio, () -> {
            careerPage.setFio(testData.fio);
        });
        step("Выбираем город " + testData.city,() -> {
            careerPage.setCity(testData.city);
        });
        step("Вводим email " + testData.email, () -> {
            careerPage.setEmail(testData.email);
        });
        step("Вводим телефонный номер " + testData.phoneNumber,() -> {
            careerPage.setPhoneNumber(testData.phoneNumber);
        });
        step("Загружаем резюме " + testData.resume,() -> {
            careerPage.uploadResume(testData.resume);
        });
        step("Соглашаемся с условиями ",() -> {
            //careerPage.approveConditions();
        });
        step("Отправляем форму ",() -> {
            careerPage.sendForm();
        });
    }
}

