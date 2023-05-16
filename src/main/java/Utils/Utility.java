package Utils;

	import java.io.File;

	import java.io.IOException;
	import java.util.Date;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.io.FileHandler;

	public class Utility
	{
		public static void captureScreenshot(WebDriver driver,int testid) throws IOException
		{
				
				Date date = new Date();
			    String FileName = date.toString().replace(":", "_").replace(" ","_");
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest=new File("D:\\Screenshot\\"+FileName+"testid"+testid+".jpg");
				FileHandler.copy(src, dest);
		}
		
	}
