package com.RShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestiveDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("autosuggest")).sendKeys("ind");

        Thread.sleep(3000);

        //Locate the all elements which are suggested to compare. And store them as list of WebElements.
       List<WebElement> options= driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a"));

       //Iterate over all to get desired text until u get one - here it is INDIA;
        for (WebElement option : options)
        {
            if (option.getText().equalsIgnoreCase("India"))
            {
                option.click();
                break;
            }

        }
    }
}
