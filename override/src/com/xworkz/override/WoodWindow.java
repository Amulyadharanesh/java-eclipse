package com.xworkz.override;

public class WoodWindow extends Window{
	
	@Override
	public void open() {
		
		System.out.println("woodWindow open");
	}
		
	@Override
		public void close() {
			
			System.out.println("woodWindow close");
		}
		
		public void autoClose() {
			
			System.out.println("woodWindow autoClose");
	}

}
