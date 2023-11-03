package com.WebElementMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class Demo_TakeScreenShot_9  extends BaseTest{

	public static void main(String[] args) throws IOException {
		
		openApp("chrome", "https://www.browserstack.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("E:\\ANIL PC\\ASH LOCAL_F WORKSPACE\\sample1.jpeg");
		Files.copy(scr, des);
	}

}
