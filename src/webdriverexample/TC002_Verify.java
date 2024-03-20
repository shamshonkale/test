package webdriverexample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC002_Verify {
	public static void main(String args[])throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login successful");
		Thread.sleep(4000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("samok");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("sammook");
		WebElement fileInput=driver.findElement(By.xpath("//input[@name='photofile'][@type='file']"));
		fileInput.sendKeys("D:\\SHAMSHON KALE\\JOB\\Photos\\ShamshonKale.jpg");
		System.out.println("File Upload Successfully");
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(4000);
		System.out.println("New Employee added");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		System.out.println("Logout successful");
		driver.close();
	}
}
