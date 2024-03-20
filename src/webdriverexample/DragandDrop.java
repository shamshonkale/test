package webdriverexample;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		assertEquals(driver.getTitle(),"Droppable | jQuery UI");
		System.out.println("Title Matched");
		
		driver.switchTo().frame(0);
		Actions ac=new Actions(driver);
		ac.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
		System.out.println("Drag and Drop Performed");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.quit();
	}
}
