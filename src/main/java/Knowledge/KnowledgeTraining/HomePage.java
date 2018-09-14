package Knowledge.KnowledgeTraining;

import org.openqa.selenium.By;

public class HomePage extends Utils {
	private By _tnccheckbox = By.xpath("//*[@id='gdpr-step1']/div/ul/li[1]/input");
	private By _datacheckbox = By.xpath("//*[@id='gdpr-step1']/div/ul/li[2]/input");
	private By _policycheckbox = By.xpath("//*[@id='gdpr-step1']/div/ul/li[3]/input");
	private By _agreebutton = By.xpath("//*[@id='gdprTC_Agree']");
	private By _clickonsignin = By.id("google-login");
	private By _googlemail = By.xpath(".//*[@type='email']");
	private By _nextgooglebutton = By.xpath("//*[@id='identifierNext']/content");
	private By _googlepassword = By.xpath(".//*[@type='password']");
	private By _Bollywoodtop50 = By.xpath("//img[@alt='Bollywood Top 50']");
	
	public void clickonsigninbutton () {
		Utils.ClickOnElement(_clickonsignin);
	}
	public void tnccheckboxclick () {
		Utils.ClickOnElement(_tnccheckbox);
	}
	public void datacheckboxclick () {
		Utils.ClickOnElement(_datacheckbox);
	}
	public void policycheckboxclick () {
		Utils.ClickOnElement(_policycheckbox);
	}
	public void agreebuttonclick () {
		Utils.ClickOnElement(_agreebutton);
	}
	public void entergoogleemail (String username) {
		Utils.EnterText(_googlemail, "patel.bharat1827");		
	}
	public void nextgooglebuttonclick() {
		Utils.ClickOnElement(_nextgooglebutton);
	}
	public void entergooglepassword (String password) {
		Utils.EnterText(_googlepassword, "15thfeb09");
	}
	public void ClickonBollywoodTop50 () {
		//Utils.WaitForElementToPresence(_Bollywoodtop50, 10);
		Utils.ClickOnElement(_Bollywoodtop50);
	}
}
