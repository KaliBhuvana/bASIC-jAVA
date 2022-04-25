package Week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
	driver.findElement(By.name("firstname")).sendKeys("Kali");
	driver.findElement(By.name("lastname")).sendKeys("Bhuvana");
	driver.findElement(By.name("reg_email__")).sendKeys("123456789");
	driver.findElement(By.name("reg_passwd__")).sendKeys("@#$");
	WebElement date = driver.findElement(By.name("birthday_day"));
	Select drop1=new Select(date);
	drop1.selectByValue("7");
	WebElement month = driver.findElement(By.name("birthday_month"));
	Select drop2=new Select(month);
	drop2.selectByValue("6");
	WebElement year = driver.findElement(By.name("birthday_year"));
	Select drop3=new Select(year);
	drop3.selectByValue("1995");
	WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
	gender.click();
	}

}
