package auction;

import auction.User;

public class Seller extends User implements Blockable {

	public Seller(String user, String pass){
		username = user;
		password = pass;		
	}
	
	public boolean IsBlocked(){
		return false;
		
	}
	
	public void SetBlocked(){
		
	}
}
