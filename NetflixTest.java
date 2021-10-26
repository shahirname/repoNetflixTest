package Clase16.Test;

import Clase16.Utilities.Constants;
import Clase16.pages.NetflixLogInPage;
import Clase16.pages.NetflixMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class NetflixTest extends NetflixBaseTest {

    @Test (priority = 1)
    public void validarTituloTest(){

        netflixMainPage.maximazePage();

        Assert.assertEquals(netflixMainPage.tittlePage(), Constants.mainTittleExpected,Constants.errorMsgMainTittleExpected);
    }

    @Test (priority = 2)
    public void iniciarSesionPageTest (){

        String mainTittle= netflixMainPage.tittlePage();

        netflixMainPage.goToLogInPage();

        Assert.assertNotEquals(netflixLogInPage.tittlePage(),mainTittle,Constants.errorMsgComparativeTittles);

        if (netflixLogInPage.h1List().contains(Constants.h1LogInPageExpected)){
            Assert.assertTrue(true,Constants.errorMsg_H1LoginPage_Expected);
        }

        Assert.assertNotNull(netflixLogInPage.buttonLogIn(),Constants.errorMsg_btn_FB_LogIn_Expected);
    }

    @Test(priority = 3)
    public void loginToNetflixErrorTest(){

        netflixMainPage.goToLogInPage();

        netflixLogInPage.maximazePage();

        netflixLogInPage.completeFields();

        netflixLogInPage.rememberMeBox_Clicked();

        netflixLogInPage.LogInClick();




    }




}
