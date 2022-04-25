package Week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
driver.findElement(By.linkText("Contacts")).click();
driver.findElement(By.xpath("//a[text()='My Contacts']/following::a")).click();
driver.findElement(By.id("firstNameField")).sendKeys("Kali Bhuvana");
driver.findElement(By.id("lastNameField")).sendKeys("M.");
driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Bhuvi");
driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Bhu");
driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Analysis");
driver.findElement(By.id("createContactForm_description")).sendKeys("kjghjhrhg");
driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ab@gmail.com");
WebElement dropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	Select drop=new Select(dropdown);
	drop.selectByValue("UT");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.xpath("((//div[@class='x-panel-tc'])[25]//a)[1]")).click();
	driver.findElement(By.id("updateContactForm_description")).clear();
	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("AKFJHFUHREHYGUVB");
	driver.findElement(By.xpath("(//textarea[@id='updateContactForm_importantNote']/following::input)[1]")).click();
	String title=driver.getTitle();
	System.out.println(title);
	
	}

}
