package autoSuggestion;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Autosuggestion1 {

	public static void main(String[] args) throws IOException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	    WebElement searchArea =	driver.findElement(By.xpath("//textarea[@name ='q']"));
	    searchArea.sendKeys("Bangladesh" + Keys.ARROW_DOWN);
	    searchArea.sendKeys(Keys.ARROW_DOWN);
	    searchArea.sendKeys(Keys.ARROW_DOWN);
	    searchArea.sendKeys(Keys.ARROW_DOWN);
	    searchArea.sendKeys(Keys.ARROW_DOWN);
	    searchArea.sendKeys(Keys.ENTER);
	    
	    TakesScreenshot t1 = (TakesScreenshot) driver;
	    File source = t1.getScreenshotAs(OutputType.FILE);
	    File destination = new File ("C:\\Users\\RC-PC\\Pictures\\Screenshots\\autosuggestion" + Math.random() + ".png");
	    FileHandler.copy(source, destination);
	}

}
