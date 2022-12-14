package org.tests;

//import io.github.bonigarcia.wdm.config.WebDriverManagerException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Variables {
//    WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();
    WebElement textbox = null, india_suggest_dropdown = null;
    String india_text = null;
    Assertion assertion = new Assertion();

    Duration time = Duration. ofSeconds(10);


    WebDriverWait wait = new WebDriverWait(driver,time);
    //Adding comment for Git Learning
}
