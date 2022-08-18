package selenium.QTAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollegeSearch {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.eduvidya.com/");
		driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[2]/a[contains(text(),'Colleges')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[2]/a[contains(text(),'Colleges')]")).click();
		//driver.findElement(By.xpath("//*[@id='dismiss-button']")).click();
	WebElement course=	driver.findElement(By.id("ddl_Category"));
	Select s= new Select(course);
			s.selectByVisibleText("Science");
		WebElement city=	driver.findElement(By.xpath("//select[@id='ddl_City']"));
		Select s1= new Select(city);
		s1.selectByVisibleText("Chennai");
		driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
		Thread.sleep(2000);
		String Actual=driver.findElement(By.xpath("//a[contains(text(),'Search Colleges in India')]")).getText();
		System.out.println(Actual);
		String Expected="Search Colleges in India";
		Assert.assertEquals(Actual, Expected);
		driver.close();
	}

}
