package page.objects;

import static selenium.test.Test1.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WindowsPage {

	public static WebElement clickHereLink() {
		return driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
	}
	
	public static WebElement newWindowText() {
		return driver.findElement(By.xpath("//h3[contains(text(),'New Window')]"));
	}

}
