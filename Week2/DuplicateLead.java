package Week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		driver.findElement(By.xpath("(//div[@class='x-tab-strip-wrap']//span)[4]")).click();

		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("ab");
		//driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String text = driver.findElement(By.xpath("((//div[@class='x-panel-mc'])[7]//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]")).getText();
		driver.findElement(By.xpath("((//div[@class='x-panel-mc'])[7]//a[@class='linktext'])[1]")).click();
		
	 driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String title = driver.getTitle();
		System.out.println("Title:"+title );
		if (title.equals("Dupicate Lead")) {
			System.out.println("Right");
			}
		else {
			System.out.println("Wrong");
		}
		
driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

String text2 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
System.out.println(text2);
System.out.println(text);

		if(text2.equals(text))
		{
		System.out.println("Same Name");	
		}
		
		else 
		{
			
			System.out.println("No");	
		}
		}
		}