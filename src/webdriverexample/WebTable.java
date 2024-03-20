package webdriverexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/NARESH%20IT/SOFTWARE%20TESTING/HTML%20files/WebTable.html");
		int row=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
		System.out.println("Row Count: "+row);
		int col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
		System.out.println("Col Count: "+col);
		int tablesize=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
		System.out.println("Table size: "+tablesize);
		
		for(int i=1;i<=row;i++) {
			String data=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
			System.out.println(data);
			Thread.sleep(3000);
		}
	}
}
