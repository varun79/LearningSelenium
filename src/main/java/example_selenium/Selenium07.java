package example_selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Selenium07 {

   @Test
   public void testGetTitle()
    {
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
        driver.close();

    }

    @Test
    public void testGetCurrentURL()
    {
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");
        driver.close();
    }

    @Test
    public void testPageSource()
    {
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        Assert.assertTrue(driver.getPageSource().contains("CURA Healthcare Service"));
        driver.close();

    }

}
