package Week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.model.Category;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.nykaa.com/");
WebElement mousehover = driver.findElement(By.xpath("//a[text()='brands']"));
//mousehover.click();
Actions builder=new Actions(driver);
builder.moveToElement(mousehover).perform();
driver.findElement(By.xpath("//div[@class='brandSearchWrapper']//input[@id='brandSearchBox']")).sendKeys("Loreal Paris");
	driver.findElement(By.xpath("(//div[@class='ss-content desktop-header']//a)[1]")).click();
	
	Thread.sleep(2000);
driver.findElement(By.xpath("//span[@class='sort-name']")).click();
//driver.findElement(By.xpath("//div[@id='filters-listing']/div[@id='filter-sort']")).click();	

	driver.findElement(By.xpath("//span[@class='sort-name']/following::span[text()='customer top rated']/following::div[1]")).click();
  /* WebElement hair = driver.findElement(By.xpath("//li[@class='MegaDropdownHeadingbox'][3]/a[text()='hair']"));
	Thread.sleep(2000);
   builder.moveToElement(hair).perform();
	driver.findElement(By.xpath("//a[text()='Shampoo']")).click();*/
	driver.findElement(By.xpath("//span[text()='Category']")).click();
	driver.findElement(By.xpath("//span[text()='Hair']")).click();
	driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
	driver.findElement(By.xpath("//span[text()='Hair Care']//following::span[text()='Shampoo']")).click();
	String text2 = driver.findElement(By.xpath("(//div[@id='filters-listing']//span)[2]")).getText();
	if(text2.contains("Shampoo"))
		System.out.println("Category chosen is shampoo");
	//driver.findElement(By.xpath("//a[@class='css-i5agiy']")).click();
	driver.findElement(By.xpath("//div[contains(text(), 'Paris 6 Oil Nourish Shampoo')]")).click();
	Set<String> windows = driver.getWindowHandles();
	List<String> name=new ArrayList<String>(windows);
	driver.switchTo().window(name.get(1));
	driver.findElement(By.xpath("//span[text()='704ml']")).click();
	/*String mrp = driver.findElement(By.xpath("(//span[@class='post-card__content-price-offer'])[1]")).getText();
	System.out.println("MRP" +mrp);
*/	
	driver.findElement(By.xpath("(//div[@class='pull-left'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	/*String mrp2 = driver.findElement(By.xpath("//div[@class='value medium-strong']")).getText();
	if (mrp==mrp2) {
		System.out.println("Same Price");
	}*/
	driver.findElement(By.xpath("//button[@class='btn full fill no-radius proceed ']")).click();
	driver.findElement(By.xpath("//button[@class='btn full big']")).click();
	/*WebElement color = driver.findElement(By.xpath("//li[@class='MegaDropdownHeadingbox'][3]/a[text()='hair']"));
	builder.moveToElement(color).perform();
	driver.findElement(By.xpath("//a[text()='Color Protection']")).click();

driver.findElement(By.xpath("(//div[@class=\"product-listing\"]//div/a)[1]")).click();

WebElement price = driver.findElement(By.xpath("//div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/span[2]/span[1]"));
String text = price.getText();
System.out.println("Price of the Product:" +text);*/
	}

}
