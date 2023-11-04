package com.RobotClass;

import java.awt.AWTException;
import java.awt.Robot;

public class Demo_B 
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
	
	Robot	r=new Robot();
	
	for(int i=1; i<=500; i+=10)
	{
		r.mouseMove(200+i,150);
		Thread.sleep(500);
		
	}
		
	}
	
}
