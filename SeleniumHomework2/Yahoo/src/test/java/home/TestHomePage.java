package home;

import common.CommonAPI;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    @Test
    public void userCanSigninInTheBrowser() {
        driver.get("https://www.yahoo.com/");
        HomePage hp = new HomePage();
        hp.browserLogin("mytestmail2020@yahoo.com", "tester1234");
    }
    @Test
    public void userCanSigninIntoYahooMail() {
        driver.get("https://www.yahoo.com/");
        HomePage mail = new HomePage();
        mail.yahooMailLogIn("mytestmail2020@yahoo.com", "tester1234");
    }
    @Test
    public void userCanSearchInBrowser() {
        driver.get("https://www.yahoo.com/");
        HomePage hp1 = new HomePage();
        hp1.Search("Books by Stephen King");
    }
    @Test
    public void userCanSearchForNews() {
        driver.get("https://www.yahoo.com/");
        HomePage hp2 = new HomePage();
        hp2.searchInNews("New discovery in science");
    }
    @Test
    public void userCanSearchInFinance() {
        driver.get("https://www.yahoo.com/");
        HomePage hp3 = new HomePage();
        hp3.searchInFinance("SYF");
    }
    @Test
    public void userCanSearchInSports() {
        driver.get("https://www.yahoo.com/");
        HomePage hp4 = new HomePage();
        hp4.searchInSports("Micheal Jordan");
    }

    @Test
    public void userCanSearchInEntertainmnet() {
        driver.get("https://www.yahoo.com/");
        HomePage hp5 = new HomePage();
        hp5.searchInEntertainment("netflix this week");
    }

    @Test
    public void userCanSearchInLifestyle() {
        driver.get("https://www.yahoo.com/");
        HomePage hp6 = new HomePage();
        hp6.searchInLifestyle("military diet");
    }
    @Test
    public void userCanSearchInShopping() {
        driver.get("https://www.yahoo.com/");
        HomePage hp7 = new HomePage();
        hp7.searchInShopping("laptop backpack");
    }
    @Test
    public void userCanClickOnLogo() {
        driver.get("https://www.yahoo.com/");
        HomePage hp8 = new HomePage();
        hp8.clickOnLogo();
    }

}
