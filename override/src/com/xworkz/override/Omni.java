package com.xworkz.override;

public class Omni extends Car{
	
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

	    @Override
	    public void honk() {
	        System.out.println("Car honks");
	    }
	        
	     public void old() {
	    	
	    	System.out.println("omni is old");
	    	
	    }
	   }


