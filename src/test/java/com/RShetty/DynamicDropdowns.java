package com.RShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdowns {
    public static void main(String[] args) throws InterruptedException {

        //Handling Dynamic dropdowns

        //Invoke the browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //Locating and Clicking on dropdown
        driver.findElement(By.xpath("//input[@name =\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
        Thread.sleep(2000);
        // Locating and Clicking the City Delhi from Dropdown
        driver.findElement(By.xpath("//a[@text = \"Delhi (DEL)\"]")).click();

        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        Thread.sleep(2000);
        // Xpath With index
//        driver.findElement(By.xpath("(//a[@text='Bengaluru (BLR)'])[2]")).click();

        //Xpath without index, using parent child xpath traverse
        driver.findElement(By.xpath("//div[@id = 'ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
    }
}
