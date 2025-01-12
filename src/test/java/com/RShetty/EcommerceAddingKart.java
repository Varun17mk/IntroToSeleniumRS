package com.RShetty;

/// Adding List of Items in cart from array of input and checking out - Amazon interview question

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class EcommerceAddingKart {
    public static void main(String[] args) throws InterruptedException {
        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Cauliflower", "Tomato"};
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  // for implicit wait
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5)); //Configuring w=5sec explicit wait
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);

        addItems(driver, itemsNeeded);

        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode"))); //explicit wait
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo"))); //explicit wait
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
    }

    public static void addItems(WebDriver driver, String[] itemsNeeded) {
        //Locating the product name to capture and click corresponding to add to cart button
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        // Converting the array to array list to compare the text from input array.
        List itemsNeededList = Arrays.asList(itemsNeeded);

        int count = 0;
        for (int i = 0; i <= products.size(); i++) //looping for all elements in
        {
            String[] names = products.get(i).getText().split(" ");

            if (itemsNeededList.contains(names[0])) {
                driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();
                count++;

                if (count == itemsNeeded.length) // to stop iterating if desired number of items are compared, located and  clicked
                {
                    break;
                }
            }

        }
    }

}
