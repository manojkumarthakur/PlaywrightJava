package tests;


import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class PlayWrightCodegen {
    @Test
    public  void mainRun() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://playwright.dev/");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Docs")).click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Setting up CI")).click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Agents")).click();
            page.getByText("🎭 generator transforms the").click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Fixtures")).click();
        }
    }
}