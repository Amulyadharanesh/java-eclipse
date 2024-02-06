package com.xworkz.override.runner;

import com.xworkz.override.Food;
import com.xworkz.override.Fruit;
import com.xworkz.override.Orange;

public class FoodRunner {

	public static void main(String[] args) {
		
		 Food food = new Food();
	        food.eat();
	        food.digest();
	        food.prepare();

	        Fruit fruit = new Fruit();
	        fruit.eat();
	        fruit.digest();
	        fruit.peel();
	        fruit.prepare();
	        
	        Orange orange=new Orange();
	        orange.digest();
	        orange.eat();
	        orange.peel();
	        orange.prepare();
	        orange.juice();


	}

}
