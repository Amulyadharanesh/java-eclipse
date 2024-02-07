package com.xworkz.casting.handwashRunner;

import com.xworkz.casting.handwash.HandWash;
import com.xworkz.casting.handwash.Lux;
import com.xworkz.casting.handwash.Road;
import com.xworkz.casting.handwash.Sanitizer;
import com.xworkz.casting.handwash.Soap;

public class TextRunner {

	public static void main(String[] args) {
		
		Road road=new Road();
		
		HandWash handwash=new HandWash();
		road.runHandwash(handwash);
		
		Sanitizer sanitizer=new Sanitizer();
		road.Sanitizer(sanitizer);
		
		Soap soap =new Soap();
		road.Soap(soap);
		
		Lux lux=new Lux();
		road.Lux(lux);

	}	

}
