package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws InterruptedException {

//        WebDriver driver;
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://tasks.evalartapp.com/automatization/buttons/test");
        System.setProperty("webdriver.gecko.driver","C://Program Files//Driver//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://tasks.evalartapp.com/automatization/buttons/test");
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("740670");
        driver.findElement(By.name("password")).sendKeys("10df2f32286b7120My0zLTA3NjA0Nw==30e0c83e6c29f1c3");
        driver.findElement(By.xpath("/html/body/div/div[2]/form/button")).click();
        Thread.sleep(3000);

        for (int i=0;i<144;i++){
            List<WebElement> botones = driver.findElements(By.name("button_option"));
            try{
                System.out.println(botones.get(i).getText());
                botones.get(i).click();
                Thread.sleep(5000);
            }catch (Exception e){
                System.out.println(botones.get(i).getText());
                botones.get(i).click();
                Thread.sleep(5000);
            }

        }

    }

}