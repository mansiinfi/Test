package demo;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("Webdriver.driver.chrome", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		 WebDriverManager.chromedriver().setup();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");

		String title = driver.getTitle();

		System.out.println(title);

		if (title.contentEquals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("incorrect title");
		}

	}

}
