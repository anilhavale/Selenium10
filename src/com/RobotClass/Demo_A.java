package com.RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Demo_A 
{

	public static void main(String[] args) throws IOException, AWTException, InterruptedException
	{

		Runtime.getRuntime().exec("");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_H);
		r.keyPress(KeyEvent.VK_SHIFT);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_I);
		
	}

}
