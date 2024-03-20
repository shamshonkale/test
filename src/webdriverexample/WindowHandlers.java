package webdriverexample;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandlers 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/NARESH%20IT/SOFTWARE%20TESTING/HTML%20files/multiplewindows.html");
		Thread.sleep(3000);
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(3000);
		ArrayList<String> windows=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(2));
		Thread.sleep(3000);
		driver.quit();
	}
}
