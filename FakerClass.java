package pages;
import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FakerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chromedriver","C:\\Users\\pc\\Downloads\\chromedriver-win64 (1).zip\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/inputs");
		Faker faker = new Faker();
		int fakeNumber = faker.number().numberBetween(1, 100);
		String randomnumber = Integer.toString(fakeNumber);
		String fakeText = faker.artist().name();
		String Password = faker.internet().password();
		Date randomFutureDate = faker.date().future(1825, TimeUnit.DAYS);
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-DD-YYYY");
	    String Calendardate = dateFormat.format(randomFutureDate);
		
		WebElement Number = driver.findElement(By.xpath("//input[@id='input-number']"));
		Number.sendKeys(randomnumber);
		
		WebElement Text = driver.findElement(By.xpath("//input[@id='input-text']"));
		Text.sendKeys(fakeText);
		
		WebElement Password1 = driver.findElement(By.xpath("//input[@id='input-password']"));
		Password1.sendKeys(Password);
		
		WebElement Calendar = driver.findElement(By.xpath("//input[@id='input-date']"));
		Calendar.sendKeys(Calendardate);
		WebElement Display = driver.findElement(By.xpath("//button[@id='btn-display-inputs']"));
		Display.click();
	
	}

}
