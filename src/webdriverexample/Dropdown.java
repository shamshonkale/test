package webdriverexample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
public class Dropdown 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		Select st=new Select(driver.findElement(By.name("loc_code")));
		st.selectByVisibleText("Emp. ID");
		driver.findElement(By.name("loc_name")).sendKeys("8965");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("chkLocID[]")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout successful");
		driver.close();
	}
}
