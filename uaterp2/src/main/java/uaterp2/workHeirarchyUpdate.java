package uaterp2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class workHeirarchyUpdate {
	@SuppressWarnings("deprecation")
	@Test(enabled= true)
	public void workheirarchyNotUpdating () throws InterruptedException
	{


		WebDriverManager.chromedriver().setup();
		ChromeDriver	 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://uat.erp2.upda.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']")).sendKeys("9838780000");
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("User@1");
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//div[@class='col-5 ng-star-inserted']//button[@type='submit'][normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//div[@class='ng-select-container']//input[@role='combobox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ng-option-label.ng-star-inserted[ng-reflect-ng-item-label='92 - Integrated Testing Accoun']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='multi_account']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(2000);	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[9]/ul[1]/li[2]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[9]/ul[1]/li[2]/ul[1]/li[3]/a[1]")).click();

		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-emb-hierarchy[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[7]/button[1]")).click();
		driver.findElement(By.xpath("//p[normalize-space()='Loading....']")).click();
		
	boolean con = true;
	if(con== true)
	{
		driver.findElement(By.xpath("")).click();
		
	System.out.println("not updating");

}
	
	
	}
	
	@Test(enabled= false)
	public void role () throws InterruptedException
	{


		WebDriverManager.chromedriver().setup();
		ChromeDriver	 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://uat.erp2.upda.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']")).sendKeys("9838780000");
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("User@1");
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//div[@class='col-5 ng-star-inserted']//button[@type='submit'][normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//div[@class='ng-select-container']//input[@role='combobox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ng-option-label.ng-star-inserted[ng-reflect-ng-item-label='92 - Integrated Testing Accoun']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='multi_account']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(2000);	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[9]/ul[1]/li[2]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[9]/ul[1]/li[2]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(2000);
		
		if(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-emb-hierarchy[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[6]")).isDisplayed()) 
		{
			   System.out.println("update and delete button is not present");
				


		}		
}
}