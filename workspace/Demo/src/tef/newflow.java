package tef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newflow {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\paku0817\\Videos\\SE Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver ();
		d.manage().timeouts().implicitlyWait(30000000, TimeUnit.SECONDS);
		d.get("http://qaapp487cn:6800/platform/csr/customer.jsp?tab=_Sales+Orders+&object=9150652849013996848");
		Thread.sleep(10000);
		d.findElement(By.id("user")).sendKeys("sysadm");
		d.findElement(By.id("pass")).sendKeys("netcracker");
		d.findElement(By.xpath("//*[@id='login_button']/div/a")).click();
		Thread.sleep(15000);
		d.findElement(By.xpath("//*[@id='9139371752413211533']/div/table/tbody[1]/tr[1]/td[1]/div/label/input")).click();
		d.findElement(By.xpath("//*[@id='9139371752413211533']/div/div[1]/div/div/div/div/div[2]/button")).click();
		Thread.sleep(5000);
		//d.findElement(By.cssSelector("#id_refsel2113821830_div > div > i")).click();
		//d.findElement(By.xpath("//*[@id='id_refsel1770998447_div']/div/i")).click();
		//d.findElement(By.xpath("//*[@id='nc_refsel_list']/div[2]/div[1]/div[3]/div[1]")).click();
		d.findElement(By.xpath("//*[@id='ui-id-7']/div/div[3]/div/div/div/div/div[1]/button")).click();
		
		System.out.println("login sucessfull and ROE is opening");
		
		
	}

}
