package loan;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public void captureScreenshot(WebDriver driver,String screenshotname) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
	String destination="C:\\Users\\venkatapardhasaradhi\\application\\screenshots\\"+screenshotname+".png";
	File dest=new File(destination);
	FileUtils.copyFile(source, dest);
		
	}

}
