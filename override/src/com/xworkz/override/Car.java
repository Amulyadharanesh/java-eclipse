package com.xworkz.override;

public class Car extends Vehicle{
	
	    @Override
	    public void start() {
	        System.out.println("Car starts");
	    }

	    @Override
	    public void accelerate() {
	        System.out.println("Car accelerates");
	    }

	    @Override
	    public void stop() {
	        System.out.println("Car stops");
	    }

	    public void honk() {
	        System.out.println("Car honks");
	    }
	}
