package com.xworkz.properties.Runner;

import com.xworkz.properties.DessertPlate;
import com.xworkz.properties.DinnerPlate;
import com.xworkz.properties.Kitchen;
import com.xworkz.properties.Plate;

public class PlateRunner {

	public static void main(String[] args) {
		
		Kitchen kitchen = new Kitchen();
        Plate plate = new Plate();
        kitchen.usePlate(plate);

        System.out.println("---------------------------");

        DinnerPlate dinnerPlate = new DinnerPlate();
        kitchen.usePlate(dinnerPlate);

        System.out.println("------------------------------");

        Plate plate2 = new DinnerPlate();
        kitchen.usePlate(plate2);

        System.out.println("-----------------------------------");

        DessertPlate dessertPlate2 = new DessertPlate();
        kitchen.usePlate(dessertPlate2);

        System.out.println("----------------------------------");

        Plate plate3 = new DessertPlate();
        kitchen.usePlate(plate3);

	}

}
