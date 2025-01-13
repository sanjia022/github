package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbsoluteXpath2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver ();
		driver.get("file:///C:/Users/RC-PC/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement selectDropdown= driver.findElement(By.xpath("/html/body/select"));
		selectDropdown.sendKeys(Keys.ARROW_DOWN);
		selectDropdown.sendKeys(Keys.ENTER);
		selectDropdown.sendKeys(Keys.ARROW_DOWN);
		
		
		Select s1 = new Select(selectDropdown);
		s1.selectByVisibleText("Relegion 3");
	}

}
