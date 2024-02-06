package com.xworkz.override.runner;

import com.xworkz.override.Car;
import com.xworkz.override.Omni;
import com.xworkz.override.Vehicle;

public class CarRunner {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.accelerate();
        vehicle.stop();
        
        Car car = new Car();
        car.start();
        car.accelerate();
        car.stop();
        car.honk();
        
        Vehicle car1=new Car();
        car1.start();
        car1.accelerate();
        car1.stop();
        //car1.honk();

        Omni omni = new Omni();
        omni.start();
        omni.accelerate();
        omni.stop();
        omni.old();
        
        Vehicle car2=new Omni();
        car2.start();
        car2.accelerate();
        car2.stop();
        //car2.old();
        
        Car car3=new Omni();
        car3.start();
        car3.accelerate();
        car3.stop();
        car3.honk();
        //car3.old();
        
        Car veh=(Car)car;
        veh.honk();
        
        Omni om=(Omni)omni;
        om.old();
        
        
        
        
        

        
       
	}

	

}
