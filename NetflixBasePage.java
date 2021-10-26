package Clase16.pages;

import org.openqa.selenium.WebDriver;

public class NetflixBasePage {

    public WebDriver driver;

    public void maximazePage(){
        driver.manage().window().maximize();
    }

    public String tittlePage(){
        String logInTittle= driver.getTitle();
        return logInTittle;
    }

}
