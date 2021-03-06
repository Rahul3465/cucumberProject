package runners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/functionalTests",
		glue= "stepDefinitions",strict=true,monochrome = true,
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
		)
public class TestRunner
{
	@AfterClass
	public static void writeExtentReport() 
	{
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("OS Name", System.getProperty("os.name"));
		Reporter.setSystemInfo("OS Version", System.getProperty("os.version"));
		Reporter.setSystemInfo("OS Arch", System.getProperty("os.arch"));
		Reporter.setSystemInfo("Java Version", System.getProperty("java.version"));
	}
}
