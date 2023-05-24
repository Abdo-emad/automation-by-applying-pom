import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement email(){
        return driver.findElement(By.id("Email"));
    }

    public WebElement password(){
        return driver.findElement(By.id("Password"));
    }
}
