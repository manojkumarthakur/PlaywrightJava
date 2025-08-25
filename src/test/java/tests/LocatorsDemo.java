package tests;

import base.BaseTest;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.testng.annotations.Test;

public class LocatorsDemo extends BaseTest {

    @Test
    public void testAllLocatorsSelf() throws InterruptedException {
        page.navigate("https://trytestingthis.netlify.app/");

        page.locator("#fname").fill("tom");
        page.locator("input[name='lname']").fill("jerry");
        page.locator("input[value='male']").check();
        page.locator("input[type='radio']").nth(1).check();
        page.locator("input[type='radio']").nth(2).check();
        page.locator("select#option").selectOption("option 3");
        page.locator("input[type='checkbox'][value='Option 2']").check();
        page.getByLabel("Option 1").check();
        page.locator("//*[@id='day']").fill("2025-07-25");
        page.getByText("Double-click me").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
//        Thread.sleep(5000);
        page.pause();
    }

    @Test
    public void testAllLocators() {

        page.navigate("https://trytestingthis.netlify.app/");

        // using ID attribute
        page.locator("#fname").fill("Tom");
        // using name attribute
        page.locator("input[name='lname']").fill("Jerry");

        // select radio button using value, type and index
        page.locator("input[value='male']").check();
        page.locator("input[type='radio']").nth(1).check();

        // dropdown
        page.locator("select#option").selectOption("option 2");

        // checkboxes
        page.locator("input[type='checkbox'][value='Option 3']").check();
        page.getByLabel("Option 1").check();

        // date
        page.locator("//input[@type='date']").fill("2025-07-15");

        page.getByText("Click Me").click();

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();

        page.pause();
    }
}
