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

public class AbsoluteXpath1 {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/RC-PC/Desktop/learningHTML1.html");
		WebElement boyCheckbox = driver.findElement(By.xpath("(/html/body/form/input)[4]"));
		if (boyCheckbox.isEnabled()) {
			boyCheckbox.click();
		}
		
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\RC-PC\\Pictures\\Screenshots\\abs" + Math.random()+".png");
		FileHandler.copy(source, destination);
	}

}
