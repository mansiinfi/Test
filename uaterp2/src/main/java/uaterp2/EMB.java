package uaterp2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EMB {
	@Test(enabled= false)
	public void approveAssertion () throws InterruptedException
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-create-emb[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/button[2]")).click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		String Actualltext = driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
		String Expected ="select the work";
		Assert.assertEquals(Actualltext, Expected,"Not matched");	
}
	@Test(enabled= false)
	public void createBlankEMB () throws InterruptedException
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-create-emb[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-create-emb[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[2]/div[4]/input[1]")).sendKeys("12122000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-create-emb[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[3]/div[3]/div[1]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-create-emb[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[3]/div[1]/button[2]")).click();
		Thread.sleep(2000);
		String Actualltext = driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
		String Expected ="select the work";
		Assert.assertEquals(Actualltext, Expected,"Not matched");	
}
	@Test(enabled= true)
	public void ebill () throws InterruptedException
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-create-emb[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-create-emb[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/span[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-create-emb[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[1]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-ebill-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-ebill-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-ebill-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[7]/div[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-ebill-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[7]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-ebill-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[10]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-ebill-create[1]/div[11]/div[1]/div[1]/div[2]/div[1]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-ebill-create[1]/div[11]/div[1]/div[1]/div[2]/div[1]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-ebill-create[1]/div[11]/div[1]/div[1]/div[2]/div[1]/div[5]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-ebill-create[1]/div[11]/div[1]/div[1]/div[2]/div[2]/div[4]/ng-select[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-ebill-create[1]/div[11]/div[1]/div[1]/div[2]/div[2]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-ebill-create[1]/div[11]/div[1]/div[1]/div[2]/div[4]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-ebill-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[13]/div[1]/button[1]")).click();
	    
		String Actualltext = driver.findElement( By.xpath("/html[1]/body[1]/div[2]/div[1]/app-ebill-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[1]/div[2]/h6[1]/b[1]")).getText();
		String Expected ="0";
		Assert.assertEquals(Actualltext, Expected,"Until and unless EMB is not Aprroved amount will be 0");
			
}
}