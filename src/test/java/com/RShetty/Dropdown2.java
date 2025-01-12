package com.RShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Dropdown2 {
    public static void main(String[] args) throws InterruptedException {
        //Invoke the browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // Locating dropdown element
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);

        // Click on 5 adults from dropdown
        // Designing for loop to click the ad button 4 times
        for (int i=1; i<5;i++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // To validate if 4 adults are added\
        driver.findElement(By.id("btnclosepaxoption")).click();
    }
}
