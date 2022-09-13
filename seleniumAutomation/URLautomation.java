package seleniumAutomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class URLautomation {
	  static WebDriver driver;
//	  project started
	  @BeforeSuite
	public static void launchdriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com//index.php");
	driver.manage().window().maximize();
	}
	  //status
	@Test(priority=1)
	public  void signin() {
		WebElement signin=driver.findElement(By.className("login"));
		signin.click();
	}
	@Test(priority=2)
	public  void signinpassword(){
		WebElement signin =driver.findElement(By.id("email"));
		signin.click();
		signin.sendKeys("ajinkya777@gmail.com");
		WebElement password = driver.findElement(By.id("passwd"));
		password.click();
		password.sendKeys("pass123");
	}
	@Test(priority=3)
	public  void clickSubmit() {
		driver.findElement(By.id("SubmitLogin")).click();
	
	}
	@Test(priority=4)
	public  void SelectWomen() {
		WebElement women=driver.findElement(By.className("sf-with-ul"));
		women.click();
	}
	@Test(priority=5)
	public  void  filter() {
		WebElement sort=driver.findElement(By.id("selectProductSort"));
		sort.click();
		Select a = new Select(sort);
		a.selectByIndex(1);
	}
	@Test(priority=6)
	public  void Selectdress() throws InterruptedException{
		WebElement dress = driver.findElement(By.xpath("//img[@title='Printed Chiffon Dress']"));
		dress.click();                                 
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      
	}
	@Test(priority=7)
	public  void Addtocart() {
		driver.findElement(By.xpath("//button[@name='Submit']")).click();
	}
	@Test(priority=8)
	public  void procedtocheckout1() {
		driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();
	}
	@Test(priority=9)
 	public  void procedtocheckout2 () {
 		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")).click();
 	}
	@Test(priority=10)
 	public void procedtocheckout3 () {
 		driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")).click();
 	}
	@Test(priority=11)
 	public  void checkbox() throws InterruptedException {
 		WebElement checkbox=driver.findElement(By.xpath("//div[@id='uniform-cgv']"));
 		checkbox.click();
 		Thread.sleep(2);
 	}
	@Test(priority=12)
 	public void procedtocheckout4 () {
 		driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")).click();
 	}
	@Test(priority=13)
	public  void paymentmode() {
		driver.findElement(By.className("bankwire")).click();
	}
	@Test(priority=14)
	public  void confirmorder() {
		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
	}
	

}

