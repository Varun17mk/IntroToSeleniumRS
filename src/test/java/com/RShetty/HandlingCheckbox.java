package com.RShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

        //Locating and clicking Checkbox and confirming before and after clicking
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

        // Counting number of checkboxes in page
        System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());



    }
}
