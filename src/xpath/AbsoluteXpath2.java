package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AbsoluteXpath2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement selectDropdown= driver.findElement(By.id("searchDropdownBox"));
		
		Select s1 = new Select(selectDropdown);
		s1.selectByVisibleText("Appliances");
		
		WebElement hoverOver = driver.findElement(By.xpath("(//span[@class = 'nav-line-1 nav-progressive-content'])[2]"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(hoverOver).perform();
		
		WebElement hoverOver2 = driver.findElement(By.xpath("//span[. = 'Sign in']"));
		hoverOver2.click();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement selectDropdown2= driver.findElement(By.id("Skills"));
		
		Select s2 = new Select(selectDropdown2);
		s2.selectByVisibleText("Technical Skills");
		
		WebElement country = driver.findElement(By.id("Country"));
		Select s3 = new Select(country);
		s3.selectByIndex(2);
		
		driver.get("https://www.google.com/");
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		a1.contextClick(gmailLink).perform();
		
	}

}
