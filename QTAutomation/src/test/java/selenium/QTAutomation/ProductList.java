package selenium.QTAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductList 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pepperfry.com");
		String title=driver.getTitle();
		System.out.println(title);
		String Expected="Online Furniture Shopping Store: Shop Online in India for Furniture, Home Decor, Homeware Products @ Pepperfry";
		Assert.assertEquals(title,Expected );
		System.out.println("Title matching");
		WebElement fruniture =driver.findElement(By.xpath("//*[@id='menu_wrapper']/ul/li/child::a[contains(text(),'Furniture')]"));
		Actions a= new Actions(driver);
		a.moveToElement(fruniture).build().perform();
		WebElement seating=driver.findElement(By.xpath("//*[@id='meta-furniture']/div/div/ul/li[2]/a"));
		a.moveToElement(seating).build().perform();
		Thread.sleep(5000);
		WebElement benches=driver.findElement(By.xpath("//*[@id='meta-furniture_seating']/ul/li[2]/a"));
		a.moveToElement(benches).build().perform();
		benches.click();
		List<WebElement> Noofbechens=driver.findElements(By.xpath("//*[@class='clip-main-cat carousel-cell ']"));
		System.out.println(Noofbechens.size());
		for(int i=0;i<Noofbechens.size();i++)
		{
			System.out.println(Noofbechens.get(i).getText());
		}
		WebElement IB = driver.findElement(By.xpath("//p[text()='15 options']"));
        String num = IB.getText().split(" ")[0];
        System.out.println(num);
    
        if (Integer.valueOf(num) > 1) {
            System.out.println("Industrial Benches are more than 1.");
        } else
            System.out.println("Industrial Benches is 1 or less than 1.");
	}

}
