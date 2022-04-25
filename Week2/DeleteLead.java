package Week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		driver.findElement(By.xpath("(//div[@class='x-tab-strip-wrap']//span)[4]")).click();
driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7358473842");
driver.findElement(By.xpath("(//div[@class='x-panel-btns x-panel-btns-center'])[6]//button[text()='Find Leads']")).click();
//driver.findElement(By.xpath("(//td[@class='x-btn-center'])[7]")).click();
driver.findElement(By.xpath("(//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']//following::a[@class='linktext'])[1]")).click();
//driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]")).click();
//driver.findElement(By.xpath("((//div[@class='x-panel-mc'])[7]//a[@class='linktext'])[1]")).click();
driver.findElement(By.xpath("//a[text()='Delete']")).click();
//driver.findElement(By.xpath("(//div[@class='frameSectionBody']//a)[3]")).click();
//driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
//
String text1 = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]")).getText();
driver.findElement(By.xpath("(//label[text()='Lead ID:']/following::input)[1]")).sendKeys(text1);
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();




	
	}

}
