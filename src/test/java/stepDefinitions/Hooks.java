package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks
{
	TestContext testContext;
	WebDriver driver;

	public Hooks(TestContext context)
	{
		testContext = context;
	}

	@Before
	public void BeforeSteps()
	{
		driver = testContext.getWebDriverManager().getDriver();
	}


	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				//This takes a screenshot from the driver at save it to the specified location
				File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);

				//Building up the destination path for the screenshot to save
				//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
				File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/failure_screenshots/" + screenshotName + "_" + timestamp() + ".png");

				//Copy taken screenshot from source location to destination location
				Files.copy(sourcePath, destinationPath);   

				//This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
			} 
		}
	}

	public String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}


	@After(order = 0)
	public void AfterSteps() throws Exception {
		Thread.sleep(3000);
		testContext.getWebDriverManager().closeDriver();
	}
}
