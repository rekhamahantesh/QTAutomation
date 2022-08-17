package selenium.QTAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mobiles 
{
	public static void main(String[] args) throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(" https://www.amazon.in");
	String title=driver.getTitle();
	System.out.println(title);
	WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));
	searchbox.sendKeys("mobile smartphones under 30000");
	WebElement searchicon= driver.findElement(By.id("nav-search-submit-button"));
	searchicon.click();
	Thread.sleep(5000);
	WebElement sortby=driver.findElement(By.id("s-result-sort-select"));
	Select select= new Select(sortby);
	List<WebElement> listofoption = select.getOptions();
    int count=listofoption.size();
    System.out.println(count);
    select.selectByVisibleText("Newest Arrivals");
    WebElement newarrival = driver.findElement(By.xpath("//span[text()='Newest Arrivals']"));
    String expectedtext=newarrival.getText();
    System.out.println(expectedtext);
    String actual="Newest Arrivals";
    Assert.assertEquals(actual, expectedtext);
			
	}
}
	 