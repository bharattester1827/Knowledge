package Knowledge.KnowledgeTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BasePage{
	
	public static void ClickOnElement (By by) {
		driver.findElement(by).click();		
	}
	public static void SelectElement (By by) {
		driver.findElement(by).isSelected();
	}
	public static void EnterText (By by, String text) {
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(text);
	}
	public static String GetTextFromElement (By by) {
		return driver.findElement(by).getText();
	}
	public static void WaitForElementToBeVisible (By by, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
	}
	public static void WaitForElementToPresence (By by, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

}
