package com.xworkz.casting.handwash;

public class Road {
	
   public void runHandwash(HandWash handwash) {
		System.out.println(handwash.aroma);
		handwash.clean();
		
		
		if(handwash instanceof HandWash)
		{
			HandWash handwash1=(HandWash)handwash;
			System.out.println(handwash1.aroma);
			handwash1.clean();
		}
		
		if(handwash instanceof Sanitizer)
		{
	
	     Sanitizer sanitizer=(Sanitizer)handwash;  
		 System.out.println(sanitizer.quantity);
		 sanitizer.disinfect();
		 
		}
		
		if(handwash instanceof Soap)
		{
			Soap soap=(Soap)handwash;
			System.out.println(soap.price);
			soap.foam();
		}
		
		if(handwash instanceof Lux)
		{
			Lux lux=(Lux)handwash;
			System.out.println(lux.ManuDate);
			lux.makeYoung();
			
		}	
   }
   
       public void Sanitizer(Sanitizer sanitizer) {
	     System.out.println(sanitizer.quantity);
	     sanitizer.disinfect();
       }
	   
	   public void Soap(Soap soap) {
		   System.out.println(soap.price);
		   soap.foam();
	   }
	   
	   public void Lux(Lux lux) {
		   System.out.println(lux.ManuDate);
		   lux.makeYoung();
}
}



