package Knowledge.KnowledgeTraining;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefini extends BasePage {
	HomePage homepage = new HomePage();
	
	@Given("^checking on checkbox$")
	public void checking_on_checkbox() {
	    homepage.tnccheckboxclick();
	    homepage.datacheckboxclick();
	    homepage.policycheckboxclick();
	    homepage.agreebuttonclick();
	}

	@When("^enter login details$")
	public void enter_login_details() throws InterruptedException {
		homepage.clickonsigninbutton();
		//driver.switchTo().alert().accept();
		Thread.sleep(10000);
		homepage.ClickonBollywoodTop50();
		/*homepage.clickonsigninbutton();
		driver.switchTo().alert();
		homepage.entergoogleemail("patel.bharat1827");
		homepage.nextgooglebuttonclick();
		homepage.entergooglepassword("15thfeb09");
		homepage.nextgooglebuttonclick();*/
		
	}

	@Then("^homepage load$")
	public void homepage_load() {
	   
	}




	
}
