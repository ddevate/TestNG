package selenium.test;

import static page.objects.HomePage.multipleWindowsLink;
import static page.objects.WindowsPage.clickHereLink;
import static page.objects.WindowsPage.newWindowText;
import static selenium.test.Test1.driver;

import java.io.IOException;

import org.testng.annotations.Test;

public class Test5 {

	@Test(priority = 5)
	public static void windowSwitchOperations() throws InterruptedException, IOException {

		// Load Home Page URL
		driver.get("http://the-internet.herokuapp.com");

		// Open New Window Page
		multipleWindowsLink().click();
		clickHereLink().click();

		// Save Current Window Handle
		String firstWinHandle = driver.getWindowHandle();

		// Loop Through All Handles & Switch
		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(firstWinHandle)) {
				driver.switchTo().window(handle);
				System.out.println("Text Present In New Window: " + newWindowText().getText());

				// Close Current Window
				driver.close();

			}
		}

		// Switch To Original Window
		driver.switchTo().window(firstWinHandle);
	}
}
