package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.microsoft.playwright.*;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ExtentManager;
import utils.ScreenshotUtil;

import javax.naming.ldap.ExtendedRequest;
import java.awt.*;
import java.lang.reflect.Method;
import java.util.Arrays;

public class BaseTest {

    protected Playwright playwright;
    protected Browser browser;
    protected Page page;
    protected ExtentReports extent;
    protected ExtentTest test;

    @BeforeMethod
    public void setUp(Method method){
        //Extent Reporting
        extent = ExtentManager.getInstance();
        test = extent.createTest(method.getName());

        // Playwright
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                .setHeadless(false).setSlowMo(1000));
//        page = browser.newPage();
//        page.setDefaultTimeout(4000);


        // for maximise browser- No direct method, use based on screen size or direct value
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        System.out.println(width + " : " + height);

//        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920,1080));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(width,height));
        page = context.newPage();

    }

    @AfterMethod
    public void tearDown(ITestResult result){
        if (result.getStatus() == ITestResult.FAILURE){
            test.fail(result.getThrowable());


            String screenshotPath = ScreenshotUtil.takeScreenshot(page, result.getName());

            System.out.println("*** screenshotPath : "+screenshotPath);
            String projectPath = System.getProperty("user.dir");

            String absoluteScreenshotPath = projectPath+"/"+screenshotPath;
            System.out.println(" *** absoluteScreenshotPath : "+absoluteScreenshotPath);

            test.addScreenCaptureFromPath(absoluteScreenshotPath, "screenshot");
//			test.addScreenCaptureFromBase64String(absoluteScreenshotPath, "screenshot");
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass("Test Passed");
        } else {
            test.skip("Test Skipped");
        }
// put in the report
        extent.flush();
        if (browser !=null) {
            browser.close();
        }
        if (playwright!=null){
            playwright.close();
        }
    }
}
