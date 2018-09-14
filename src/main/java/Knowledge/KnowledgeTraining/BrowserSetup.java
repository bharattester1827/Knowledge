package Knowledge.KnowledgeTraining;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSetup extends BasePage {
	LoadProp loadProp = new LoadProp();
	String browser = loadProp.getProperty("browser");

	public void selectBrowser(){

        if(browser.equalsIgnoreCase("firefox")){
        	System.setProperty("webdriver.gecko.driver", "src\\test\\java\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src\\test\\java\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver", "src\\test\\java\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }else {
            System.out.println("Browser name is wrong");
        }
    }
	
}
