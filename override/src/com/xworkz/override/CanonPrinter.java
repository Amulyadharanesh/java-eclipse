package com.xworkz.override;

public class CanonPrinter extends Printer{

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

public void connectToWifi() {
	
	System.out.println("connect to wifi");
}

}
