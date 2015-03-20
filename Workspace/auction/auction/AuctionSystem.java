package auction;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import auction.User;

public class AuctionSystem {

	Scanner cin = new Scanner(System.in);
	
	static int arraySize = 10; //Temporary array size variable
	
	//static Auction auctions = new Auction(5, 10, LocalDateTime.of(2014, 7, 15, 12, 30));
	
	static ArrayList<Auction> Auctions = new ArrayList<Auction>();
	
	static ArrayList<Buyer> Buyers = new ArrayList<Buyer>();
	static ArrayList<Seller> Sellers = new ArrayList<Seller>();
	
	public AuctionSystem() {
		User adminBuy = new Buyer("admin","changeme");

		Buyers.add((Buyer) adminBuy);
		User adminSell = new Seller("admin","changeme");
		User Number1 = new Seller("1","1");
		User Number2 = new Seller("2","2");

		Sellers.add((Seller) adminSell);
		Sellers.add((Seller) Number1);
		Sellers.add((Seller) Number2);
		
		Auction chocbar = new Auction(5.0, 10.0, LocalDateTime.of(2014, 7, 15, 12, 30));
		Auctions.add((Auction) chocbar);
		Auction toffee = new Auction(3.0, 10.0, LocalDateTime.of(2015, 9, 5, 12, 30));
		Auctions.add((Auction) toffee);
		Auction cookie = new Auction(7.0, 10.0, LocalDateTime.of(2015, 2, 9, 1, 30));
		Auctions.add((Auction) cookie);
		
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
				for(Auction a: Auctions)
				{
					a.Close();
				}
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
		if(LogIn(pUser, pPass, type) == pUser)
			{
			System.out.println("Login successful " + pUser);
			}
			else if (LogIn(pUser, pPass, type) == "NULL")
			{
				System.out.println("Login failed");
			}
			
	}
	
	public void BrowseAuction() {
		//No return type: output to console
		//Note: Used by PlaceBid and Browsers, don't expect input
		
		//System.out.println(AuctionSystem.auctions);
		//TODO fix me
		
		for(Auction a: Auctions)
		{
			if(a.GetStatus() == 'O')
			{
				System.out.println(a.GetDescription() + " " + a.GetHighest());
			}
		}
	}
	
	public void SetupAccount() {
		//No return type: runs functions and input loop
	}
	
	public String LogIn(String pUser, String pPass, String type) {
		
		//if not empty user
		if(!pUser.isEmpty())
		{
		
			//if not empty password
			if(!pPass.isEmpty())
			{
				//get user
				//compare
				if(type.equals("selling"))
				{
					for(Seller s : Sellers)
					{
					if(pUser.equals("admin"))
					{
						if(pPass.equals("changeme"))
						{
							return pUser;
						}
					}
					
					if(pUser.equals(s.GetUsername()))
				{
					if(pPass.equals(s.CheckPassword(pPass)))
						return pUser;
				}
				
					}
				}
				else if(type.equals("buying"));
					//for(Buyer b: Buyers);
					if(pUser.equals("admin"))
					{
						if(pPass.equals("changeme"))
						{
							return pUser;
						}
					}				
					/*if(pUser == Buyers.iterator().next().GetUsername());
					{
						if(Buyers.iterator().next().CheckPassword(pPass))
							return pUser;
					}
					*/
					
			}
					//if valid
					//checkPassword()
					
						//if true
		
					//else false
		
				//else false
		
			//else false
		
		//else false
		
		}
		
		return "NULL";
		
	}
	
}
