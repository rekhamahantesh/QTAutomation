package selenium.QTAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstSelenium 
{
	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		
		WebElement text= driver.findElement(By.id("p3"));
		WebElement un= driver.findElement(By.id("input1"));
		WebElement pw=driver.findElement(By.id("input2"));
		String PT=text.getText();
		System.out.println(PT);
		un.sendKeys("JAVA");
		pw.sendKeys("SELENIUM");
		String usename=un.getAttribute("value");
		String password=pw.getAttribute("value");
		System.out.println(usename);
		System.out.println(password);
		un.clear();
		pw.clear();
		un.sendKeys("selenium");
		pw.sendKeys("java");
		String username1=un.getAttribute("value");
		String password1=pw.getAttribute("value");
		System.out.println(username1);
		System.out.println(password1);
		
	}

}
