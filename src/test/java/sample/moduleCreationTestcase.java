package sample;

import io.github.bonigarcia.wdm.WebDriverManager;
import locator.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;


public class moduleCreationTestcase {
    public static void main(String[] args) throws InterruptedException, AWTException {
   //launchingBowser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        signinPage signIn = new signinPage(driver);
        programCreation createNewProgram=new programCreation(driver);
        skillCreation createNewSkill=new skillCreation(driver);
        moduleCreation createNewModule=new moduleCreation(driver);


        learnerLandingPage landingpage = new learnerLandingPage(driver);
        driver.get("https://qa.disprz.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        Thread.sleep(3000);

//Signin Page
        signIn.userName("alone_skillmaster");
        signIn.passWord("qwe");
        signIn.clicklogin();


//ProgramCreation
        Thread.sleep(3000);
        createNewProgram.clickProgramCreation();
        Thread.sleep(3000);
        String program= "car";
        createNewProgram.enterProgramName(program);
        createNewProgram.enterProgramDiscription("sample program creation");
        Thread.sleep(3000);
        createNewProgram.selectImage();
        Thread.sleep(3000);
        createNewProgram.createProgram();
        Thread.sleep(5000);
        createNewProgram.openCreatedProgram(program);

 //Skillcreation
        Thread.sleep(3000);
        createNewSkill.clickCreateSkill();
        Thread.sleep(3000);
        String skill="rose";
        createNewSkill.enterSkillName(skill);
        createNewSkill.enterSkillDiscription("hih all");
        Thread.sleep(3000);
        createNewSkill.selectImage();
        Thread.sleep(3000);
        createNewSkill.createSkill();
        Thread.sleep(3000);
        createNewSkill.openCreatedSkill(skill);

   //ModuleCreation
        Thread.sleep(3000);
        createNewModule.clickCreateModule();
        Thread.sleep(3000);
        createNewModule.selectTypeofModule("SelfPacedModule");
        Thread.sleep(3000);
        String mName="red";
        createNewModule.enterModuleName(mName);
        createNewModule.enterModuleDiscription("hi");
        Thread.sleep(3000);
        createNewModule.selectImage();
        Thread.sleep(3000);
        createNewModule.createModule();
        Thread.sleep(6000);
        createNewModule.actCreation("SelfPacedModule");



       ;
        //landingpage.switctoadminview();
       // Thread.sleep(6000);
         //    landingpage.clickusertile(driver);

//        landingpage.cickprofiledropdown();
//        landingpage.clicklogout();
    }

        // driver.quit();





}
