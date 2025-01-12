package com.RShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.sql.Driver;
import java.time.Duration;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {
        String name = "Varun";
        WebDriver driver = new ChromeDriver();
        String GotPassword =  getPassword(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Varun"); //by Id
        driver.findElement(By.name("inputPassword")).sendKeys(GotPassword); //by name
        driver.findElement(By.className("signInBtn")).click(); // by classname
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

        // by tagname
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+",");

        // Xpath to locate text on HTML page if it is not anchor tag, //tagname[text()= "String"]
        driver.findElement(By.xpath("//button[text() = 'Log Out']")).click();
        driver.close();
    }
    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
        String getText=  driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
        String[] StringArray1= getText.split("'");
//       String FinalPassword= StringArray1[1].split(",")[0]; simple yet redundant for new variable

        return StringArray1[1].split("'")[0] ;
    }
}


