package Week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//div[@class='firstName textFieldInput section']//input")).sendKeys("Kali");
driver.findElement(By.xpath("//div[@class='lastName textFieldInput section']//input")).sendKeys("Bhuvana");
	driver.findElement(By.xpath("//div[@class='emailInput textFieldInput section']//input")).sendKeys("abc@xyz.com");
	WebElement dropDown = driver.findElement(By.xpath("//div[@class='userTitle selectFieldInput section']//select"));
	Select drop1=new Select(dropDown);
	drop1.selectByVisibleText("Developer / Software Engineer / Analyst");
	driver.findElement(By.xpath("//div[@class='company textFieldInput section']//input")).sendKeys("AB Company");
WebElement dropDown2 = driver.findElement(By.xpath("//div[@class='companyEmployees selectFieldInput section']//select"));
	Select drop2=new Select(dropDown2);
	drop2.selectByValue("1600");
	driver.findElement(By.xpath("//div[@class='phoneInput textFieldInput section']//input")).sendKeys("70000003");
	WebElement dropDown3 = driver.findElement(By.xpath("//div[@class='country_field selectFieldInput']//select"));
	Select drop3=new Select(dropDown3);
	dropDown3.click();
	drop3.selectByVisibleText("Canada");
	driver.findElement(By.className("checkbox-ui")).click();
	
	}

}
