package selenium.QTAutomation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Dropdown 
{
    public static void main(String[] args) {
    	RemoteWebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
        WebElement element=driver.findElement(By.id("mySelect"));
        Select select=new Select(element);
       List<WebElement> l= select.getOptions();  
       System.out.println(l.size());
       for(int i=0;i<l.size();i++)
       {
    	   String listofvalue=l.get(i).getText();
    	   System.out.println(listofvalue);
       }
       
        
        //1.  select by index
        //select.selectByValue("pineapple");
        //2. select by value
        //select.selectByVisibleText("Banana");
       // select.selectByIndex(1);

        //3.  select by visibletext




    }
 
}


	


