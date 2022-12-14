package com.inetBankingV1.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.inetBankingV1.pageObjects.BuyBookPage;

public class CommonMethods {
	WebDriver driver;
	BuyBookPage bbp;

	public CommonMethods(WebDriver driver) {
		this.driver = driver;
		bbp = new BuyBookPage(driver);

	}

	public void keyDown() throws AWTException {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);

	}

	public void switchToNewWindow(String parentWindow) throws InterruptedException {

		Thread.sleep(5000);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while (it.hasNext()) {
			String childWindow = it.next();
			if (!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);

			}
		}
	}
	
	public void waitForElementLoaded(WebElement element) {
		// explicit wait - to wait for the compose button to be click-able
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
