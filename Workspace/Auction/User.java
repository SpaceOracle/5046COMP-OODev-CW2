package Auction;

public abstract class User {

	public User(string pusername, string  ppassword){
		username = pusername;
		password = ppassword;
	}
	
	protected string username;
	protected string password;
	
	public bool CheckPassword(){
		
	}
}
