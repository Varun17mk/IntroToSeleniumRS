package com.RShetty.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_NestedFrames {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Nested Frames")).click();
//        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
        driver.switchTo().frame("frame-top");
//        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
        driver.switchTo().frame("frame-middle");
        //Getting the text written in frame asked
        System.out.println(driver.findElement(By.cssSelector("#content")).getText());
    }
}
