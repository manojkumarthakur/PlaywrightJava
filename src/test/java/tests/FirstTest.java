package tests;

import base.BaseTest;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

import java.nio.file.Paths;

public class FirstTest extends BaseTest {

    @Test
    public void verifyTest() throws InterruptedException {
        page.navigate("https://www.google.com/ncr");
        // Optional: Handle cookie popup
        if (page.isVisible("button:has-text('Accept all')")) {
            page.click("button:has-text('Accept all')");
        }
        System.out.println("Google No Country Redirect opened successfully...!");
        System.out.println("Page Title: " + page.title());
        Thread.sleep(5000);
    }

//    public static void main(String[] args) {
//        try (Playwright playwright = Playwright.create()) {
////            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
////            Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
//            Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
//            Page page = browser.newPage();
//            page.navigate("https://playwright.dev");
//            Thread.sleep(5000);
//            System.out.println(page.title());
//            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
//            browser.close();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
