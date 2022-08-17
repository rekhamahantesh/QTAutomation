package selenium.QTAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FillTheForm 
{ 
	public static void main(String[] args) 
	{
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestpractice.com/Students/Form");
		WebElement fn=driver.findElement(By.id("firstname"));
		WebElement ln=driver.findElement(By.id("lastname"));
		WebElement ms=driver.findElement(By.name("optradio"));
		WebElement hb=driver.findElement(By.xpath("//input[@value='dance']"));
		WebElement ctry=driver.findElement(By.id("sel1"));
		WebElement dtp=driver.findElement(By.id("datepicker"));
		WebElement phno=driver.findElement(By.id("phonenumber"));
		WebElement usnm=driver.findElement(By.id("username"));
		WebElement emid=driver.findElement(By.id("email"));
		WebElement txtar=driver.findElement(By.id("comment"));
		WebElement pwd=driver.findElement(By.id("pwd"));
		WebElement submit=driver.findElement(By.xpath("//button[@class='btn btn-default ']"));
		
		fn.sendKeys("Rekha");
		ln.sendKeys("mahantesh");
		ms.click();
		hb.click();
		Select s=new Select(ctry);
		s.selectByVisibleText("India");
		dtp.sendKeys("07/27/2022");
		phno.sendKeys("890452990");
		usnm.sendKeys("Rekha Mahantesh");
		emid.sendKeys("xyz@qualitestgroup.com");
		txtar.sendKeys("Training session is going on");
		String text=txtar.getAttribute("value");
		System.out.println(text);
		pwd.sendKeys("Qualitest");
		submit.click();
		
				
	}

}
