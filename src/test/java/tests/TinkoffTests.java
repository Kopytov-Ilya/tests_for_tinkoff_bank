package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import tests.data.Locale;

import java.util.List;

public class TinkoffTests extends TestBase {
    
    @MethodSource
    @Tag("MainPage, Regression")
    @ParameterizedTest(name = "Для локали {0} отображаются пункты меню {1}")
    void tinkoffMainPageShouldContainCorrectButtonsOnNavigationMenuForRuLocal(
            Locale locale,
            List<String> buttons
    ) {
        mainPage.openPage();
        mainPage.checkRuLocale(testData.navigationMenuRu);
    }


    @MethodSource
    @Tag("MainPage, Regression")
    @ParameterizedTest(name = "Для локали {0} отображаются пункты меню {1}")
    void tinkoffMainPageShouldContainCorrectButtonsOnNavigationMenuForEnLocal(
            Locale locale,
            List<String> buttons
    ) {
        mainPage.openEnPage();
        mainPage.checkEnLocale(testData.getNavigationMenuEn);
    }

    @Test
    @Tag("MainPage, Regression")
    void inRecommendedProductsShouldBeLinkOnCreditCards() {
        mainPage.openPage();
        mainPage.searchingCreditCardRecommendation(testData.card);
        mainPage.openCreditCardLink();
        mainPage.checkCreditCardPageTitle(testData.cardPageTitle);
    }

    @Test
    @Tag("MainPage, Regression")
    void inRecommendedProductsShouldBeLinkOnInvestments() {
        mainPage.openPage();
        mainPage.searchingInvestRecommendation(testData.invest);
        mainPage.openInvestLink();
        mainPage.checkInvestTitle(testData.investPageTitle);
    }

    @Test
    @Tag("MainPage, Regression")
    void inRecommendedProductsShouldBeLinkOnOsago() {
        mainPage.openPage();
        mainPage.searchingOsagoRecommendation(testData.osago);
        mainPage.openOsagoLink();
        mainPage.checkOsagoTitle(testData.osagoPageTitle);
    }

    @Test
    @Tag("MainPage, Regression")
    void inRecommendedProductsShouldBeLinkOnSim() {
        mainPage.openPage();
        mainPage.searchingSimRecommendation(testData.sim);
        mainPage.openSimLink();
        mainPage.checkSimTitle(testData.simPageTitle);
    }

    @Test
    @Tag("MainPage, Regression")
    void inRecommendedProductsShouldBeLinkOnDeposit() {
        mainPage.openPage();
        mainPage.searchingDepositRecommendation(testData.deposit);
        mainPage.openDepositeLink();
        mainPage.checkDepositeTitle(testData.depositPageTitle);
    }

    @Test
    @Tag("Deposite, Regression")
    void depositCalculatorWorksCorrectly() {
        depositPage.openDepositePage(testData.depositePageLink);
        depositPage.enterAmount(testData.amount);
        depositPage.enterPeriod(testData.period);
        depositPage.turnOffLeavePercentCheckbox();
        depositPage.checkTotalSum(testData.totalSum);
    }

    @Disabled
    @Test
    @Tag("Career, Regression")
    void correctFillingOfVacancyForm() {
        careerPage.openCareerPage(testData.careerPageLink);
        careerPage.setFio(testData.fio);
        careerPage.setCity(testData.city);
        careerPage.setEmail(testData.email);
        careerPage.setPhoneNumber(testData.phoneNumber);
        careerPage.uploadResume(testData.resume);
        //careerPage.approveConditions();
        careerPage.sendForm();
    }
}

