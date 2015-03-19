package auction;

public abstract class User {

	protected String username;
	protected String password;
	
	public User(){

	}
	
	public Boolean CheckPassword(String pass){
		if(pass == password)
		{
			return true;
		}
		else if(pass != password)
		{
			return false;
		}
		
		return false;
		
	}
	
	public String GetUsername(){
		return username;
	}
}
