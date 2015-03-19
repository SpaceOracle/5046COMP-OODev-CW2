package auction;

import java.time.LocalDateTime;
import java.util.Scanner;

import auction.User;

public class AuctionSystem {

	Scanner cin = new Scanner(System.in);
	
	static Auction ChocBar = new Auction(5, 10, LocalDateTime.of(2014, 7, 15, 12, 30));
	
	public AuctionSystem() {
		User adminBuy = new Buyer("admin","changeme");
		User adminSell = new Seller("admin","changeme");
		
		//Auction ChocBar = new Auction(5, 10, LocalDateTime.of(2014, 7, 15, 12, 30));
		
		String choice = null;
		
		while(choice != "4"){
			System.out.println("Please selection an option:");
			System.out.println("1. Login");
			System.out.println("2. Register");
			System.out.println("3. Browse");
			System.out.println("4. Quit");
		
			choice = cin.next();
		
			switch(choice){
			case "1": //Login
				LogIn();
				break;
			case "2": //Register
				SetupAccount();
				break;
			case "3": //Browse
				BrowseAuction();
				break;
			case "4": //Quit
				System.exit(0);
			}
		}
	}
	
	public void PlaceAuction() {
		//No return type?
	}
	
	public void BrowseAuction() {
		//No return type: output to console
		//Note: Used by PlaceBid and Browsers, don't expect input
		System.out.println(AuctionSystem.ChocBar);
	}
	
	public void SetupAccount() {
		//No return type: runs functions and input loop
	}
	
	public void LogIn() {
		
	}
	
}
