import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.swing.*;
import java.security.Key;

public class LoginTest extends TestBase{
    HomePage homePage;
    LoginPage loginPage;


    @Test(dataProvider = "testdata")
    public void Login(String email , String password){
        homePage= new HomePage(driver);
        loginPage= new LoginPage(driver);
            homePage.loginButton().click();
            loginPage.email().sendKeys(email);
            loginPage.password().sendKeys(password);
            loginPage.password().sendKeys(Keys.ENTER);
    }
    @Test(priority = 2)
    public void Login2(){
      homePage=new HomePage(driver);
       loginPage= new LoginPage(driver);
      homePage.loginButton().click();
        loginPage.email().sendKeys("t1");
        loginPage.password().sendKeys("t2");
        loginPage.password().sendKeys(Keys.ENTER);
    }

    @DataProvider (name = "testdata")
    public Object [][] data(){

        Object[][]  dt =  {
                {"email" , "password"},
                {"email2" , "password2"}
        };
        return dt;
    }

}
