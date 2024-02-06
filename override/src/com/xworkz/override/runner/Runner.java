package com.xworkz.override.runner;

import com.xworkz.override.Window;
import com.xworkz.override.WoodWindow;

public class Runner {

	public static void main(String[] args) {
		
	Window window=new Window();
	window.open();
	window.close();
	window.semiClose();
	
	WoodWindow woodwindow=new WoodWindow();
	woodwindow.open();
	woodwindow.close();
	woodwindow.autoClose();
	
	Window dow=new WoodWindow();
	dow.open();
	dow.close();
	dow.semiClose();
	//dow.autoClose();
	
	WoodWindow woodwindow1=(WoodWindow)dow;
	woodwindow1.autoClose();
	
	
		
	}

}
