package auction;

import java.time.LocalDateTime;

public class Bid {

	public Bid(){
		
	}
	
	private double amount;
	private Buyer who;
	private LocalDateTime when;
	private String buyer;
	
	public double GetAmount(){
		return amount;
	}
	
	public void SetAmount(double bid){
		amount = bid;
	}
	
	public String GetBuyer(){
		return buyer;
	}
	
	public void SetWhen(LocalDateTime date){
		when = date;
	}
	
	public LocalDateTime GetWhen(){
		return when;
	}
	
	public void SetBuyer(String buyer)
	{
		this.buyer = buyer;
	}
}
