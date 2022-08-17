package selenium.QTAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTCBooking 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
      WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
//		Alert alert=driver.switchTo().alert();
//		alert.accept();
		
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		driver.findElement(By.xpath("//*[@id='origin']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'HYDERABAD DECAN - HYB')]")).click();//select from
		driver.findElement(By.xpath("//*[@id='destination']")).click();//select to
		driver.findElement(By.xpath("//*[contains(text(),'PUNE JN - PUNE')]")).click();
		WebElement date=driver.findElement(By.xpath("//*[@id='jDate']"));
		date.click();
		driver.findElement(By.xpath("//*[@id='jDate']/span/div/div/div[2]/table/tbody/tr[2]/td[6]/a")).click();
	    driver.findElement(By.xpath("//*[@id='journeyClass']")).click();
	    driver.findElement(By.xpath("//*[@id='journeyClass']/div[1]/div[4]/div/ul/p-dropdownitem[12]/li/span[contains(text(),'Sleeper (SL)')]")).click();
	    //driver.findElement(By.xpath("//*[@id='journeyQuota']"));//general coata
	    //driver.findElement(By.xpath("//*[@id='journeyQuota']/div[1]/div[4]/div/ul/p-dropdownitem[2]/li/span[contains(text(),'LADIES')]")).click();
		WebElement checkbox=driver.findElement(By.xpath("//*[@id='concessionBooking']"));
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
          executor.executeScript("arguments[0].click();", checkbox);
          driver.findElement(By.xpath("//button[@type='button']/span[contains(text(),'OK')]")).click();
	    driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
	    String resl=driver.findElement(By.xpath("//div[@class='hidden-xs']//span[1]")).getText();
	    System.out.println(resl);
	    //File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(screenshot, new File(""));		
		
		
	}

}
