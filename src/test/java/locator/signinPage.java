package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signinPage {
    WebDriver driver;
public signinPage(WebDriver driver){
    this.driver=driver;
}
By inputbox=By.xpath("//input[@type='text']");
By passwordbox=By.xpath("//input[@type='password']");
By clickbutton=By.xpath("//*[@class='signin-button-ctr ']");


public void userName (String uname )  {


            WebElement search = driver.findElement(inputbox);
            search.sendKeys(uname);


          }
          public void passWord(String passcode){
              WebElement pwd= driver.findElement(passwordbox);
              pwd.sendKeys(passcode);

          }
          public void clicklogin(){
              driver.findElement(clickbutton).click();

          }



}
