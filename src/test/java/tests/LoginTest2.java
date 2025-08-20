package tests;

import base.BaseTest;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.testng.SkipException;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LoginTest2 extends BaseTest {

    @Test
    void loginTest1() throws InterruptedException {
        LoginPage loginPage = new LoginPage(page);
        HomePage homePage = new HomePage(page);

        test.info("Navigating to Login page ");
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        test.info("Loging in ");
        loginPage.login("Admin", "admin123");
        test.info("Clicking Time link ");
//        homePage.clickTimeLink();
        test.info("Test completed ");
        System.out.println(" Running LoginTest2 loginTest1");
        Thread.sleep(2000);
    }
    @Test
    void loginTest2() throws InterruptedException {
        test.skip("Test skipped");
        throw new SkipException("skipping test");
    }
    @Test
    void loginTest3() throws InterruptedException {
        LoginPage loginPage = new LoginPage(page);
        HomePage homePage = new HomePage(page);

        test.info("Navigating to Login page ");
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        test.info("Loging in ");
        loginPage.login("Admin", "admin123");
        test.info("Clicking Time link ");
        homePage.clickTimeLink();
        test.info("Test completed ");

        Thread.sleep(2000);
    }

}
