package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

WebDriver driver;
	public LoginPage (WebDriver driver) {
		this.driver=driver;
	}
	By username= By.id("user");
	By password= By.id("pass");
	By login= By.xpath("//*[@id='login_button']/div/a");
		
	public  WebElement username(){
	return	driver.findElement(username);
	}
	
	public  WebElement password(){
		return	driver.findElement(password);
		}
	
	public  WebElement login(){
		return	driver.findElement(login);
		}

	}


