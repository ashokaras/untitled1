package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class programCreation {

    WebDriver driver;
    public programCreation(WebDriver driver){
        this.driver=driver;
    }
    By clickCreateProgram=By.xpath("//div[@class='input-group']//button");
    By programName=By.xpath("//div[@class='expanding-textarea active ']//textarea");
    By programImage=By.xpath("//div[@class='img-ctr']//div[1]");
    By createButton=By.xpath("//div[@class='button-container program-creation text-center']//button[@class='app-button    action text-uppercase']");
    By programDiscription=By.xpath("//div[@class='expanding-textarea active input-item description']//textarea");
  // By openProgram=
    public void clickProgramCreation(){
        WebElement clickProgram=driver.findElement(clickCreateProgram);
        clickProgram.click();

    }
    public void enterProgramName(String pName){
        WebElement proName=driver.findElement(programName);
        proName.click();
        proName.clear();
        proName.sendKeys(pName);
        proName.click();
    }
    public  void enterProgramDiscription(String dis){
        WebElement proDiscription=driver.findElement(programDiscription);
        proDiscription.sendKeys(dis);

    }
    public void selectImage(){
        WebElement image=driver.findElement(programImage);
        image.click();
    }
    public  void  createProgram(){
        WebElement clickCreate=driver.findElement(createButton);
        clickCreate.click();

    }
    public void openCreatedProgram(String pname){
        WebElement clickProgram=driver.findElement(By.xpath("//div[@class='program-content corp-content-section']//div[@title='"+pname+"']"));
        clickProgram.click();
    }

}
