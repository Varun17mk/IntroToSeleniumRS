package com.RShetty.Assignments;

// Assignment on Windows handling

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Assignment4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.xpath("//div[@class='example']/child::a")).click();

        // Switching windows Through set
        Set<String> windowsId = driver.getWindowHandles();

        //Iterating through Iterator Collection
        Iterator<String> it = windowsId.iterator();
        String ParentId = it.next();
        String ChildId = it.next();

        driver.switchTo().window(ChildId);
        System.out.println(driver.findElement(By.xpath("//body/div/h3")).getText());

        driver.switchTo().window(ParentId);
        System.out.println(driver.findElement(By.xpath("//div/h3")).getText());


    }
}
