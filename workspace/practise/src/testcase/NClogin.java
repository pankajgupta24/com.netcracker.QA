package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import POM.LoginPage;

public class NClogin {
	
	@Test
	public void Login () throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\paku0817\\Videos\\SE Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30000000, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,200);
		driver.get("http://qaapp487cn:6800/roe/roe.html?soid=9150736720113878424&dcid=9141019958013378475&referer=http%3A%2F%2Fdevapp274cn%3A6880%2Fplatform%2Fcsr%2Fcustomer.jsp%3Ftab%3D_Sales%2BOrders%2B%26object%3D9150736720113878401&cid=9150736720113878401#overview");
		Thread.sleep(6000);
		LoginPage lp= new LoginPage(driver);
		lp.username().sendKeys("sysadm");
		lp.password().sendKeys("netcracker");
		lp.login().click();
		
		
	
	}

}
