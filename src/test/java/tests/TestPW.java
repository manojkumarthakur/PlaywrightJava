package tests;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class TestPW {

    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
        BrowserContext context = browser.newContext();
        Page page = context.newPage();
        page.navigate("https://demowebshop.tricentis.com");

        page.getByLabel("").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("manoj")).click();
    }
}
