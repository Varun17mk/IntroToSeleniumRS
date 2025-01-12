package com.RShetty.Assignments;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Assignment3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("//span[contains(text(),\" User\")]/following-sibling::span")).click();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        w.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.xpath("//select/option[@value=\"consult\"]")));
        driver.findElement(By.xpath("//select/option[@value=\"consult\"]")).click();
//        w.until(ExpectedConditions.elementToBeClickable(By.id("terms")));
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-info']"))); //Explicit wait fo 5 seconds until add elemnt is clickable

        List<WebElement> items = driver.findElements(By.cssSelector(".btn.btn-info"));

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getText());
            items.get(i).click();
        }
        driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
    }
}
