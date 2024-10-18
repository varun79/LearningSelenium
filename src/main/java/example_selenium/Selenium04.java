package example_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium04 {
    public static void main(String[] args) {
        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?

        EdgeOptions eoptions=new EdgeOptions();
        eoptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(eoptions);
        driver.get("https://google.com");
    }
}
