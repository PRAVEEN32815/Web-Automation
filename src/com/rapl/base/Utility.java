package com.rapl.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility extends BasePage {
	
	static WebDriverWait wait;
	
	public static WebElement waitFor(WebElement element) {
		wait = new WebDriverWait(driver, 1000);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
