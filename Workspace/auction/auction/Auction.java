package auction;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Auction implements Blockable {

	private double startPrice, reservePrice;
	private LocalDateTime closeDate;
	private char status;
	//private Item description;
	private Item description = new Item();
	//private Bid currentHighest;
	private Bid currentHighest = new Bid();
	
	public Auction(double startPrice, double reservePrice, LocalDateTime closeDate, String desc) {
		this.startPrice = startPrice;
		this.reservePrice = reservePrice;
		this.closeDate = closeDate;
		status = 'O';
		currentHighest.SetAmount(this.startPrice);
		SetDescription(desc);
	}
	
	public void PlaceBid(){
		//Scanner bidder = new Scanner(System.in);
		
		System.out.println("Please enter a new bid for this item");
		System.out.println("Bid can be a maximum of 20% of the current highest bid");
		
		//double t_bid;
		
		double t_bid = AuctionSystem.cin.nextDouble();
		
		if(t_bid < currentHighest.GetAmount())
		{
			System.out.println("Error: Amount too low to make bid");
		}
		else if(t_bid > currentHighest.GetAmount())
		{
			double t_highest = currentHighest.GetAmount() * 1.2;
			if(t_bid > t_highest)
			{
				System.out.println("Bid too high");
			}
			else if(t_bid <= t_highest)
			{
				System.out.println("Bid placed, congratulations");
				currentHighest.SetAmount(t_bid);
				currentHighest.SetWhen(LocalDateTime.now());
			}
		}
		
		//bidder.close();
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
			System.out.println(GetDescription() + " closed");
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
		description.SetDescription(desc);
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
