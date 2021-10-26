package Clase16.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NetflixLogInPage extends NetflixBasePage{


    public NetflixLogInPage(WebDriver remoteDriver){
        this.driver=remoteDriver;
    }

    public List h1List(){
        List<WebElement>h1sList=driver.findElements(By.tagName("h1"));
        return h1sList;
    }

    public  WebElement buttonLogIn (){
        WebElement btnLoginFb= driver.findElement(By.xpath("//*[contains (text(),'Iniciar sesión con Facebook')]"));
        return btnLoginFb;
    }

    public void rememberMeBox_Clicked (){
        driver.findElement(By.xpath("//*[@class='ui-binary-input login-remember-me']")).click();
    }

    public void completeFields (){
        driver.findElement(By.xpath("//*[@name='userLoginId']")).sendKeys("xxx");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Hola mundo");
    }

    public void LogInClick (){
        driver.findElement(By.xpath("//*[@data-uia='login-submit-button']")).click();
    }

}
