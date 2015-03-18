package auction;

import java.util.Scanner;

import auction.User;

public class AuctionSystem {

	Scanner cin = new Scanner(System.in);
	
	public AuctionSystem() {
		User adminBuy = new Buyer("admin","changeme");
		User adminSell = new Seller("admin","changeme");
		
		System.out.println("Please selection an option:");
		System.out.println("1. Login");
		System.out.println("2. Register");
		
		String choice;
		choice = cin.next();
		
		switch(choice){
		case "1": //Login
		case "2": //Register
			break;
		}
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
