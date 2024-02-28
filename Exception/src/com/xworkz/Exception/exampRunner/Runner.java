package com.xworkz.Exception.exampRunner;

import com.xworkz.Exception.examp.MovieTicket;

public class Runner {

	public static void main(String[] args) {
		
		try
		{
			MovieTicket movietkt=new MovieTicket();
			System.out.println("before check");
			movietkt.buyTicket(1000);
			System.out.println("after check");
		}
		
		catch(Exception e)
		{
			System.err.println("Handle the exception:"+e.getMessage());
			System.out.println("e.getclass");
		}
	}

}
