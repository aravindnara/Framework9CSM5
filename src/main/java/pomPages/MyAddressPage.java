package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressPage {
	//Declaration
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddressButton;
	@FindBy(xpath="")
	WebElement successMessage;
	//Initialization
	public MyAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void clickAddAddress() {
		addAddressButton.click();
	}
	public String getSuccessMessage() {
		return successMessage.getText();
	}

}
