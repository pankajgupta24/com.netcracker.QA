package tef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bulkmode 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\paku0817\\Videos\\SE Software\\chromedriver_win32\\chromedriver.exe");
														
		WebDriver d = new ChromeDriver ();
		d.get("https://www.google.co.in/");
		d.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("india");
	}

}
