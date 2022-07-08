package uaterp2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createVendorIndividual {
	@Test
	public void createvendor1 () throws InterruptedException
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
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[9]/ul[1]/li[1]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/app-vendors[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/app-vendors[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/app-vendors[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/app-vendors[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/app-vendors[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[2]/div[3]/input[1]")).sendKeys("id@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/app-vendors[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[3]/div[1]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/app-vendors[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[3]/div[1]/button[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/app-vendors[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[2]/div[2]/input[1]")).sendKeys("111598");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/app-vendors[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[3]/div[2]/input[1]")).sendKeys("09AAACC1206D2ZD");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/app-vendors[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[4]/div[2]/input[1]")).sendKeys("ADLPG1234P");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/app-vendors[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[4]/div[4]/input[1]")).sendKeys("662223509284");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/app-vendors[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[7]/div[2]/input[1]")).sendKeys("Bank of Baroda");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/app-vendors[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[8]/div[2]/input[1]")).sendKeys("Rajajipuram");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/app-vendors[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[8]/div[4]/input[1]")).sendKeys("BARB0MAINOF");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/app-vendors[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[7]/div[4]/input[1]")).sendKeys("00789456123321");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/app-vendors[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[9]/div[1]/button[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/app-vendors[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/div[9]/div[1]/button[2]")).click();
		String Actualltext = driver.findElement( By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]")).getText();
		String Expected =" invalid entry";
		Assert.assertEquals(Actualltext, Expected,"Two different person can not have same pan number ,adhar number,account number");
		
		
		
		
		
		
		
		
	}
}

