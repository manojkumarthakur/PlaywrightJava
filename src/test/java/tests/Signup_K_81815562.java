package tests;

import com.microsoft.playwright.*;

//import nogrunt.pages.*;

public class Signup_K_81815562 {

    Playwright playwright;
    Browser browser;
    Page page;
    int waitime = 1000;

    public void runLogic() {
    	
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        
        
        //pageconstants
        
    	try {
    		//Step Number - 1
    	    
			//Step Number - 2
			page.navigate("https://pay.transfi.com/login");
			
			//Step Number - 3
			Locator Createyour2 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV[5]/A");
			Createyour2.click();

			
			//Step Number - 4
			Locator SignUptoBi3 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV/DIV/DIV[2]/DIV/DIV/H2");
			SignUptoBi3.click();

			
			//Step Number - 5
			Locator Whatisyour4 = page.locator("#field-:r2:");
			Whatisyour4.click();

			
			//Step Number - 6
			Locator Whatistheb5 = page.locator("#field-:r3:");
			Whatistheb5.click();

			
			//Step Number - 7
			Locator Whatistheb6 = page.locator("#field-:r3:");
			Whatistheb6.click();

			
			//Step Number - 8
			Locator Selectcoun7 = page.locator("#field-:r4:");
			Selectcoun7.click();

			
			//Step Number - 9
			Locator Whoisfilli8 = page.locator("#field-:r5:");
			Whoisfilli8.click();

			
			//Step Number - 10
			Locator Whoisfilli9 = page.locator("#field-:r6:");
			Whoisfilli9.click();

			
			//Step Number - 11
			Locator Whatisyour10 = page.locator("#field-:r7:");
			Whatisyour10.click();

			
			//Step Number - 12
			Locator Select11 = page.locator("#menu-button-:ra:");
			Select11.click();

			
			//Step Number - 13
			Locator field12 = page.locator("(//*[@id=\"field-:r8:\"])[1]");
			field12.click();

			
			//Step Number - 14
			Locator field13 = page.locator("(//*[@id=\"menu-list-:ra:-menuitem-:r8k:\"]/DIV/P)[1]");
			field13.click();

			
			//Step Number - 15
			Locator field14 = page.locator("#field-:r8:");
			field14.click();

			
			//Step Number - 16
			Locator ByContinui15 = page.locator("#field-:rb:");
			ByContinui15.click();

			
			//Step Number - 17
			Locator Signup16 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV/DIV/DIV[2]/DIV/BUTTON");
			Signup16.click();

			
			//Step Number - 18
			Locator OTPVerific17 = page.locator("#pa-otp-inputs-0");
			OTPVerific17.fill("");

			
			//Step Number - 19
			Locator OTPverifed18 = page.locator("#toast-3-title");
			OTPverifed18.click();

			
			//Step Number - 20
			Locator NewPasswor19 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV/DIV/DIV[2]/DIV/DIV[2]/DIV/DIV/INPUT");
			NewPasswor19.click();

			
			//Step Number - 21
			Locator ConfirmPas20 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV/DIV/DIV[2]/DIV/DIV[3]/DIV/DIV/INPUT");
			ConfirmPas20.click();

			
			//Step Number - 22
			Locator Continue21 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV/DIV/DIV[2]/DIV/BUTTON");
			Continue21.click();

			
			//Step Number - 23
			Locator Success22 = page.locator("#toast-4");
			Success22.click();

			
			//Step Number - 24
			Locator Email23 = page.locator("#email");
			Email23.click();

			
			//Step Number - 25
			Locator Password24 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV/DIV/INPUT");
			Password24.click();

			
			//Step Number - 26
			Locator Email25 = page.locator("#email");
			Email25.click();

			
			//Step Number - 27
			Locator Password26 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV/DIV/INPUT");
			Password26.click();

			
			//Step Number - 28
			Locator Login27 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV[2]/DIV/DIV/BUTTON[2]");
			Login27.click();

			
			//Step Number - 29
			Locator Usernotfou28 = page.locator("#toast-5");
			Usernotfou28.click();

			
			//Step Number - 30
			Locator Usernotfou29 = page.locator("//*[@id=\"toast-5\"]/DIV");
			Usernotfou29.click();

			
			//Step Number - 31
			Locator Setup2FA30 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV[2]/DIV/H1");
			Setup2FA30.click();

			
			//Latest Step
			Locator Setup2FA31 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV[2]/DIV/H1");
			Setup2FA31.click();

			//Add from Here
    	} catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            browser.close();
            playwright.close();
        }
    }
}