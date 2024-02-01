package com.xworkz.example.Runner;

import com.xworkz.example.Biscuit;
import com.xworkz.example.Location;
import com.xworkz.example.Monkey;
import com.xworkz.example.Tree;

public class Runner {

	public static void main(String[] args) {
		
	Tree tree=new Tree();
		
	tree.monkey = new Monkey();
	
	tree.monkey.type="macaques";
	
	tree.name="Mango";
	
	tree.location=new Location();
	
	tree.monkey.age=14;
	
	tree.monkey.biscuit=new Biscuit();
	
	tree.location.area="BTM";
	
	tree.location.city="Blore";
	
	tree.monkey.biscuit.brand="HIDE&SEEK";
	
	tree.monkey.biscuit.price=45.352d;
	
	System.out.println(tree.name);
	System.out.println(tree.monkey.age);
	System.out.println(tree.location.area);
	System.out.println(tree.location.city);
	System.out.println(tree.monkey.biscuit.brand);
	System.out.println(tree.monkey.biscuit.price);
	
	Tree plant=new Tree();
	System.out.println(plant.name);
	
		

	}

}
