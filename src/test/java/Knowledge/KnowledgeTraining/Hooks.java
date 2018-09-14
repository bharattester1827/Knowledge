package Knowledge.KnowledgeTraining;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BasePage {
	BrowserSetup browserSelector = new BrowserSetup();
	LoadProp loadprop = new LoadProp();
	
	@Before
	public void OpenBrowser() {
		browserSelector.selectBrowser();
		driver.get(loadprop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void ScreenshotandCloseBrowser() {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File ("src\\test\\Screenshot" + System.currentTimeMillis()+ "\\error.png"));
			System.out.println("Screenshot Taken");
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		driver.close();
	}
}
