/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleniumproject;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author kevin
 */
public class SeleniumProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\uni work\\junior\\sem2\\software testing\\assignments\\libraries\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();
        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement lastName = driver.findElement(By.id("last-name"));
        WebElement jobTitle = driver.findElement(By.id("job-title"));
        WebElement highestGrade = driver.findElement(By.id("radio-button-1"));
        WebElement submit = driver.findElement(By.className("btn-primary"));
        firstName.sendKeys("Beemen");
        lastName.sendKeys("Amir");
        jobTitle.sendKeys("Engineering Student");
        highestGrade.click();
        submit.click();
        String at = driver.getTitle();
        String et = "formy";
        if(at.equalsIgnoreCase(et)){
        System.out.println("the test was successful");
        }else{
        System.out.println("the test failed");

        }



        



        
        
        
    }
    
}
