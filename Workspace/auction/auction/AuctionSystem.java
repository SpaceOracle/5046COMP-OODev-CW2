package auction;

import auction.User;

public class AuctionSystem {

	public AuctionSystem() {
		User admin = new Buyer("admin","changeme");
		
		System.out.println("Please selection an option:");
		System.out.println("1. Login");
		System.out.println("2. Register");
	}
	
	public void PlaceAuction() {
		//No return type?
	}
	
	public void BrowseAuction() {
		//No return type: output to console
		//Note: Used by PlaceBid and Browsers, don't expect input
	}
	
	public void SetupAccount() {
		//No return type: runs functions and input loop
	}
	
}
