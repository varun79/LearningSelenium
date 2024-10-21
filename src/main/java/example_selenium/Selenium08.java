package example_selenium;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium08 {

    @Severity(SeverityLevel.NORMAL)
    @Description("Verify Account has been created Successfully")
    @Test
    public void verifyAccountCreated(){

        EdgeOptions edoptions = new EdgeOptions();
        edoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edoptions.addArguments("--start-maximized");


        WebDriver driver = new EdgeDriver(edoptions);
        driver.get("https://awesomeqa.com/ui/index.php?route=account/register");

             WebElement firstName= driver.findElement(By.id("input-firstname"));
                        firstName.sendKeys("Varun");

              WebElement lastName = driver.findElement(By.cssSelector("input#input-lastname"));
                        lastName.sendKeys("Patel");

              WebElement email= driver.findElement(By.name("email"));
                        email.sendKeys("patel26@gmail.com");
              WebElement telephone = driver.findElement(By.cssSelector("input[id='input-telephone']"));
                        telephone.sendKeys("9876543210");

              WebElement password= driver.findElement(By.id("input-password"));
                        password.sendKeys("qwerty");

              WebElement confirmPassword = driver.findElement(By.id("input-confirm"));
                        confirmPassword.sendKeys("qwerty");

              List<WebElement> subscribeNewsletter = driver. findElements(By.name("newsletter"));
                                subscribeNewsletter.get(1).click();

               WebElement agree = driver.findElement(By.name("agree"));
                                agree.click();

              WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
                                continueButton.click();

             WebElement  heading= driver.findElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']"));
             System.out.println(heading.getText());

        Assert.assertEquals(heading.getText(),"Your Account Has Been Created!");
        System.out.println("Heading matches and account is created");

        //driver.quit();
    }

}
