package webdriverexample;
//To access webdriver related classes and methods
import org.openqa.selenium.WebDriver;
//To access browser(here is chrome browser)
import org.openqa.selenium.chrome.ChromeDriver;
//To access object/elements related methods
import org.openqa.selenium.By;
public class TC001_Login_Logout {
	public static void main(String args[]) throws Exception{
	//To launch browser (here is chrome browser)
	WebDriver driver=new ChromeDriver();
	//To open URL
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	//To waiting for some time
	Thread.sleep(3000);
	//To close the browser
	driver.close();
	}
}
