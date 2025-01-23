package launchingBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchingBrowser {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/automate-me/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		WebElement registration = driver.findElement(By.xpath("(//div[@class= 'elementor-flip-box__layer__overlay'])[1]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(registration);
		
		WebElement readmoreButton = driver.findElement(By.xpath("(//a[@class='elementor-flip-box__button elementor-button elementor-size-sm'])[1]"));
		readmoreButton.click();
		/* another way to launch an application 
		driver .navigate().to("https://grotechminds.com/automate-me/");*/
		
		
		String id = driver.getWindowHandle();
		System.out.println(id);
		
		
		

	}

}
