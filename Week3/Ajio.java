package Week3;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Bags",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@for='Men']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
	Thread.sleep(2000);
	WebElement totalNumberOfBags = driver.findElement(By.className("length"));
	Thread.sleep(2000);
	System.out.println("Count:" +totalNumberOfBags.getText());
	List<WebElement> brandList = driver.findElements(By.className("brand"));
	int size = brandList.size();

	System.out.println("********Brand Name:***********");
	for (int i = 0; i < size; i++) {
		
		String brandName = brandList.get(i).getText();
		
		System.out.println(brandName);
		
	}
	
	
	}

}
