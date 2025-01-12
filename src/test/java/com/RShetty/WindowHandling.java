package com.RShetty;

import com.google.j2objc.annotations.Weak;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.xpath("//a[contains(text(),'Free Access to')]")).click();

        // Getting window handles through set
       Set<String> windows =  driver.getWindowHandles(); // Stores in set in form of [ParentID, ChildId, GrandchildId..]

       //Iterating through Iterator Collection
        Iterator<String> it = windows.iterator();
        String ParentId = it.next();
        String ChildId = it.next();

        //Taking selenium to Child window.
        driver.switchTo().window(ChildId);

        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

       String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at ")[1].split(" ")[0];

       //Taking Selenium back to parent window
       driver.switchTo().window(ParentId);

       // Parsing the emailId into username box
        driver.findElement(By.id("username")).sendKeys(emailId);


    }
}
