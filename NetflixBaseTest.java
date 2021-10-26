package Clase16.Test;

import Clase16.pages.NetflixLogInPage;
import Clase16.pages.NetflixMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class NetflixBaseTest {
    public String siteUrl="https://www.netflix.com/ ";
    public WebDriver driver;
    protected NetflixMainPage netflixMainPage;
    protected NetflixLogInPage netflixLogInPage;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(siteUrl);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        netflixMainPage= new NetflixMainPage(driver);
        netflixLogInPage= new NetflixLogInPage(driver);
    }

}
