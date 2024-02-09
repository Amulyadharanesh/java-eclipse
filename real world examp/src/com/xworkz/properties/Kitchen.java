package com.xworkz.properties;

public class Kitchen {
	
	 public void usePlate(Plate plate) {
	        plate.material = "Ceramic";
	        System.out.println( plate.material);
	        plate.serve();

	        if (plate instanceof DinnerPlate) {
	            DinnerPlate dinnerPlate = (DinnerPlate) plate;
	            dinnerPlate.size = 10;
	            System.out.println( dinnerPlate.size);
	            dinnerPlate.holdMainCourse();

	        } else if (plate instanceof DessertPlate) {
	            DessertPlate dessertPlate = (DessertPlate) plate;
	            dessertPlate.shape = "Round";
	            System.out.println(dessertPlate.shape);
	            dessertPlate.holdDessert();
	        }
	    }

}
