package example_selenium;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Selenium07 {

    @Severity(SeverityLevel.NORMAL)
    @Description("Verify the title of the Page")
   @Test
   public void testGetTitle()
    {
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
        driver.close();

    }

    @Severity(SeverityLevel.MINOR)
    @Description("Verify the Current URl of the Page")
    @Test
    public void testGetCurrentURL()
    {
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getCurrentUrl());

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");
        driver.close();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Page source of the Page")
    @Test
    public void testPageSource() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        if (driver.getPageSource().contains("CURA Healthcare Service"))
        {
            System.out.println("Verified");
            Assert.assertTrue(true);
        } else{
            Assert.assertTrue(false);
        }

    }
}
