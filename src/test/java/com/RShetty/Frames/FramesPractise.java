package com.RShetty.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class FramesPractise {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        // Switching to Frame present in window, by default selenium cant locate elements in frames, hence we need to redirect the selenium to
        // Frames present in existing window

        //1. Frames locating by CSS if 1 frame is present
//        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class = 'demo-frame']")));

        // 2. Frames locating by index if multiple frames are present in window
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(0);

        // Performing Drag and drop action
        Actions a = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement destination = driver.findElement(By.id("droppable"));


        a.dragAndDrop(source, destination).build().perform();


    }
}
