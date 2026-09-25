package tests;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

public class TestingFOlders_47191573 {

    int waitTime = 1000;

    @Test
    public void runLogic() {

        // Auto-closes Playwright & Browser safely
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium()
                    .launch(new BrowserType.LaunchOptions().setHeadless(false));

            Page page = browser.newPage();

            //pageconstants

            try {
                //Step Number - 1
                
			//Step Number - 2
			page.navigate("http://demo.nogrunt.com:3000/LoginPage");
			
			//Step Number - 3
			Locator EmailAddre2 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV[2]/FORM/INPUT");
			EmailAddre2.click();

			
			//Step Number - 4
			Locator EmailAddre3 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV[2]/FORM/DIV/INPUT");
			EmailAddre3.click();

			
			//Step Number - 5
			Locator EmailAddre4 = page.locator("//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV[2]/FORM/DIV[3]/BUTTON");
			EmailAddre4.click();

			
			//Step Number - 6
			Locator TestStudio5 = page.locator("//SPAN[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1c18vsx' and text()='Test Studio']");
			TestStudio5.click();

			
			//Step Number - 7
			Locator Dashboard6 = page.locator("//SPAN[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1c18vsx' and text()='Dashboard']");
			Dashboard6.click();

			
			//Step Number - 8
			Locator Mobile7 = page.locator("//SPAN[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1c18vsx' and text()='Mobile']");
			Mobile7.click();

			
			//Step Number - 9
			Locator Dashboard8 = page.locator("(//*[@id=\"root\"]/DIV/DIV/DIV/DIV/DIV/DIV/UL)[1]");
			Dashboard8.click();

			
			//Latest Step
			Locator TestStudio9 = page.locator("//A[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-cu61yq' and text()='Test Studio']");
			TestStudio9.click();

			//Add from Here
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}