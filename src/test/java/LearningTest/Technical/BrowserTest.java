package LearningTest.Technical;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserTest {
	
	
	@Test
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Desktop/Test/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/droppable/");
		
		System.out.println("Title is = "+driver.getTitle());
		System.out.println("Testing !!!!!");
	}

}
