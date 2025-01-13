package com.RShetty;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class OpeningLinkstoNewTab_Optimised {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        //Task is to limit the scope of Webdriver to footer's 1st column[Discount coupons] only and click links present
        // and open it in new tabs and verify and capture the titles of Child tabs.


        // Optimised way of Limiting WebDriver scope to Footer section only.
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

        // Optimised way of Limiting WebDriver scope to footer's 1st column[Discount coupons] only.
        WebElement columnDriver = footerDriver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));

        //for loop to iterate on all links present in columnDriver scope

        //Click on each link and verify if all links are opening i=1
        // indicate we are not clicking on 1st link that is [0] intenionally, otherwise it will start with i=0
        for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
            String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
            Thread.sleep(3000);
        }

        // Getting window handles through set
        Set<String> windows = driver.getWindowHandles(); // Stores in set in form of [ParentID, ChildId, GrandchildId..]
        //Iterating Ids in SET through Iterator Collection
        Iterator<String> it = windows.iterator();

        while (it.hasNext())
        {
            System.out.println(driver.switchTo().window(it.next()).getTitle());
        }


    }
}
