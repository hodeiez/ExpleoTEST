package com.hodei.expleo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

/**
 * Created by Hodei Eceiza
 * Date: 3/27/2021
 * Time: 22:51
 * Project: Expleo
 * Copyright: MIT
 */
public class FindLinks {
    public static void findLinks(String url){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://"+url);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("THESE ARE THE LINKS FOUND IN "+url+" INSIDE THE TAG <a>");
        for (WebElement ele : links)
            System.out.println(ele.getAttribute("href"));
        driver.quit();
    }


}
