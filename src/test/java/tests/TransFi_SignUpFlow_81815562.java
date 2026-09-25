package tests;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

import java.nio.file.Paths;

//import nogrunt.pages.*;

public class TransFi_SignUpFlow_81815562 {

    Playwright playwright;
    Browser browser;
    Page page;
    int waitime = 1000;

    @Test
    public void runLogic() {
    	
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        
        
        //pageconstants
        
    	try {
    		//Step Number - 1
    	    
			//Step Number - 2
			page.navigate("https://checkout-dashboard.transfi.com/signup");
			
			//Step Number - 3
			Locator Whatisyour2 = page.locator("#field-:r0:");
			Whatisyour2.click();

			
			//Step Number - 4
			Locator Selectcoun3 = page.locator("#field-:r1:");
			Selectcoun3.click();

			
			//Step Number - 5
			Locator Selectcoun4 = page.locator("#field-:r1:");
			Selectcoun4.click();

			
			//Step Number - 6
			Locator Whoisfilli5 = page.locator("(//*[@id=\"field-:r2:\"])[1]");
			Whoisfilli5.click();

			
			//Step Number - 7
			Locator Whoisfilli6 = page.locator("(//*[@id=\"field-:r2:\"])[1]");
			Whoisfilli6.click();

			
			//Step Number - 8
			Locator Whoisfilli7 = page.locator("(//*[@id=\"field-:r2:\"])[2]");
			Whoisfilli7.click();

			
			//Step Number - 9
			Locator Whoisfilli8 = page.locator("(//*[@id=\"field-:r2:\"])[2]");
			Whoisfilli8.click();

			
			//Step Number - 10
			Locator Whatisyour9 = page.locator("#field-:r3:");
			Whatisyour9.click();

			
			//Step Number - 11
			Locator Whatisyour10 = page.locator("#field-:r3:");
			Whatisyour10.click();

			
			//Step Number - 12
			Locator Whatistheb11 = page.locator("#field-:r4:");
			Whatistheb11.click();

			
			//Step Number - 13
			Locator Select12 = page.locator("#menu-button-:r7:");
			Select12.click();

			
			//Step Number - 14
			Locator field13 = page.locator("(//*[@id=\"field-:r5:\"])[1]");
			field13.click();

			
			//Step Number - 15
			Locator field14 = page.locator("(//*[@id=\"menu-list-:r7:-menuitem-:r27:\"]/DIV/P)[1]");
			field14.click();

			
			//Step Number - 16
			Locator field15 = page.locator("(//*[@id=\"field-:r5:\"])[2]");
			field15.click();

			
			//Step Number - 17
			Locator Continue16 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV[2]/DIV/BUTTON");
			Continue16.click();

			
			//Step Number - 18
			Locator OTPVerific17 = page.locator("#pin-input-:r9o:-0");
			OTPVerific17.click();

			
			//Step Number - 19
			Locator OTPVerific18 = page.locator("#pin-input-:r9o:-1");
			OTPVerific18.click();

			
			//Step Number - 20
			Locator OTPVerific19 = page.locator("#pin-input-:r9o:-2");
			OTPVerific19.click();

			
			//Step Number - 21
			Locator OTPVerific20 = page.locator("#pin-input-:r9o:-3");
			OTPVerific20.click();

			
			//Step Number - 22
			Locator OTPVerific21 = page.locator("#pin-input-:r9o:-4");
			OTPVerific21.click();

			
			//Step Number - 23
			Locator OTPVerific22 = page.locator("#pin-input-:r9o:-5");
			OTPVerific22.click();

			
			//Step Number - 24
			Locator NewPasswor23 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV[2]/DIV[2]/DIV/DIV/INPUT");
			NewPasswor23.click();

			
			//Step Number - 25
			Locator ConfirmPas24 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV[2]/DIV[3]/DIV/DIV/INPUT");
			ConfirmPas24.click();

			
			//Step Number - 26
			Locator ConfirmPas25 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV[2]/DIV[3]/DIV/SPAN//*[name() = \"svg\"]");
			ConfirmPas25.click();

			
			//Step Number - 27
			Locator NewPasswor26 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV[2]/DIV[2]/DIV/SPAN//*[name() = \"svg\"]");
			NewPasswor26.click();

			
			//Step Number - 28
			Locator Continue27 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV[2]/BUTTON");
			Continue27.click();

			
			//Step Number - 29
			Locator Continue28 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV[2]/BUTTON");
			Continue28.click();

			
			//Step Number - 30
			Locator Verify2FA29 = page.locator("#pin-input-:ra1:-0");
			Verify2FA29.click();

			
			//Step Number - 31
			Locator Verify2FA30 = page.locator("#pin-input-:ra1:-1");
			Verify2FA30.click();

			
			//Step Number - 32
			Locator Verify2FA31 = page.locator("#pin-input-:ra1:-2");
			Verify2FA31.click();

			
			//Step Number - 33
			Locator Verify2FA32 = page.locator("#pin-input-:ra1:-3");
			Verify2FA32.click();

			
			//Step Number - 34
			Locator Verify2FA33 = page.locator("#pin-input-:ra1:-4");
			Verify2FA33.click();

			
			//Step Number - 35
			Locator Verify2FA34 = page.locator("#pin-input-:ra1:-5");
			Verify2FA34.click();

			
			//Step Number - 36
			Locator Email35 = page.locator("#field-:r0:");
			Email35.click();

			
			//Step Number - 37
			Locator Password36 = page.locator("#field-:r1:");
			Password36.click();

			
			//Step Number - 38
			Locator Email37 = page.locator("#field-:r0:");
			Email37.click();

			
			//Step Number - 39
			Locator Password38 = page.locator("#field-:r1:");
			Password38.click();

			
			//Step Number - 40
			Locator Password39 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/FORM/DIV[2]/DIV/DIV/BUTTON/*[name() = \"svg\" and @class=\"chakra-icon css-onkibi\"]");
			Password39.click();

			
			//Step Number - 41
			Locator Continue40 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/FORM/BUTTON");
			Continue40.click();

			
			//Step Number - 42
			Locator Continue41 = page.locator("#pa-otp-inputs-0");
			Continue41.click();

			
			//Step Number - 43
			Locator Continue42 = page.locator("#pa-otp-inputs-0");
			Continue42.click();

			
			//Step Number - 44
			Locator Continue43 = page.locator("#pa-otp-inputs-1");
			Continue43.click();

			
			//Step Number - 45
			Locator Continue44 = page.locator("#pa-otp-inputs-2");
			Continue44.click();

			
			//Step Number - 46
			Locator Continue45 = page.locator("#pa-otp-inputs-2");
			Continue45.click();

			
			//Step Number - 47
			Locator Continue46 = page.locator("#pa-otp-inputs-1");
			Continue46.click();

			
			//Step Number - 48
			Locator Continue47 = page.locator("#pa-otp-inputs-0");
			Continue47.click();

			
			//Step Number - 49
			Locator Continue48 = page.locator("#pa-otp-inputs-0");
			Continue48.click();

			
			//Step Number - 50
			Locator Continue49 = page.locator("#pa-otp-inputs-1");
			Continue49.click();

			
			//Step Number - 51
			Locator Continue50 = page.locator("#pa-otp-inputs-2");
			Continue50.click();

			
			//Step Number - 52
			Locator Continue51 = page.locator("#pa-otp-inputs-3");
			Continue51.click();

			
			//Step Number - 53
			Locator Continue52 = page.locator("#pa-otp-inputs-4");
			Continue52.click();

			
			//Step Number - 54
			Locator Loading53 = page.locator("#pa-otp-inputs-5");
			Loading53.click();

			
			//Step Number - 55
			Locator Continue54 = page.locator("#pa-otp-inputs-5");
			Continue54.click();

			
			//Latest Step
			Locator Getstarted55 = page.locator("(//*[@id=\"root\"]/DIV/DIV[2]/DIV/DIV/DIV[2]/DIV/DIV/DIV/P)[1]");
			Getstarted55.click();

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