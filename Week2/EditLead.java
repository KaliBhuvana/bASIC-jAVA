package Week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("(//div[@class='frameSectionBody']//a)[3]")).click();
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
	driver.findElement(By.xpath("(//label[text()='First name:'])[3]//following::input[@name='firstName']")).sendKeys("Kali Bhuvana");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']//following::a[text()='Kali Bhuvana Moorthy (10290)']")).click();
	}

}
