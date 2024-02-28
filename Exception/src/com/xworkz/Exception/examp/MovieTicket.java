package com.xworkz.Exception.examp;

public class MovieTicket {
	
	public void buyTicket(int ticketNo) throws TicketException
	
	{
		
		if(ticketNo >=0 && ticketNo <= 5000)
		{
			System.out.println("movie ticket num is valid");
		}
		else
		{
			System.out.println("movie ticket num is not valid");
			throw new TicketException("movie not visible");
		}
	}
	
}
