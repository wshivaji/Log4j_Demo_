
package Log4j_Demo_;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo_1 {

	public WebDriver driver;
	public ExtentReports report;
	public ExtentSparkReporter spark;
	
	public Logger log = Logger.getLogger(demo_1.class);

	@BeforeClass
	public void test1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		report=new ExtentReports();
		spark = new ExtentSparkReporter("ExtentReport/TestReport.html");
		spark.config().setDocumentTitle("This is Test Report 1");
		spark.config().setReportName("Sample Report 1");
		spark.config().setTheme(Theme.DARK);
		spark.config().setEncoding("utf-8");
		report.attachReporter(spark);
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);

	}
	
	

}
