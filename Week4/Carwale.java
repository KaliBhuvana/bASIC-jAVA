package Week4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Carwale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.carwale.com/");
		driver.findElement(By.xpath("//span[text()='Used']")).click();
		WebElement city = driver.findElement(By.xpath("//input[@placeholder='City, eg: Mumbai']"));
		city.sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@data-label='Chennai, Tamil Nadu']")).click();
//driver.findElement(By.xpath("((//button[@type='button'])[1]/following::form//input[@type='number'])[1]")).sendKeys("4");
//driver.findElement(By.xpath("((//button[@type='button'])[1]/following::form//input[@type='number'])[2]")).sendKeys("8");
		WebElement button1 = driver
				.findElement(By.xpath("((//button[@type='button'])[1]/following::form//input[@type='number'])[1]"));
		WebElement button2 = driver
				.findElement(By.xpath("((//button[@type='button'])[1]/following::form//input[@type='number'])[2]"));
//Point location = driver.findElement(By.xpath("(//button[@type='button'])[1]/following::form//input[@type='number']")).getLocation();
//int x=location.x;
//int y=location.y;
		Actions builder = new Actions(driver);
		builder.click(button1).sendKeys("4").perform();
		builder.click(button2).sendKeys("8").perform();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
//driver.findElement(By.xpath("//input[@value='Chennai']")).click();

	}

}
