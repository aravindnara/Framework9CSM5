package testscripts;

import java.util.Map;

import org.testng.Assert;

import genericLibraries.BaseClass;

public class AddAddressTest extends BaseClass {
	public void addAddressTest() throws InterruptedException  {
		Map<String, String> map = excel.getData("sheet1", "Add Address");
		welcome.clickLogginButton();
		login.loginToApp(map.get("Email"), map.get("Password"));
		Thread.sleep(2000);
		home.clickprofileButton();
		Thread.sleep(2000);
		myProfile.clickMyAddresses();
		myAddress.clickAddAddress();
		address.addAddressDetails(webUtil, map);
		Thread.sleep(2000);
		Assert.assertEquals(myAddress.getSuccessMessage(),"successfully added");
		Thread.sleep(2000);
		
		
		
	}

}
