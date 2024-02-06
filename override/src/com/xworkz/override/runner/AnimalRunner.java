package com.xworkz.override.runner;

import com.xworkz.override.Animal;
import com.xworkz.override.Dog;
import com.xworkz.override.GoldenRetriever;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Animal animal=new Animal();
		animal.eat();
		animal.sleep();
		animal.makeSound();
		
		Dog dog=new Dog();
		dog.eat();
		dog.sleep();
		dog.makeSound();
		dog.guard();
		
		Animal dog1=new Dog();
		dog1.eat();
		dog1.sleep();
		dog1.makeSound();
		//dog1.guard();
		
		GoldenRetriever retriever=new GoldenRetriever();
		retriever.eat();
		retriever.sleep();
		retriever.makeSound();
		retriever.guard();
		retriever.cute();
		
		Animal retriever1=new GoldenRetriever();
		retriever1.eat();
		retriever1.sleep();
		retriever1.makeSound();
        //retriever1.cute();
        
        Dog retriever2=new GoldenRetriever();
		retriever2.eat();
		retriever2.sleep();
		retriever2.makeSound();
		retriever2.guard();
        //retriever2.cute(); 
        
        GoldenRetriever golden=(GoldenRetriever)retriever; 
		golden.cute();
		
		Dog dog3=(Dog)dog;
		dog3.guard();

	}

}
