package loan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class loan1 {
	
	WebDriver driver;
	
	ExtentReports report;
	ExtentTest logger;
	public void test(String name,String lname)
	{
		report=new ExtentReports("C:\\Report3\\homeloan.html");
		logger=report.startTest("test");
	 driver.findElement(By.xpath(".//*[@id='txtFirstName']")).sendKeys(name);
	 logger.log(LogStatus.PASS, "name");
	 driver.findElement(By.xpath(".//*[@id='txtMiddleInitial']")).sendKeys(lname);
	

}
}
