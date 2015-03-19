package auction;

import java.time.LocalDateTime;

public class Bid {

	public Bid(){
		
	}
	
	private double amount;
	private Buyer who;
	private LocalDateTime when;
	
	public double GetAmount(){
		return amount;
	}
	
	public void SetAmount(double bid){
		amount = bid;
	}
	
	public String GetBuyer(){
		return who.username;
	}
}
