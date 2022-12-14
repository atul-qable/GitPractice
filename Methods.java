// package org.tests;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.testng.Reporter;
// import org.testng.annotations.AfterMethod;
// import org.testng.annotations.BeforeMethod;
// import org.testng.annotations.Test;
// import org.testng.annotations.Listeners;
// import org.testng.Reporter;
// import java.lang.reflect.Method;

// @Listeners(ListenerTest.class)
// public class Methods extends Variables implements WebElements{


//         //Adding comment for Git Learning
//     Method method;
//     @BeforeMethod
//     public void openUrl() {
//         log("Step : Running Button Test");
// //        Reporter.log("Step : Running Button Test");
//         System.out.println("Inside Before");
//         driver.navigate().to(url);
//         driver.manage().window().maximize();
//         String nameofCurrMethod = new Throwable()
//                 .getStackTrace()[0]
//                 .getMethodName();
//         System.out.println("Method "+nameofCurrMethod);
//     }

//     @Test (description = "Tests for Radio Buttons")
//     public void radio_buttons() {

//         log("Step : Running Button Test. Also Testing the testbo report for checking the comment section and how the visible text appears on the screen. So executing script now");
//         System.out.println("In radio_buttons");
// //        Reporter.log("Step : Running Button Test. Also Testing the testbo report for checking the comment section and how the visible text appears on the screen. So executing script now");
//         System.out.println("In radio_buttons");
//         log("Step : Searching radio_button_1");
// //        Reporter.log("Step : Searching radio_button_1");
//         WebElement button_1 = driver.findElement(By.xpath((radio_button_1_xpath)));
//         log("Step : Clicking radio_button_1");
// //        Reporter.log("Step : Clicking radio_button_1");
//         button_1.click();


//         log("Step : Searching radio_button_2"); //Added Comment for no reason
// //        Reporter.log("Step : Searching radio_button_2");
//         WebElement button_2 = driver.findElement(By.xpath((radio_button_2_xpath)));
//         log("Step : Clicking radio_button_2"); //Added Comment for no reason
// //        Reporter.log("Step : Clicking radio_button_2");
//         button_2.click();
//         log("Step : Searching radio_button_3");
// //        Reporter.log("Step : Searching radio_button_3");
//         WebElement button_3 = driver.findElement(By.xpath((radio_button_3_xpath)));
//         log("Step : Clicking radio_button_3");
// //        Reporter.log("Step : Clicking radio_button_3");
//         button_3.click();
//     }

//     @Test (description = "Tests for Suggested Text Box")
//     public void suggestion_text_box(){
//         Reporter.log("Running Test suggestion_text_box");
//         System.out.println("In suggestion_text_box");
//         Reporter.log("Step : Searching textbox");
//         textbox = driver.findElement(By.xpath(textbox_xpath));
//         textbox.clear();
//         Reporter.log("Step : Entering India");
//         textbox.sendKeys("India");
//         india_suggest_dropdown = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(india_suggest_dropdown_xpath)));
//         india_text = india_suggest_dropdown.getText();
//         assertion.assertEquals(india_text, "India");
//         india_suggest_dropdown.click();
//     }

//     @AfterMethod
//     public void closeBrowser() {
//         System.out.println("Inside After");
//         String nameofCurrMethod = new Throwable()
//                 .getStackTrace()[0]
//                 .getMethodName();
//         System.out.println("Method "+nameofCurrMethod);
//         System.out.println("*************************Output"+Reporter.getOutput());
//         driver.close();

//     }

//     public void log(String str){
//         System.out.println(str);
//     }

// }