import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import jdk.swing.interop.SwingInterOpUtils;
import org.testng.annotations.Test;

public class ExtentReport {



    @Test
    public void loginTest() {



        System.out.println("Login to amazon");

        ExtentHtmlReporter reporter= new ExtentHtmlReporter("./Reports/learn_automation.html");
        ExtentReports extent= new ExtentReports();
        extent.attachReporter(reporter);
        ExtentTest logger=extent.createTest("LoginTest");
        logger.log(Status.INFO, "Login to amazon");
        logger.log(Status.PASS, "Title verified");
        extent.flush();

        ExtentTest logger2=extent.createTest("Logoff Test");
        logger2.log(Status.FAIL, "Title verified");
        extent.flush();


    }
}
