package com.xworkz.override;

public class GoldenRetriever extends Dog {
	
	@Override	
	public void makeSound()	{
		
		System.out.println("Retriver make sound");
	}

	@Override
	public void eat() {
		
		System.out.println("Retriver eat");
	}

	@Override
	public void sleep() {
		
		System.out.println("Retriver sleep");
	}

	@Override
	public void guard() {
		
		System.out.println("Retriver guard");
	}
	
	public void cute() {
		
		System.out.println("Retriver is cute");
	}
	

}
