package March2021;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelector extends UtilsPage{



    public void setUpBrowser()

    {


        String browser = getProperty("browser");

        if(browser.equalsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDriver\\chromedriver88.exe");

            driver = new ChromeDriver();

        }else if(browser.equalsIgnoreCase("firefox")){

            System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowserDriver\\geckodriver.exe");

            driver = new FirefoxDriver();

        }else if(browser.equalsIgnoreCase("ie")){

            System.setProperty("webdriver.ie.driver","src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");

            driver = new InternetExplorerDriver();


        }}}
