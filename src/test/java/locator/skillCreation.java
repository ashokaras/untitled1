package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class skillCreation {
    WebDriver driver;

    public skillCreation(WebDriver driver) {
        this.driver = driver;
    }

    By skillButton = By.xpath("//div[@class='buttons-container']//button");
    By skillNameBox = By.xpath("//div[@class='expanding-textarea active ']//textarea");
    By skillDiscriptionBox = By.xpath("//div[@class='expanding-textarea active input-item description']//textarea");
    By skillImage = By.xpath("//div[@class='img-ctr']//div[1]");
    By createButton = By.xpath("//div[@class='button-container text-center']//button[@class='app-button    action text-uppercase']");


    public void clickCreateSkill() {
        WebElement createSkillButton = driver.findElement(skillButton);
        createSkillButton.click();
    }

    public void enterSkillName(String skName) {
        WebElement skillname = driver.findElement(skillNameBox);
        skillname.sendKeys(skName);
    }

    public void enterSkillDiscription(String skDis) {
        WebElement skillDiscription = driver.findElement(skillDiscriptionBox);
        skillDiscription.sendKeys(skDis);

    }

    public void selectImage() {
        WebElement image = driver.findElement(skillImage);
        image.click();
    }

    public void createSkill() {
        WebElement clickCreate = driver.findElement(createButton);
        clickCreate.click();
    }

    public void openCreatedSkill(String sName) {
        WebElement clickProgram = driver.findElement(By.xpath("//div[@class='new-corp-skill-item-container trainer-listing new-trainer-listing non-hover-card flip-card-front ']//div[@class='skill-content corp-content-section']//div[@title='"+sName+"']"));
        clickProgram.click();
    }

}