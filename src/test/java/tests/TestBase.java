package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.CareerPage;
import pages.DepositPage;
import pages.MainPage;
import helpers.Attach;

import tests.data.TestData;

public class TestBase {

    TestData testData = new TestData();
    CareerPage careerPage = new CareerPage();
    DepositPage depositPage = new DepositPage();
    MainPage mainPage = new MainPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://www.tinkoff.ru/";
        Configuration.browserSize = System.getProperty("resolution", "1920x1080");
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("version", "100.0");
        Configuration.remote = System.getProperty("remote");
        Configuration.holdBrowserOpen = true;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    public void beforeEach() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }

}