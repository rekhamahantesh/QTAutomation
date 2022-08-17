package selenium.QTAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelBooking 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.trivago.in");
		driver.findElement(By.id("input-auto-complete")).sendKeys("Mumbai");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='react-autowhatever-1--item-0']/div/div/div[2]/div[1]/span/mark[contains(text(),'Mumbai')]")).click();
		Thread.sleep(2000);
		WebElement fromdate=driver.findElement(By.xpath("//div[@class='text-center']/table/tbody/tr[4]/td[6]/time/button/span[contains(text(),'27')]"));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(fromdate));
		fromdate.click();
		driver.findElement(By.xpath("//span[@class='flex']/div/span/span[contains(text(),'Check out')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'1 Room')]")).click();
	    driver.findElement(By.xpath("//*[@data-testid='guest-selector-popover']/div/div/button[@data-testid='adults-amount-minus-button']/span")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		Thread.sleep(30000);
        WebElement drpdwn=driver.findElement(By.xpath("//*[@id='sorting-selector']"));
		Select s=new Select(drpdwn);
		s.selectByVisibleText("Rating only");
		
		 List<WebElement> Listofhotel = driver.findElements(By.xpath("//*[@data-testid='item-name']//span[@itemprop='name']"));
		 
		 for(int i=0;i<Listofhotel.size();i++) 
         {
             System.out.println(Listofhotel.get(i).getText());
             
         }
         List<WebElement> Listofhotelrating = driver.findElements(By.xpath("//span[@itemprop='ratingValue']"));
         for(int i=0;i<Listofhotelrating.size();i++)
         {
             System.out.println("Hotel ratings in descending order:"+Listofhotelrating.get(i).getText());
             
         }
         Thread.sleep(5000);
         driver.close();
	}

}
