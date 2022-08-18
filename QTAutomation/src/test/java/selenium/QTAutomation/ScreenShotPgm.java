package selenium.QTAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotPgm 
{
	public static void main(String[] args) throws IOException {
		 WebDriverManager.chromedriver().setup();
	        WebDriver d=new ChromeDriver();
	        d.manage().window().maximize();
	        d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
	        File screenshot=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(screenshot, new File("C:\\Users\\rekha.mahantesh\\screenshot\\QTest2.png"));

	    }

}
