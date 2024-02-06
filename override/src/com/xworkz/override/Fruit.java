package com.xworkz.override;

public class Fruit extends Food {
	
	

	    @Override
	    public void eat() {
	        System.out.println("Eating fruit");
	    }
	    
	    @Override
	    public void digest() {
	        System.out.println("Food is being digested");
	    }

	    @Override
	    public void prepare() {
	        System.out.println("Food is being prepared");
	    }

	 
	    public void peel() {
	        System.out.println("Peeling the fruit");
	    }

	   
	}

