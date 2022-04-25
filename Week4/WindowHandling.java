package Week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		WebElement image = driver.findElement(By.xpath("//input[@name='partyIdFrom']/following-sibling::a/img"));
		image.click();
	Set<String> windows = driver.getWindowHandles();
	List<String> name=new ArrayList<String>(windows);
	driver.switchTo().window(name.get(1));
//	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Arun");
//	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("SJ");
//	driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
	//System.out.println("Title of the page:" + driver.getTitle());
	driver.findElement(By.xpath("(//div[@class='x-grid3-body']/div[2]//a)[1]")).click();
		driver.switchTo().window(name.get(0));
		
	WebElement img = driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]"));
	img.click();

		
	Set<String> windows2 = driver.getWindowHandles();
	List<String> name2=new ArrayList<String>(windows2);
	driver.switchTo().window(name2.get(1));
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Arun");
//	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("SJ");
driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
driver.findElement(By.linkText("Arun")).click();
//driver.findElement(By.xpath("(//div[@class='x-grid3-body']/div[2]//a)[10]")).click();
	driver.switchTo().window(name2.get(0));
	driver.findElement(By.xpath("(//form[@name='MergePartyForm']//a)[3]")).click();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	//String text = alert.getText();
//System.out.println(text);
//alert.accept();
	System.out.println("Title of the page:" + driver.getTitle());
	}

}
