package Bulk_scenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class mobile1 {
	
	WebDriver d;
	@Test
	public void ICCID () {
		d.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//*[@id='TopTree']/div/div/div/div[2]/div/div/div/div/div/div[1]/div/div[1]/div/div[1]/img")).click();
		
		d.findElement(By.xpath("//*[@id='TopTree']/div/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/div/div[1]")).click();
		
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[4]")).click();
		System.out.println("first mobile is selected");
	
		d.findElement(By.xpath("(//input[@class='refsel_input'])[3]")).sendKeys("89598072103025037708");
		
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		
		System.out.println("one line completed");
		
	}

}
