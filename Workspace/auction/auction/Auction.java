package auction;

import java.time.LocalDateTime;

public class Auction implements Blockable {

	private double startPrice, reservePrice, currentPrice;
	private LocalDateTime closeDate;
	private char status;
	
	public Auction(double startPrice, double reservePrice, LocalDateTime closeDate) {
		this.startPrice = startPrice;
		this.reservePrice = reservePrice;
		this.closeDate = closeDate;
		status = 'O';
		currentPrice = this.startPrice;
	}
	
	public void PlaceBid(){
		
	}
	
	public void Verify(){
		if(status == 'C'){
			System.out.println("This auction is no longer available, please try a different auction");
		}
		else if(status == 'O')
		{
			System.out.println("Auction verified, bid placed");
		}
	}
	
	public void Close(){
		if(closeDate.isBefore(LocalDateTime.now()) && (status == 'O')){
			char status = 'C';
		}
		else{
			
		}
	}
	
	public boolean IsBlocked(){
		return false;
	}
	
	public void SetBlocked(){
		
	}
}
