package com.xworkz.override;

public class SmartCanonPrinter extends CanonPrinter {
	
@Override
	public void print()	{
		
		System.out.println("print canon printer");
	}

@Override
	public void scan() {
		
		System.out.println("scan canon printer");
	}

@Override
	public void copy() {
		
		System.out.println("copy canon printer");
	}
@Override
	public void connectToWifi() {
		
		System.out.println("connect to wifi");
	}

public void connectToMobile() {
	
	System.out.println("connect to mobile");
}

}
