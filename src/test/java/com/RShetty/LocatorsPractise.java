package com.RShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsPractise {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Varun"); //by Id
        driver.findElement(By.name("inputPassword")).sendKeys("Heybsj"); //by name
        driver.findElement(By.className("signInBtn")).click(); // by classname

        // Locating error text
       String t1 = driver.findElement(By.cssSelector("p.error")).getText();
        System.out.println(t1);

        driver.findElement(By.linkText("Forgot your password?")).click();

        // Xpath
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Varun");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("kjshgjkh");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456");

        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());

        driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Varun");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();


    }
}
