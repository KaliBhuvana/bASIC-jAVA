package Week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://jqueryui.com/");
	driver.findElement(By.linkText("Draggable")).click();
	WebElement frame = driver.findElement(By.tagName("iframe"));
	driver.switchTo().frame(frame);
	WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
	Actions builder=new Actions(driver);
	builder.dragAndDropBy(drag, 100, 100).perform();
	}

}
