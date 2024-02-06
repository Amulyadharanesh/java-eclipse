package com.xworkz.override.runner;

import com.xworkz.override.CanonPrinter;
import com.xworkz.override.Printer;
import com.xworkz.override.SmartCanonPrinter;

public class PrintRunner {

	public static void main(String[] args) {
		
	Printer printer=new Printer();
	printer.copy();
	printer.print();
	printer.scan();
	
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
	
	CanonPrinter canonprinter=new CanonPrinter();
	canonprinter.copy();
	canonprinter.print();
	canonprinter.scan();
	canonprinter.connectToWifi();
	
	Printer canonprinter1= new CanonPrinter();
	canonprinter1.copy();
	canonprinter.print();
	canonprinter.scan();
	canonprinter.connectToWifi();
	
	System.out.println("********************************");
	
	
	SmartCanonPrinter print=new SmartCanonPrinter();
	print.print();
	print.copy();
	print.scan();
	print.connectToWifi();
	print.connectToMobile();
	
	CanonPrinter print1=new SmartCanonPrinter();
	print1.print();
	print1.copy();
	print1.scan();
	print1.connectToWifi();
	
	Printer print2=new SmartCanonPrinter();
	print2.copy();
	print2.print();
	print2.scan();
	
	System.out.println("|||||||||||||||||||||||||||||||||");
	
	CanonPrinter canonprinter2=(CanonPrinter)canonprinter;
	canonprinter2.connectToWifi();
	
	SmartCanonPrinter print3=(SmartCanonPrinter)print;
	print3.connectToMobile();
	
	}

}
