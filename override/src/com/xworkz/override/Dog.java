package com.xworkz.override;

public class Dog extends Animal {

@Override	
public void makeSound()	{
	
	System.out.println("dog make sound");
}

@Override
public void eat() {
	
	System.out.println("dog eat");
}

@Override
public void sleep() {
	
	System.out.println("dog sleep");
}

public void guard() {
	
	System.out.println("dog guard");
}

}
