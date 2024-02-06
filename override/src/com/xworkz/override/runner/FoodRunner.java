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
	        
	        Food food1=new Fruit();
	        food1.eat();
	        food1.digest();
	        food1.prepare();
	        food1.digest();
	        
	        
	        Orange orange=new Orange();
	        orange.digest();
	        orange.eat();
	        orange.peel();
	        orange.prepare();
	        orange.juice();
	        
	        Food orange1=new Orange();
	        orange1.eat();
	        orange1.digest();
	        orange1.prepare();
	        orange1.digest();
	        
	        Fruit orange2=new Orange();
	        orange2.digest();
	        orange2.eat();
	        orange2.peel();
	        orange2.prepare();
	        
	        Orange fru =(Orange)orange;
	        fru.juice();
	        
	        Food foo=(Food)food1;
	        foo.digest();
	        
	        


	}

}
