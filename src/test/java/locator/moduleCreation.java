package locator;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.TreeMap;

public class moduleCreation {
    WebDriver driver;
    public moduleCreation(WebDriver driver){
        this.driver=driver;
    }
    By moduleButton = By.xpath("//div[@class='buttons-container']//button");

    By spModule=By.xpath("//div[@class='content-ctr']//div[1]");
    By liveModule=By.xpath("//div[@data-moduletype='2']//div[@class='content-ctr']//div");

    By classModule=By.xpath("//div[@data-moduletype='4']//div[@class='content-ctr']//div[1]");
    By moduleNameBox = By.xpath("//div[@class='expanding-textarea active ']//textarea");
    By moduleDiscriptionBox = By.xpath("//div[@class='required-field input-item module-description']//div[@class='expanding-textarea active ']//textarea");
    By moduleImage = By.xpath("//div[@class='img-ctr']//div[1]");
    By createButton = By.xpath("//div[@class='button-container text-center btns-view highlighted']//button[2]");
    By docAct=By.xpath("//div[@style='position: absolute; inset: 0px; overflow: scroll; margin-right: -17px; margin-bottom: -17px;']//div[1]//div[@class='selfpaced-activity-card  ']");

    By nextButton=By.xpath("//button[@class='app-button    filled-button']");
    By docAndSlideButton=By.xpath("//button[@class='app-button icon-only   move-icon']");
    By local=By.xpath("//button[@class='app-button    large-button file-source-button text-uppercase']");
    By upload=By.xpath("//button[@class='app-button    action large-button file-source-button text-uppercase']");
    By saveButton=By.xpath("//button[@class='app-button    ']");
    By saveButton2=By.xpath("//button[@class='app-button    close-icon']");
    By backNavigationButton=By.xpath("//button[@class='app-button icon-only   hierarchy-back-button back-btn trainer-back-btn']");

    public void clickCreateModule() {
        WebElement createSkillButton = driver.findElement(moduleButton);
        createSkillButton.click();
    }
    public void selectTypeofModule(String mType){
        if(mType.equals("SelfPacedModule")) {
            WebElement SP = driver.findElement(spModule);
            SP.click();
        } else if (mType.equals("liveModule")) {
            WebElement live = driver.findElement(liveModule);
            live.click();

        }else if (mType.equals("classRoom")) {
            WebElement classRoom = driver.findElement(classModule);
            classRoom.click();
        }
    }
    public void enterModuleName(String skName) {
        WebElement skillname = driver.findElement(moduleNameBox);
        skillname.sendKeys(skName);
    }

    public void enterModuleDiscription(String skDis) {
        WebElement skillDiscription = driver.findElement(moduleDiscriptionBox);
        skillDiscription.sendKeys(skDis);

    }

    public void selectImage() {
        WebElement image = driver.findElement(moduleImage);
        image.click();
    }

    public void createModule() {
        WebElement clickCreate = driver.findElement(createButton);
        clickCreate.click();
    }

    public void actCreation(String mType) throws InterruptedException, AWTException {
        if(mType.equals("SelfPacedModule")){
            WebElement doc=driver.findElement(docAct);
            doc.click();

            WebElement next=driver.findElement(nextButton);
            next.click();
            Thread.sleep(3000);

            WebElement docTile=driver.findElement(docAndSlideButton);
            docTile.click();

            WebElement loaclDisk=driver.findElement(local);
            loaclDisk.click();

            //upload document
            Thread.sleep(3000);
            StringSelection selection=new StringSelection("\"C:\\Users\\user\\Desktop\\Test Data-20220614T135730Z-001\\Test Data\\Document\\Chemistry.jpg\"");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);

            Robot robot= new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(3000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(3000);
            WebElement uploadNow=driver.findElement(upload);
            uploadNow.click();


            Thread.sleep(6000);
            WebElement save= driver.findElement(saveButton);
            save.click();
            Thread.sleep(3000);
            WebElement save2= driver.findElement(saveButton2);
            save2.click();
            Thread.sleep(3000);
            WebElement save3= driver.findElement(saveButton2);
            save3.click();
            Thread.sleep(3000);
            WebElement backNavigate=driver.findElement(backNavigationButton);
            backNavigate.click();



        }
    }





}
