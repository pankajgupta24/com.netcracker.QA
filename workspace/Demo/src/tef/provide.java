package tef;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class provide {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		FileInputStream fis= new FileInputStream ("C:\\Users\\paku0817\\Desktop\\AT\\ICCID.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet("SIM");
		
		String line1=sheet.getRow(1).getCell(0).getStringCellValue();			
		String line2=sheet.getRow(2).getCell(0).getStringCellValue();
		String line3=sheet.getRow(3).getCell(0).getStringCellValue();
		String line4=sheet.getRow(4).getCell(0).getStringCellValue();
		String line5=sheet.getRow(5).getCell(0).getStringCellValue();
		String line6="89598072103025101025";
		String line7="89598072103025101280";
		String line8="89598075103025336313";
		String line9="89598075103025425504";
		String line10="89598072103025037708";
		String line11="89598075103025467654";
		String line12="89598075103025468678";
		String line13="89598072103025039894";
		String line14="89598072103025079635";
		String line15="89598072103025070832";
		String line16="89598072103025071038";
		String line17="89598072103025071129";
		String line18="89598072103025101025";
		String line19="89598072103025101280";
		String line20="89598075103025370239";
		String line21="89598075103025367979";
		String line22="89598072103025018286";
		String line23="89598072103025018526";
		String line24="89598072103025018542";
		String line25="89598072103025019680";
		String line26="89598072103025019730";
		String line27="89598075103024930819";
		String line28="89598072103025003049";
		String line29="89598075103025477273";
		String line30="89598075103025477406";
		String line31="89598075103025478131";
		String line32="89598075103025237289";
		String line33="89598075103025532705";
		String line34="89598075103025533018";
		String line35="89598075103025454868";
		String line36="89598075103025455691";
		String line37="89598075103025535732";
		String line38="89598075103025309682";
		String line39="89598072103024410179";
		String line40="89598075103025488726";
		String line41="89598075103025490268";
		String line42="89598075103025490326";
		String line43="89598075103025490847";
		String line44="89598075103025409672";
		String line45="89598072103024352934";
		String line46="89598075103024903493";
		String line47="89598075103024903600";
		String line48="89598075103024903683";
		String line49="89598075103024903709";
		String line50="89598075103024960444";
	

		System.setProperty("webdriver.chrome.driver","C:\\Users\\paku0817\\Videos\\SE Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver ();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30000000, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(d,200);
		d.get("http://qaapp487cn:6800/roe/roe.html?soid=9150736720113878424&dcid=9141019958013378475&referer=http%3A%2F%2Fdevapp274cn%3A6880%2Fplatform%2Fcsr%2Fcustomer.jsp%3Ftab%3D_Sales%2BOrders%2B%26object%3D9150736720113878401&cid=9150736720113878401#overview");
		Thread.sleep(10000);
		d.findElement(By.id("user")).sendKeys("sysadm");
		d.findElement(By.id("pass")).sendKeys("netcracker");
		d.findElement(By.xpath("//*[@id='login_button']/div/a")).click();	
		
		d.get("http://qaapp487cn:6800/platform/csr/customer.jsp?tab=_Sales+Orders+&object=9150763307113177882");
		Thread.sleep(10000);
		d.findElement(By.xpath("//*[@id='9139371752413211533']/div/div[1]/div/div/div/div/div[1]/button")).click();
		Thread.sleep(7000);
		d.findElement(By.xpath("//i[@class='refsel_arrow']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id='nc_refsel_list']/div[2]/div[1]/div[3]/div[1]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id='ui-id-5']/div/div[3]/div/div/div/div/div[1]/button")).click();
		Thread.sleep(7000);
		d.findElement(By.xpath("//div[@class='roe-widget-header__sh-inner _hidden'][contains(text(),'Bolsas')]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//html//div[2]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//option[@value='9142485572013874680']")).click();
		
	Thread.sleep(3000);
	//d.findElement(By.xpath("//a[@tabindex='-1'][2]")).click();
		d.findElement(By.cssSelector("a.ui-spinner-button.ui-spinner-up.ui-corner-tr.ui-button.ui-widget.ui-state-default.ui-button-text-only")).click();
		Thread.sleep(5000);
		d.findElement(By.cssSelector("span.bulkTreeItem.bulkTreeItemRoeTreeItem")).click();
		
		
		
		Thread.sleep(100000000);
		
		System.out.println("login sucessfull and ROE is opening");
		Thread.sleep(10000);
		d.findElement(By.xpath("//*[@id='TopTree']/div/div/div/div[2]/div/div/div/div/div/div[1]/div/div[1]/div/div[1]/img")).click();
		d.findElement(By.xpath("//*[@id='TopTree']/div/div/div/div[2]/div/div/div/div/div/div[1]/div/div[1]/div/div[1]/img")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id='TopTree']/div/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/div/div[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[4]")).click();
		System.out.println("first mobile is selected");
		//Thread.sleep(6000);
		WebElement element1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[4]")));
		//WebElement element= wait.until(ExpectedConditions.visibli
		element1.sendKeys(line1);
		//d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line1);
		//Thread.sleep(10000);
		WebElement element2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='refsel_path']")));
		//d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		element2.click();
		//Thread.sleep(5000);
		System.out.println("one line completed");
		WebElement element3=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[5]")));
		//d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[5]")).click();
		element3.click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		//d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line2);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line2);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("second line completed");
		
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[6]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line3);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("third line completed");
		
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[7]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line4);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[8]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line5);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[9]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line6);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[10]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line7);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[11]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line8);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[12]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line9);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[13]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line10);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[14]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line11);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[15]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line12);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[16]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line13);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[17]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line14);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[18]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line15);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[19]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line16);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[20]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line17);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[21]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line18);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[22]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line19);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[23]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line20);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		
		
		
		
		
		
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[24]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line20);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[24]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line21);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[25]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line22);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[26]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line23);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[27]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line24);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[28]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line25);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[29]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line26);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[30]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line27);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[31]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line28);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[32]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line29);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[33]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line30);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[34]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line31);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[35]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line32);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[36]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line33);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[37]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line34);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[38]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line35);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[39]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line36);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[40]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line37);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[41]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line38);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[42]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line39);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[43]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line40);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[44]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line41);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[45]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line42);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[46]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line43);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[47]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line44);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[48]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line45);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[49]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line46);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[50]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line47);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[51]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line48);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[52]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line49);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		d.findElement(By.xpath("(//span[@ class='bulkTreeItem bulkTreeItemRoeTreeItem'])[53]")).click();
		System.out.println("second mobile is selected");
		Thread.sleep(6000);
		d.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(line50);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[@class='refsel_path']")).click();
		Thread.sleep(5000);
		System.out.println("one line completed");
		
	
	
	}

}
