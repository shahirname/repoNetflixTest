package Clase16.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NetflixMainPage extends NetflixBasePage{


    public NetflixMainPage(WebDriver remoteDriver){
        this.driver=remoteDriver;
    }

    public void maximazePage(){
        driver.manage().window().maximize();
    }

    public String tittlePage(){
       String mainTittle= driver.getTitle();
       return mainTittle;
    }

    public void goToLogInPage(){
        WebElement logInLink= driver.findElement(By.xpath("//*[@href='/login']"));
        logInLink.click();
        NetflixLogInPage nextPage=new NetflixLogInPage(driver);
    }
}
