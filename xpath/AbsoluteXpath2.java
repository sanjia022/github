package xpath;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

public class AbsoluteXpath2 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement googleLink = driver.findElement(By.xpath("//span[.='Google']"));
		googleLink.click();
		
		Set<String> s1 =driver.getWindowHandles();
		System.out.println(s1);
		
		Iterator<String> ids =  s1.iterator();
		String parentid = ids.next();
		String childId = ids.next();
		driver.switchTo().window(childId);
		
		WebElement email = driver.findElement(By.xpath("(//input[@class = 'whsOnd zHQkBf'])[1]"));
		
		Assert.assertTrue(email.isDisplayed());
		
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\RC-PC\\Pictures\\Screenshots\\childwindow" + new AbsoluteXpath2().getClass()+".png");
		FileHandler.copy(source, destination);
		
		driver.quit();
		

	}

}
