package com.RShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseEnd2end {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("Smruti Deshpande");
        driver.findElement(By.name("email")).sendKeys("fate.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("Thanks143");
        driver.findElement(By.cssSelector("input[type=\"checkbox\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select/option[2]")).click();
        driver.findElement(By.id("inlineRadio2")).click();
        driver.findElement(By.name("bday")).sendKeys("23/10/2000");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

    }
}
