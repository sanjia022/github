package xpath;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class AbsoluteXpath {

	public static void main(String[] args) throws IOException {

 WebDriver driver  = new ChromeDriver();
 driver.get("file:///C:/Users/RC-PC/Desktop/learningHTML1.html");
 WebElement username = driver.findElement(By.xpath("(/html/body/input)[1]"));
 if(username.isEnabled()&&username.isDisplayed()) {
	 username.sendKeys("manish");
 }
 else {
	 System.out.println("User name is not displayed and enabled");
 }
 
 driver.navigate().refresh();
 
 TakesScreenshot t1  = (TakesScreenshot) driver;
 File source = t1.getScreenshotAs(OutputType.FILE);
 File destination = new File("C:\\Users\\RC-PC\\Pictures\\Screenshots\\pic" + Math.random()  +".png");
 FileHandler.copy(source, destination);
 
	}

}
