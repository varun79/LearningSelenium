package example_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class Selenium03 {

    @Test
    public void test01()
     {

        WebDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
        driver.quit();
    }
}
