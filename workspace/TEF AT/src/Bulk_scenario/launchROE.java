package Bulk_scenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;


public class launchROE 
{
	WebDriver d;
	String URL ="http://qaapp487cn:6800/roe/roe.html?dcid=9141019958013378475&cid=9150652849013996848&soid=9150652849013996869&referer=http%3A%2F%2Fqaapp487cn%3A6800%2Fplatform%2Fcsr%2Fcustomer.jsp%3Ftab%3D_Sales%2BOrders%2B%26object%3D9150652849013996848#overview";
	@BeforeClass
	public void OpenROE () 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\paku0817\\Videos\\SE Software\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver ();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
		d.get(URL);
		d.findElement(By.id("user")).sendKeys("sysadm");
		d.findElement(By.id("pass")).sendKeys("netcracker");
		d.findElement(By.xpath("//*[@id='login_button']/div/a")).click();	
		System.out.println("login sucessfull and ROE is opening");
	}
	
		@AfterMethod
		public void finishing () 
		{
			d.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
			d.findElement(By.xpath("//*[@id='TopTree']/div/div/div/div[2]/div/div/div/div/div/div[1]/div/div[1]/div/div[1]/img")).click();
			
			d.findElement(By.xpath("//*[@id='TopTree']/div/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/div/div[1]")).click();
			
			
			d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[4]")).click();
			System.out.println("first mobile is selected");
		
			d.findElement(By.xpath("(//input[@class='refsel_input'])[3]")).sendKeys("89598072103025037708");
			
			d.findElement(By.xpath("//div[@class='refsel_path']")).click();
			
			System.out.println("one line completed");
		}
			
		@DataProvider(name="Asset")
		public void data()
		{
			String line1="89598075103024960444";			
			String line2="89598072103024353379";
			String line3="89598072103024353445";
			String line4="89598072103024381016";
			String line5="89598072103024421952";
			String line6="89598072103023987797";
			String line7="89598075103025334748";
			String line8="89598075103025336313";
			String line9="89598075103025425504";
			String line10="89598072103025037708";
		}
		
	}


