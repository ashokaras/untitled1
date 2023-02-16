package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class learnerLandingPage {
    WebDriver driver;

    public learnerLandingPage(WebDriver driver){
        this.driver=driver;
    }

    By profiledropdown=By.xpath("//div[@class='Select Select--single']");
    By logout=By.xpath("//div[text()='Logout']");
    By switchadminview=By.xpath("//div[text()='Administrator View']");
    By clickuser=By.id("userAdministration");
    public void cickprofiledropdown(){
        driver.findElement(profiledropdown).click();
    }
    public void clicklogout(){
        driver.findElement(logout).click();
    }
    public void switctoadminview(){
        driver.findElement(switchadminview).click();
    }
    public void clickusertile(WebDriver driver) {
        this.driver=driver;
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//div[@class='cards']//Div[@id='userAdministration']//div"));
        action.moveToElement(we);
       action.click().build().perform();
    }
}
