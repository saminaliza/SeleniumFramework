package home;

import common.CommonAPI;
import org.openqa.selenium.By;

public class HomePage extends CommonAPI {
    public void browserLogin(String id, String password) {
        driver.findElement(By.xpath("//*[@id=\"header-profile-menu\"]")).click();
        driver.findElement(By.name("username")).sendKeys(id);
        driver.findElement(By.name("signin")).click();
        driver.findElement(By.cssSelector("input[class='password']")).sendKeys(password);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    public void yahooMailLogIn(String email, String password) {
        driver.findElement(By.xpath("//*[@id=\"header-mail-button\"]/span")).click();
        driver.findElement(By.name("username")).sendKeys(email);
        driver.findElement(By.name("signin")).click();
        driver.findElement(By.cssSelector("input[class='password']")).sendKeys(password);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    public void Search(String name) {
        driver.findElement(By.name("p")).sendKeys(name);
        driver.findElement(By.id("header-desktop-search-button")).click();
    }

    public void searchInNews(String news) {
        driver.findElement(By.xpath("//*[@id=\"header-nav-bar\"]/li[2]/a")).click();
        driver.findElement(By.name("p")).sendKeys(news);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    public void searchInFinance(String finance) {
        driver.findElement(By.xpath("//*[@id=\"header-nav-bar\"]/li[3]/a")).click();
        driver.findElement(By.id("yfin-usr-qry")).sendKeys(finance);
        //driver.findElement(By.id("header-desktop-search-button")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();

    }

    public void searchInSports(String name) {
        driver.findElement(By.xpath("//*[@id=\"header-nav-bar\"]/li[4]/a")).click();
        driver.findElement(By.name("p")).sendKeys(name);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    public void searchInEntertainment(String name) {
        driver.findElement(By.xpath("//*[@id=\"header-nav-bar\"]/li[6]/a")).click();
        driver.findElement(By.name("p")).sendKeys(name);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    public void searchInLifestyle(String topic) {
        driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[1]/div[2]/ul/li[7]/a"));
        driver.findElement(By.name("p")).sendKeys(topic);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    public void searchInShopping(String item) {
        driver.findElement(By.xpath("//*[@id=\"header-nav-bar\"]/li[8]/a"));
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys(item);
        //driver.findElement(By.name("p")).sendKeys(item);
        driver.findElement(By.cssSelector("button[type='submit']")).click();

    }

    public void clickOnLogo() {
        driver.findElement(By.xpath("//*[@id=\"header-logo\"]/img")).click();
    }
}
