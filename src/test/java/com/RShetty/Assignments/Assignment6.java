package com.RShetty.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Assignment6 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("checkBoxOption1")).click();
        String capturedText = driver.findElement(By.cssSelector("label[for='bmw']")).getText();
        System.out.println(capturedText);

        // DropDown with Select tag [Concept of Static dropdown]
        WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText(capturedText);

        //Passing capturedText in Alert input space
        driver.findElement(By.id("name")).sendKeys(capturedText);

        //Clicking alert button
        driver.findElement(By.id("alertbtn")).click();

        //Switching to  handle alerts which are not part of html page
        //to accept and get text on alert window
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
}
