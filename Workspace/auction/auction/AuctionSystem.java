package auction;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import auction.User;

public class AuctionSystem {

	Scanner cin = new Scanner(System.in);
	
	static int arraySize = 10; //Temporary array size variable
	
	static Auction auctions = new Auction(5, 10, LocalDateTime.of(2014, 7, 15, 12, 30));
	
	static ArrayList<User> Buyers = new ArrayList<User>();
	static ArrayList<User> Sellers = new ArrayList<User>();
	
	public AuctionSystem() {
		User adminBuy = new Buyer("admin","changeme");

		Buyers.add(adminBuy);
		User adminSell = new Seller("admin","changeme");

		Sellers.add(adminSell);
		
		//Auction ChocBar = new Auction(5, 10, LocalDateTime.of(2014, 7, 15, 12, 30));
		
		String choice = null;
		
		while(choice != "4"){
			System.out.println("Please selection an option:");
			System.out.println("1. Create Auction");
			System.out.println("2. Register");
			System.out.println("3. Browse");
			System.out.println("4. Quit");
			System.out.println("0. Close expired auctions"); //Debug menu option
		
			choice = cin.next();
		
			switch(choice){
			case "1": //Login
				PlaceAuction();
				break;
			case "2": //Register
				SetupAccount();
				break;
			case "3": //Browse
				BrowseAuction();
				break;
			case "4": //Quit
				cin.close();
				System.exit(0);
			case "0": //Debug close expired auctions
				//TODO add calls to close in all existing auctions
				break;
			}
		}
	}
	
	public void PlaceAuction() {
		//No return type?
		System.out.println("Please enter your username");
		String pUser = cin.next();
		System.out.println("Please enter your password");
		String pPass = cin.next();
		String type = "selling";
		LogIn(pUser, pPass, type);
			
	}
	
	public void BrowseAuction() {
		//No return type: output to console
		//Note: Used by PlaceBid and Browsers, don't expect input
		
		System.out.println(AuctionSystem.auctions);
		//TODO fix me
	}
	
	public void SetupAccount() {
		//No return type: runs functions and input loop
	}
	
	public String LogIn(String pUser, String pPass, String type) {
		
		//if not empty user
		if(!pUser.isEmpty()){
		
			//if not empty password
			if(!pPass.isEmpty()){
				//get user
				//compare
				if(type == "selling")
					for(User s : Sellers);
				if(pUser == Sellers.iterator().next().GetUsername());
				{
					if(Sellers.iterator().next().CheckPassword(pPass))
						return pUser;
				}
				else if(type == "buying");
					for(User b : Buyers);
					if(pUser == Buyers.iterator().next().GetUsername());
					//if valid
					//checkPassword()
					
						//if true
		
					//else false
		
				//else false
		
			//else false
		
		//else false
		
		}}
		
		return "NULL";
		
	}
	
}
