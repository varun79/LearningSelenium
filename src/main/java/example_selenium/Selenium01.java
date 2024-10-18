package example_selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class Selenium01 {
    public static void main(String[] args) {
        EdgeDriver driver= new EdgeDriver();
        driver.get("https://www.google.com");
    }
}
