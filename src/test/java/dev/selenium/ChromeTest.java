package dev.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeTest{

 ChromeDriver driver;

 @Test  
 public void test(){
    ChromeOptions options = new ChromeOptions();
    driver = new ChromeDriver(options);
 }

}