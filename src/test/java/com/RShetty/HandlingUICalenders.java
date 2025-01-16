package com.RShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.internal.Yaml;

import java.util.List;

public class HandlingUICalenders {
    public static void main(String[] args) throws InterruptedException {
        String Month = "10";
        String Day = "23";
        String Year = "2027";

        String[] expectedDate= {Month,Day,Year};

        //Selecting Date,Month and Year in Calender
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.cssSelector(".react-date-picker__calendar-button__icon")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
        driver.findElement(By.xpath("//button[text()='"+Year+"']")).click();
        driver.findElements(By.cssSelector(".react-calendar__tile")).get(Integer.parseInt(Month)-1).click();
        driver.findElement(By.xpath("//abbr[text()='"+Day+"']")).click();

       List<WebElement> actualList= driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

        for (int i = 0; i < actualList.size(); i++) {
            System.out.println(actualList.get(i).getDomAttribute("value"));
            Assert.assertEquals(actualList.get(i).getDomAttribute("value"),expectedDate[i]);
        }

        driver.close();

    }
}
