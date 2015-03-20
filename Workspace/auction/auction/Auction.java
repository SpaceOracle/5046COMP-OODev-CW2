package auction;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Auction implements Blockable {

	private double startPrice, reservePrice;
	private LocalDateTime closeDate;
	private char status;
	private Item description;
	private Bid currentHighest;
	
	public Auction(double startPrice, double reservePrice, LocalDateTime closeDate) {
		this.startPrice = startPrice;
		this.reservePrice = reservePrice;
		this.closeDate = closeDate;
		status = 'O';
	}
	
	public void PlaceBid(){
		Scanner bidder = new Scanner(System.in);
		
		System.out.println("Please enter a new bid for this item");
		
		double t_bid;
		
		t_bid = bidder.nextDouble();
		
		if(t_bid < currentHighest.GetAmount())
		{
			System.out.println("Error: Amount too low to make bid");
		}
		else if(t_bid > currentHighest.GetAmount())
		{
			System.out.println("Bid placed, congratulations");
			currentHighest.SetAmount(t_bid);
		}
		
		bidder.close();
	}
	
	public void Verify(){
		if(status == 'C'){
			System.out.println("This auction is no longer available, please try a different auction");
		}
		else if(status == 'O')
		{
			System.out.println("Auction verified, bid placed");
		}
		else if(status == 'B')
		{
			System.out.println("Auction is blocked, please try a different auction");
		}
	}
	
	public void Close(){
		if(closeDate.isBefore(LocalDateTime.now()) && (status == 'O')){
			status = 'C';
		}
		else{
			
		}
	}
	
	public boolean IsBlocked(){
		return false;
	}
	
	public void SetBlocked(){
		
	}
	
	public void SetDescription(String desc){
		description.SetDescription();
	}
	
	public String GetDescription(){
		return description.GetDescription();
	}
	
	public char GetStatus(){
		return status;
	}
	
	public double GetHighest(){
		return currentHighest.GetAmount();
	}
}
