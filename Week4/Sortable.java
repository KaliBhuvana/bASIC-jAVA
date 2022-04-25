package Week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Sortable")).click();
		//WebElement frame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(0);
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
		Point location = item7.getLocation();
		int x = location.getX();
		int y = location.getY();
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(item3, x, y).perform();
	}

}
